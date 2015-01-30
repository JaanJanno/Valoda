package controllers.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import parser.antlr4.gen.ValodaLexer;
import parser.antlr4.gen.ValodaParser;
import parser.antlr4.gen.ValodaParser.DesmitContext;
import parser.antlr4.gen.ValodaParser.DesmitLContext;
import parser.antlr4.gen.ValodaParser.DesmitRContext;
import parser.antlr4.gen.ValodaParser.NulleContext;
import parser.antlr4.gen.ValodaParser.OneDigitContext;
import parser.antlr4.gen.ValodaParser.OneDigitNumContext;
import parser.antlr4.gen.ValodaParser.PadsmitContext;
import parser.antlr4.gen.ValodaParser.SimtContext;
import parser.antlr4.gen.ValodaParser.SimtLContext;
import parser.antlr4.gen.ValodaParser.SimtLRContext;
import parser.antlr4.gen.ValodaParser.SimtRContext;
import parser.antlr4.gen.ValodaParser.SimtiContext;
import parser.antlr4.gen.ValodaParser.ThousandNumContext;
import parser.antlr4.gen.ValodaParser.ThreeDigitContext;
import parser.antlr4.gen.ValodaParser.TriDigitNumContext;
import parser.antlr4.gen.ValodaParser.TukstosContext;
import parser.antlr4.gen.ValodaParser.TukstosDesmitContext;
import parser.antlr4.gen.ValodaParser.TukstosDesmitMultiContext;
import parser.antlr4.gen.ValodaParser.TukstosDesmitMultiRContext;
import parser.antlr4.gen.ValodaParser.TukstosDesmitRContext;
import parser.antlr4.gen.ValodaParser.TukstosPadsmitContext;
import parser.antlr4.gen.ValodaParser.TukstosPadsmitRContext;
import parser.antlr4.gen.ValodaParser.TukstosPreContext;
import parser.antlr4.gen.ValodaParser.TukstosPreRContext;
import parser.antlr4.gen.ValodaParser.TukstosRContext;
import parser.antlr4.gen.ValodaParser.TukstosSimtContext;
import parser.antlr4.gen.ValodaParser.TukstosSimtMultiContext;
import parser.antlr4.gen.ValodaParser.TukstosSimtMultiRContext;
import parser.antlr4.gen.ValodaParser.TukstosSimtRContext;
import parser.antlr4.gen.ValodaParser.TukstosiContext;
import parser.antlr4.gen.ValodaParser.TukstosiRContext;
import parser.antlr4.gen.ValodaParser.TukstotisContext;
import parser.antlr4.gen.ValodaParser.TwoDigitContext;
import parser.antlr4.gen.ValodaParser.TwoDigitNumContext;

public class Parsers {

	public static ParseTree parseNumberAsTree(String number) {
		ANTLRInputStream antlrInput = new ANTLRInputStream(number);
		ValodaLexer lexer = new ValodaLexer(antlrInput);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ValodaParser parser = new ValodaParser(tokens);
		ParseTree tree = parser.number();
		return tree;
	}

	public static int parseNumberAsInt(String number) {
		ParseTree tree = parseNumberAsTree(number);
		if (tree instanceof NulleContext)
			return 0;
		else if (tree instanceof OneDigitNumContext)
			return parseOneDigit(tree.getChild(0));
		else if (tree instanceof TwoDigitNumContext)
			return parseTwoDigit(tree.getChild(0));
		else if (tree instanceof TriDigitNumContext)
			return parseThreeDigit(tree.getChild(0));
		else if (tree instanceof ThousandNumContext)
			return parseThousands(tree.getChild(0));
		else
			throw new RuntimeException("Invalid number format.");
	}

	private static int parseThousands(ParseTree tree) {
		if (tree instanceof TukstosContext)
			return 1000;
		else if (tree instanceof TukstotisContext)
			return 1000;
		else if (tree instanceof TukstosRContext)
			return 1000 + parsePrePostNum(tree.getChild(2));
		else if (tree instanceof TukstosPreContext)
			return 1000 * parsePreDigit(tree.getChild(0));
		else if (tree instanceof TukstosPreRContext)
			return 1000 * parsePreDigit(tree.getChild(0))
					+ parsePrePostNum(tree.getChild(3));
		else if (tree instanceof TukstosiContext)
			return 1000 * parsePrePostNum(tree.getChild(0));
		else if (tree instanceof TukstosiRContext)
			return 1000 * parsePrePostNum(tree.getChild(0))
					+ parsePrePostNum(tree.getChild(4));
		
		else if (tree instanceof TukstosDesmitContext)
			return 10000;
		else if (tree instanceof TukstosPadsmitContext)
			return 10000 + 1000 * parsePreDigit(tree.getChild(0));
		else if (tree instanceof TukstosDesmitMultiContext)
			return 10000 * parsePreDigit(tree.getChild(0));
		else if (tree instanceof TukstosSimtContext)
			return 100000;
		else if (tree instanceof TukstosSimtMultiContext)
			return 100000 * parsePreDigit(tree.getChild(0));
		
		else if (tree instanceof TukstosDesmitRContext)
			return 10000 + parsePrePostNum(tree.getChild(3));
		else if (tree instanceof TukstosPadsmitRContext)
			return 10000 + 1000 * parsePreDigit(tree.getChild(0)) + parsePrePostNum(tree.getChild(4));
		else if (tree instanceof TukstosDesmitMultiRContext)
			return 10000 * parsePreDigit(tree.getChild(0)) + parsePrePostNum(tree.getChild(4));
		else if (tree instanceof TukstosSimtRContext)
			return 100000 + parsePrePostNum(tree.getChild(3));
		else if (tree instanceof TukstosSimtMultiRContext)
			return 100000 * parsePreDigit(tree.getChild(0)) + parsePrePostNum(tree.getChild(4));
		return 0;
	}

	private static int parsePrePostNum(ParseTree parent) {
		ParseTree tree = parent.getChild(0);
		if (tree instanceof TwoDigitContext)
			return parseTwoDigit(tree);
		else if (tree instanceof ThreeDigitContext)
			return parseThreeDigit(tree);
		else
			return parseOneDigit(tree);
	}

	private static int parseThreeDigit(ParseTree tree) {
		if (tree instanceof SimtContext)
			return 100;
		else if (tree instanceof SimtLContext)
			return 100 * parsePreDigit(tree.getChild(0));
		else if (tree instanceof SimtRContext)
			return 100 + parseSimtR(tree.getChild(2));
		else if (tree instanceof SimtLRContext)
			return 100 * parsePreDigit(tree.getChild(0))
					+ parseSimtR(tree.getChild(3));
		else if (tree instanceof SimtiContext)
			return 100 * parsePreDigit(tree.getChild(0));

		else
			// if (tree instanceof SimtiRContext)
			return 100 * parsePreDigit(tree.getChild(0))
					+ parseSimtR(tree.getChild(4));
	}

	private static int parseSimtR(ParseTree tree) {
		if (tree instanceof OneDigitContext)
			return parseNumberAsInt(tree.getText());
		else
			return parseTwoDigit(tree);
	}

	private static int parseTwoDigit(ParseTree tree) {
		if (tree instanceof PadsmitContext)
			return parsePadsmit((PadsmitContext) tree);
		else
			return parseDesmit(tree);
	}

	private static int parsePadsmit(PadsmitContext tree) {
		return 10 + parsePreDigit(tree.getChild(0));
	}

	private static int parseDesmit(ParseTree tree) {
		if (tree instanceof DesmitContext)
			return 10;
		else if (tree instanceof DesmitLContext)
			return 10 * parsePreDigit(tree.getChild(0));
		else if (tree instanceof DesmitRContext)
			return 10 + parseOneDigit(tree.getChild(1));
		else
			// if (tree instanceof DesmitLRContext)
			return 10 * parsePreDigit(tree.getChild(0))
					+ parseOneDigit(tree.getChild(3));
	}

	private static int parsePreDigit(ParseTree tree) {
		switch (tree.getText()) {
		case "vien":
			return 1;
		case "div":
			return 2;
		case "trīs":
			return 3;
		case "četr":
			return 4;
		case "piec":
			return 5;
		case "seš":
			return 6;
		case "septiņ":
			return 7;
		case "astoņ":
			return 8;
		case "deviņ":
			return 9;
		default:
			throw new RuntimeException("Invalid number format.");
		}
	}

	private static int parseOneDigit(ParseTree tree) {
		switch (tree.getText()) {
		case "viens":
			return 1;
		case "divi":
			return 2;
		case "trīs":
			return 3;
		case "četri":
			return 4;
		case "pieci":
			return 5;
		case "seši":
			return 6;
		case "septiņi":
			return 7;
		case "astoņi":
			return 8;
		case "deviņi":
			return 9;
		default:
			throw new RuntimeException("Invalid number format.");
		}
	}
}
