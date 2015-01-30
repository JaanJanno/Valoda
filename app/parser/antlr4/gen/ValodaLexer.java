// Generated from Valoda.g4 by ANTLR 4.4

	package parser.antlr4.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValodaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, Digit=13, PreDigit=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Digit", "PreDigit", "WS"
	};


	public ValodaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Valoda.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0094\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\6\20\u00b7\n\20\r\20\16"+
		"\20\u00b8\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21\3\2\3\4\2\13\f\17\17\u00c8\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7)\3\2\2"+
		"\2\t.\3\2\2\2\13\66\3\2\2\2\r<\3\2\2\2\17A\3\2\2\2\21G\3\2\2\2\23N\3\2"+
		"\2\2\25V\3\2\2\2\27`\3\2\2\2\31i\3\2\2\2\33\u0093\3\2\2\2\35\u00b3\3\2"+
		"\2\2\37\u00b6\3\2\2\2!\"\7\"\2\2\"\4\3\2\2\2#$\7u\2\2$%\7k\2\2%&\7o\2"+
		"\2&\'\7v\2\2\'(\7k\2\2(\6\3\2\2\2)*\7x\2\2*+\7k\2\2+,\7g\2\2,-\7p\2\2"+
		"-\b\3\2\2\2./\7r\2\2/\60\7c\2\2\60\61\7f\2\2\61\62\7u\2\2\62\63\7o\2\2"+
		"\63\64\7k\2\2\64\65\7v\2\2\65\n\3\2\2\2\66\67\7x\2\2\678\7k\2\289\7g\2"+
		"\29:\7p\2\2:;\7u\2\2;\f\3\2\2\2<=\7u\2\2=>\7k\2\2>?\7o\2\2?@\7v\2\2@\16"+
		"\3\2\2\2AB\7p\2\2BC\7w\2\2CD\7n\2\2DE\7n\2\2EF\7g\2\2F\20\3\2\2\2GH\7"+
		"f\2\2HI\7g\2\2IJ\7u\2\2JK\7o\2\2KL\7k\2\2LM\7v\2\2M\22\3\2\2\2NO\7v\2"+
		"\2OP\7\u016d\2\2PQ\7m\2\2QR\7u\2\2RS\7v\2\2ST\7q\2\2TU\7\u0163\2\2U\24"+
		"\3\2\2\2VW\7v\2\2WX\7\u016d\2\2XY\7m\2\2YZ\7u\2\2Z[\7v\2\2[\\\7q\2\2\\"+
		"]\7v\2\2]^\7k\2\2^_\7u\2\2_\26\3\2\2\2`a\7v\2\2ab\7\u016d\2\2bc\7m\2\2"+
		"cd\7u\2\2de\7v\2\2ef\7q\2\2fg\7\u0163\2\2gh\7k\2\2h\30\3\2\2\2ij\7v\2"+
		"\2jk\7t\2\2kl\7\u012d\2\2lm\7u\2\2m\32\3\2\2\2no\7f\2\2op\7k\2\2pq\7x"+
		"\2\2q\u0094\7k\2\2rs\7\u010f\2\2st\7g\2\2tu\7v\2\2uv\7t\2\2v\u0094\7k"+
		"\2\2wx\7r\2\2xy\7k\2\2yz\7g\2\2z{\7e\2\2{\u0094\7k\2\2|}\7u\2\2}~\7g\2"+
		"\2~\177\7\u0163\2\2\177\u0094\7k\2\2\u0080\u0081\7u\2\2\u0081\u0082\7"+
		"g\2\2\u0082\u0083\7r\2\2\u0083\u0084\7v\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7\u0148\2\2\u0086\u0094\7k\2\2\u0087\u0088\7c\2\2\u0088\u0089\7u\2\2"+
		"\u0089\u008a\7v\2\2\u008a\u008b\7q\2\2\u008b\u008c\7\u0148\2\2\u008c\u0094"+
		"\7k\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7x\2\2\u0090"+
		"\u0091\7k\2\2\u0091\u0092\7\u0148\2\2\u0092\u0094\7k\2\2\u0093n\3\2\2"+
		"\2\u0093r\3\2\2\2\u0093w\3\2\2\2\u0093|\3\2\2\2\u0093\u0080\3\2\2\2\u0093"+
		"\u0087\3\2\2\2\u0093\u008d\3\2\2\2\u0094\34\3\2\2\2\u0095\u0096\7f\2\2"+
		"\u0096\u0097\7k\2\2\u0097\u00b4\7x\2\2\u0098\u0099\7\u010f\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7v\2\2\u009b\u00b4\7t\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7g\2\2\u009f\u00b4\7e\2\2\u00a0\u00a1\7u\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\u00b4\7\u0163\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7r\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00b4\7\u0148\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7q\2\2\u00ad\u00b4\7\u0148\2\2\u00ae\u00af\7f\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b4\7\u0148"+
		"\2\2\u00b3\u0095\3\2\2\2\u00b3\u0098\3\2\2\2\u00b3\u009c\3\2\2\2\u00b3"+
		"\u00a0\3\2\2\2\u00b3\u00a3\3\2\2\2\u00b3\u00a9\3\2\2\2\u00b3\u00ae\3\2"+
		"\2\2\u00b4\36\3\2\2\2\u00b5\u00b7\t\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\b\20\2\2\u00bb \3\2\2\2\6\2\u0093\u00b3\u00b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}