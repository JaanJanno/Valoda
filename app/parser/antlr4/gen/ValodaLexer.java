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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Digit=12, PreDigit=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Digit", "PreDigit", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0088\n\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00a8\n\16\3\17\6\17\u00ab\n\17\r\17\16\17\u00ac\3\17\3\17\2"+
		"\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\3\2\3\4\2\13\f\17\17\u00bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		"\37\3\2\2\2\5!\3\2\2\2\7\'\3\2\2\2\t,\3\2\2\2\13\64\3\2\2\2\r:\3\2\2\2"+
		"\17?\3\2\2\2\21E\3\2\2\2\23L\3\2\2\2\25T\3\2\2\2\27]\3\2\2\2\31\u0087"+
		"\3\2\2\2\33\u00a7\3\2\2\2\35\u00aa\3\2\2\2\37 \7\"\2\2 \4\3\2\2\2!\"\7"+
		"u\2\2\"#\7k\2\2#$\7o\2\2$%\7v\2\2%&\7k\2\2&\6\3\2\2\2\'(\7x\2\2()\7k\2"+
		"\2)*\7g\2\2*+\7p\2\2+\b\3\2\2\2,-\7r\2\2-.\7c\2\2./\7f\2\2/\60\7u\2\2"+
		"\60\61\7o\2\2\61\62\7k\2\2\62\63\7v\2\2\63\n\3\2\2\2\64\65\7x\2\2\65\66"+
		"\7k\2\2\66\67\7g\2\2\678\7p\2\289\7u\2\29\f\3\2\2\2:;\7u\2\2;<\7k\2\2"+
		"<=\7o\2\2=>\7v\2\2>\16\3\2\2\2?@\7p\2\2@A\7w\2\2AB\7n\2\2BC\7n\2\2CD\7"+
		"g\2\2D\20\3\2\2\2EF\7f\2\2FG\7g\2\2GH\7u\2\2HI\7o\2\2IJ\7k\2\2JK\7v\2"+
		"\2K\22\3\2\2\2LM\7v\2\2MN\7\u016d\2\2NO\7m\2\2OP\7u\2\2PQ\7v\2\2QR\7q"+
		"\2\2RS\7\u0163\2\2S\24\3\2\2\2TU\7v\2\2UV\7\u016d\2\2VW\7m\2\2WX\7u\2"+
		"\2XY\7v\2\2YZ\7q\2\2Z[\7\u0163\2\2[\\\7k\2\2\\\26\3\2\2\2]^\7v\2\2^_\7"+
		"t\2\2_`\7\u012d\2\2`a\7u\2\2a\30\3\2\2\2bc\7f\2\2cd\7k\2\2de\7x\2\2e\u0088"+
		"\7k\2\2fg\7\u010f\2\2gh\7g\2\2hi\7v\2\2ij\7t\2\2j\u0088\7k\2\2kl\7r\2"+
		"\2lm\7k\2\2mn\7g\2\2no\7e\2\2o\u0088\7k\2\2pq\7u\2\2qr\7g\2\2rs\7\u0163"+
		"\2\2s\u0088\7k\2\2tu\7u\2\2uv\7g\2\2vw\7r\2\2wx\7v\2\2xy\7k\2\2yz\7\u0148"+
		"\2\2z\u0088\7k\2\2{|\7c\2\2|}\7u\2\2}~\7v\2\2~\177\7q\2\2\177\u0080\7"+
		"\u0148\2\2\u0080\u0088\7k\2\2\u0081\u0082\7f\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7x\2\2\u0084\u0085\7k\2\2\u0085\u0086\7\u0148\2\2\u0086\u0088\7"+
		"k\2\2\u0087b\3\2\2\2\u0087f\3\2\2\2\u0087k\3\2\2\2\u0087p\3\2\2\2\u0087"+
		"t\3\2\2\2\u0087{\3\2\2\2\u0087\u0081\3\2\2\2\u0088\32\3\2\2\2\u0089\u008a"+
		"\7f\2\2\u008a\u008b\7k\2\2\u008b\u00a8\7x\2\2\u008c\u008d\7\u010f\2\2"+
		"\u008d\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u00a8\7t\2\2\u0090\u0091"+
		"\7r\2\2\u0091\u0092\7k\2\2\u0092\u0093\7g\2\2\u0093\u00a8\7e\2\2\u0094"+
		"\u0095\7u\2\2\u0095\u0096\7g\2\2\u0096\u00a8\7\u0163\2\2\u0097\u0098\7"+
		"u\2\2\u0098\u0099\7g\2\2\u0099\u009a\7r\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u00a8\7\u0148\2\2\u009d\u009e\7c\2\2\u009e\u009f\7u\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a8\7\u0148\2\2\u00a2\u00a3"+
		"\7f\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7x\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a8\7\u0148\2\2\u00a7\u0089\3\2\2\2\u00a7\u008c\3\2\2\2\u00a7\u0090"+
		"\3\2\2\2\u00a7\u0094\3\2\2\2\u00a7\u0097\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a8\34\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\b\17\2\2\u00af\36\3\2\2\2\6\2\u0087\u00a7\u00ac\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}