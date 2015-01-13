// Generated from Valoda.g4 by ANTLR 4.4

	package parser.antlr4.gen;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ValodaParser}.
 */
public interface ValodaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code PreTwoDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void enterPreTwoDigited(@NotNull ValodaParser.PreTwoDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreTwoDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void exitPreTwoDigited(@NotNull ValodaParser.PreTwoDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tukstosi}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void enterTukstosi(@NotNull ValodaParser.TukstosiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tukstosi}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void exitTukstosi(@NotNull ValodaParser.TukstosiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tukstos}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void enterTukstos(@NotNull ValodaParser.TukstosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tukstos}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void exitTukstos(@NotNull ValodaParser.TukstosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostTwoDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostTwoDigited(@NotNull ValodaParser.PostTwoDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostTwoDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostTwoDigited(@NotNull ValodaParser.PostTwoDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simt}
	 * labeled alternative in {@link ValodaParser#threeDigit}.
	 * @param ctx the parse tree
	 */
	void enterSimt(@NotNull ValodaParser.SimtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simt}
	 * labeled alternative in {@link ValodaParser#threeDigit}.
	 * @param ctx the parse tree
	 */
	void exitSimt(@NotNull ValodaParser.SimtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThousandNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterThousandNum(@NotNull ValodaParser.ThousandNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThousandNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitThousandNum(@NotNull ValodaParser.ThousandNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostOneDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostOneDigited(@NotNull ValodaParser.PostOneDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostOneDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostOneDigited(@NotNull ValodaParser.PostOneDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreOneDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void enterPreOneDigited(@NotNull ValodaParser.PreOneDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreOneDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void exitPreOneDigited(@NotNull ValodaParser.PreOneDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTwoDigitNum(@NotNull ValodaParser.TwoDigitNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTwoDigitNum(@NotNull ValodaParser.TwoDigitNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreTriDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void enterPreTriDigited(@NotNull ValodaParser.PreTriDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreTriDigited}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void exitPreTriDigited(@NotNull ValodaParser.PreTriDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nulle}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNulle(@NotNull ValodaParser.NulleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nulle}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNulle(@NotNull ValodaParser.NulleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostTriDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostTriDigited(@NotNull ValodaParser.PostTriDigitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostTriDigited}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostTriDigited(@NotNull ValodaParser.PostTriDigitedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TukstosPre}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void enterTukstosPre(@NotNull ValodaParser.TukstosPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TukstosPre}
	 * labeled alternative in {@link ValodaParser#thousands}.
	 * @param ctx the parse tree
	 */
	void exitTukstosPre(@NotNull ValodaParser.TukstosPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TriDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTriDigitNum(@NotNull ValodaParser.TriDigitNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TriDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTriDigitNum(@NotNull ValodaParser.TriDigitNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OneDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void enterOneDigitNum(@NotNull ValodaParser.OneDigitNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OneDigitNum}
	 * labeled alternative in {@link ValodaParser#number}.
	 * @param ctx the parse tree
	 */
	void exitOneDigitNum(@NotNull ValodaParser.OneDigitNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostOne}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostOne(@NotNull ValodaParser.PostOneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostOne}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostOne(@NotNull ValodaParser.PostOneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Padsmit}
	 * labeled alternative in {@link ValodaParser#twoDigit}.
	 * @param ctx the parse tree
	 */
	void enterPadsmit(@NotNull ValodaParser.PadsmitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Padsmit}
	 * labeled alternative in {@link ValodaParser#twoDigit}.
	 * @param ctx the parse tree
	 */
	void exitPadsmit(@NotNull ValodaParser.PadsmitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Desmit}
	 * labeled alternative in {@link ValodaParser#twoDigit}.
	 * @param ctx the parse tree
	 */
	void enterDesmit(@NotNull ValodaParser.DesmitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Desmit}
	 * labeled alternative in {@link ValodaParser#twoDigit}.
	 * @param ctx the parse tree
	 */
	void exitDesmit(@NotNull ValodaParser.DesmitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreThree}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void enterPreThree(@NotNull ValodaParser.PreThreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreThree}
	 * labeled alternative in {@link ValodaParser#preNumber}.
	 * @param ctx the parse tree
	 */
	void exitPreThree(@NotNull ValodaParser.PreThreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValodaParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(@NotNull ValodaParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValodaParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(@NotNull ValodaParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simti}
	 * labeled alternative in {@link ValodaParser#threeDigit}.
	 * @param ctx the parse tree
	 */
	void enterSimti(@NotNull ValodaParser.SimtiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simti}
	 * labeled alternative in {@link ValodaParser#threeDigit}.
	 * @param ctx the parse tree
	 */
	void exitSimti(@NotNull ValodaParser.SimtiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostThree}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void enterPostThree(@NotNull ValodaParser.PostThreeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostThree}
	 * labeled alternative in {@link ValodaParser#postNumber}.
	 * @param ctx the parse tree
	 */
	void exitPostThree(@NotNull ValodaParser.PostThreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ValodaParser#oneDigit}.
	 * @param ctx the parse tree
	 */
	void enterOneDigit(@NotNull ValodaParser.OneDigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ValodaParser#oneDigit}.
	 * @param ctx the parse tree
	 */
	void exitOneDigit(@NotNull ValodaParser.OneDigitContext ctx);
}