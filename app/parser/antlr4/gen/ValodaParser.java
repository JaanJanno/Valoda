// Generated from Valoda.g4 by ANTLR 4.4

	package parser.antlr4.gen;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValodaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, Digit=13, PreDigit=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'simti'", "'vien'", "'padsmit'", "'viens'", "'simt'", 
		"'nulle'", "'desmit'", "'tūkstoš'", "'tūkstotis'", "'tūkstoši'", "'trīs'", 
		"Digit", "PreDigit", "WS"
	};
	public static final int
		RULE_word = 0, RULE_number = 1, RULE_thousands = 2, RULE_postNumber = 3, 
		RULE_preNumber = 4, RULE_threeDigit = 5, RULE_twoDigit = 6, RULE_oneDigit = 7;
	public static final String[] ruleNames = {
		"word", "number", "thousands", "postNumber", "preNumber", "threeDigit", 
		"twoDigit", "oneDigit"
	};

	@Override
	public String getGrammarFileName() { return "Valoda.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValodaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class WordContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ValodaParser.EOF, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); number();
			setState(17); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NulleContext extends NumberContext {
		public NulleContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterNulle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitNulle(this);
		}
	}
	public static class TriDigitNumContext extends NumberContext {
		public ThreeDigitContext threeDigit() {
			return getRuleContext(ThreeDigitContext.class,0);
		}
		public TriDigitNumContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTriDigitNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTriDigitNum(this);
		}
	}
	public static class OneDigitNumContext extends NumberContext {
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public OneDigitNumContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterOneDigitNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitOneDigitNum(this);
		}
	}
	public static class ThousandNumContext extends NumberContext {
		public ThousandsContext thousands() {
			return getRuleContext(ThousandsContext.class,0);
		}
		public ThousandNumContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterThousandNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitThousandNum(this);
		}
	}
	public static class TwoDigitNumContext extends NumberContext {
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public TwoDigitNumContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTwoDigitNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTwoDigitNum(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_number);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new NulleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19); match(T__5);
				}
				break;
			case 2:
				_localctx = new OneDigitNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20); oneDigit();
				}
				break;
			case 3:
				_localctx = new TwoDigitNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(21); twoDigit();
				}
				break;
			case 4:
				_localctx = new TriDigitNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(22); threeDigit();
				}
				break;
			case 5:
				_localctx = new ThousandNumContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(23); thousands();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThousandsContext extends ParserRuleContext {
		public ThousandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thousands; }
	 
		public ThousandsContext() { }
		public void copyFrom(ThousandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TukstosSimtMultiRContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosSimtMultiRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosSimtMultiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosSimtMultiR(this);
		}
	}
	public static class TukstosiContext extends ThousandsContext {
		public PreNumberContext preNumber() {
			return getRuleContext(PreNumberContext.class,0);
		}
		public TukstosiContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosi(this);
		}
	}
	public static class TukstosSimtRContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosSimtRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosSimtR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosSimtR(this);
		}
	}
	public static class TukstosContext extends ThousandsContext {
		public TukstosContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstos(this);
		}
	}
	public static class TukstosSimtMultiContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public TukstosSimtMultiContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosSimtMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosSimtMulti(this);
		}
	}
	public static class TukstosDesmitMultiRContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosDesmitMultiRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosDesmitMultiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosDesmitMultiR(this);
		}
	}
	public static class TukstosSimtContext extends ThousandsContext {
		public TukstosSimtContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosSimt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosSimt(this);
		}
	}
	public static class TukstosPadsmitContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public TukstosPadsmitContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosPadsmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosPadsmit(this);
		}
	}
	public static class TukstosPadsmitRContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosPadsmitRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosPadsmitR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosPadsmitR(this);
		}
	}
	public static class TukstosiRContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public PreNumberContext preNumber() {
			return getRuleContext(PreNumberContext.class,0);
		}
		public TukstosiRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosiR(this);
		}
	}
	public static class TukstosPreContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public TukstosPreContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosPre(this);
		}
	}
	public static class TukstosDesmitContext extends ThousandsContext {
		public TukstosDesmitContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosDesmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosDesmit(this);
		}
	}
	public static class TukstosDesmitMultiContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public TukstosDesmitMultiContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosDesmitMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosDesmitMulti(this);
		}
	}
	public static class TukstosRContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosR(this);
		}
	}
	public static class TukstotisContext extends ThousandsContext {
		public TukstotisContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstotis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstotis(this);
		}
	}
	public static class TukstosPreRContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosPreRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosPreR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosPreR(this);
		}
	}
	public static class TukstosDesmitRContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
		public TukstosDesmitRContext(ThousandsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterTukstosDesmitR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitTukstosDesmitR(this);
		}
	}

	public final ThousandsContext thousands() throws RecognitionException {
		ThousandsContext _localctx = new ThousandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_thousands);
		int _la;
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new TukstosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26); match(T__3);
				}
				break;
			case 2:
				_localctx = new TukstotisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27); match(T__2);
				}
				break;
			case 3:
				_localctx = new TukstosRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28); match(T__3);
				{
				setState(29); match(T__11);
				setState(30); postNumber();
				}
				}
				break;
			case 4:
				_localctx = new TukstosPreContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(31); match(PreDigit);
				setState(32); match(T__3);
				}
				break;
			case 5:
				_localctx = new TukstosPreRContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(33); match(PreDigit);
				setState(34); match(T__3);
				{
				setState(35); match(T__11);
				setState(36); postNumber();
				}
				}
				break;
			case 6:
				_localctx = new TukstosDesmitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(37); match(T__4);
				setState(38); match(T__3);
				}
				break;
			case 7:
				_localctx = new TukstosPadsmitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__0) | (1L << PreDigit))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(40); match(T__8);
				setState(41); match(T__3);
				}
				break;
			case 8:
				_localctx = new TukstosDesmitMultiContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(43); match(T__4);
				setState(44); match(T__3);
				}
				break;
			case 9:
				_localctx = new TukstosSimtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(45); match(T__6);
				setState(46); match(T__3);
				}
				break;
			case 10:
				_localctx = new TukstosSimtMultiContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(48); match(T__6);
				setState(49); match(T__3);
				}
				break;
			case 11:
				_localctx = new TukstosDesmitRContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(50); match(T__4);
				setState(51); match(T__3);
				{
				setState(52); match(T__11);
				setState(53); postNumber();
				}
				}
				break;
			case 12:
				_localctx = new TukstosPadsmitRContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(54);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__0) | (1L << PreDigit))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(55); match(T__8);
				setState(56); match(T__3);
				{
				setState(57); match(T__11);
				setState(58); postNumber();
				}
				}
				break;
			case 13:
				_localctx = new TukstosDesmitMultiRContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(59);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(60); match(T__4);
				setState(61); match(T__3);
				{
				setState(62); match(T__11);
				setState(63); postNumber();
				}
				}
				break;
			case 14:
				_localctx = new TukstosSimtRContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(64); match(T__6);
				setState(65); match(T__3);
				{
				setState(66); match(T__11);
				setState(67); postNumber();
				}
				}
				break;
			case 15:
				_localctx = new TukstosSimtMultiRContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(69); match(T__6);
				setState(70); match(T__3);
				{
				setState(71); match(T__11);
				setState(72); postNumber();
				}
				}
				break;
			case 16:
				_localctx = new TukstosiContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(73); preNumber();
				setState(74); match(T__11);
				setState(75); match(T__1);
				}
				break;
			case 17:
				_localctx = new TukstosiRContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(77); preNumber();
				setState(78); match(T__11);
				setState(79); match(T__1);
				{
				setState(80); match(T__11);
				setState(81); postNumber();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostNumberContext extends ParserRuleContext {
		public ThreeDigitContext threeDigit() {
			return getRuleContext(ThreeDigitContext.class,0);
		}
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public PostNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostNumber(this);
		}
	}

	public final PostNumberContext postNumber() throws RecognitionException {
		PostNumberContext _localctx = new PostNumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_postNumber);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); threeDigit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); twoDigit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); match(Digit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88); match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89); match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreNumberContext extends ParserRuleContext {
		public ThreeDigitContext threeDigit() {
			return getRuleContext(ThreeDigitContext.class,0);
		}
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public PreNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPreNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPreNumber(this);
		}
	}

	public final PreNumberContext preNumber() throws RecognitionException {
		PreNumberContext _localctx = new PreNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preNumber);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); threeDigit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); twoDigit();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); match(Digit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThreeDigitContext extends ParserRuleContext {
		public ThreeDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threeDigit; }
	 
		public ThreeDigitContext() { }
		public void copyFrom(ThreeDigitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimtRContext extends ThreeDigitContext {
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public SimtRContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimtR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimtR(this);
		}
	}
	public static class SimtContext extends ThreeDigitContext {
		public SimtContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimt(this);
		}
	}
	public static class SimtLRContext extends ThreeDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public SimtLRContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimtLR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimtLR(this);
		}
	}
	public static class SimtLContext extends ThreeDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public SimtLContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimtL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimtL(this);
		}
	}
	public static class SimtiContext extends ThreeDigitContext {
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public SimtiContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimti(this);
		}
	}
	public static class SimtiRContext extends ThreeDigitContext {
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public SimtiRContext(ThreeDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterSimtiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitSimtiR(this);
		}
	}

	public final ThreeDigitContext threeDigit() throws RecognitionException {
		ThreeDigitContext _localctx = new ThreeDigitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_threeDigit);
		int _la;
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new SimtLRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); match(T__6);
				{
				setState(100); match(T__11);
				setState(103);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(101); twoDigit();
					}
					break;
				case 2:
					{
					setState(102); oneDigit();
					}
					break;
				}
				}
				}
				break;
			case 2:
				_localctx = new SimtLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(106); match(T__6);
				}
				break;
			case 3:
				_localctx = new SimtRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(107); match(T__6);
				{
				setState(108); match(T__11);
				setState(111);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(109); twoDigit();
					}
					break;
				case 2:
					{
					setState(110); oneDigit();
					}
					break;
				}
				}
				}
				break;
			case 4:
				_localctx = new SimtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113); match(T__6);
				}
				break;
			case 5:
				_localctx = new SimtiRContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==Digit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(115); match(T__11);
				setState(116); match(T__10);
				{
				setState(117); match(T__11);
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(118); twoDigit();
					}
					break;
				case 2:
					{
					setState(119); oneDigit();
					}
					break;
				}
				}
				}
				break;
			case 6:
				_localctx = new SimtiContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==Digit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(123); match(T__11);
				setState(124); match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TwoDigitContext extends ParserRuleContext {
		public TwoDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twoDigit; }
	 
		public TwoDigitContext() { }
		public void copyFrom(TwoDigitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesmitRContext extends TwoDigitContext {
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public DesmitRContext(TwoDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterDesmitR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitDesmitR(this);
		}
	}
	public static class PadsmitContext extends TwoDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PadsmitContext(TwoDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPadsmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPadsmit(this);
		}
	}
	public static class DesmitContext extends TwoDigitContext {
		public DesmitContext(TwoDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterDesmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitDesmit(this);
		}
	}
	public static class DesmitLContext extends TwoDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public DesmitLContext(TwoDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterDesmitL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitDesmitL(this);
		}
	}
	public static class DesmitLRContext extends TwoDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public DesmitLRContext(TwoDigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterDesmitLR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitDesmitLR(this);
		}
	}

	public final TwoDigitContext twoDigit() throws RecognitionException {
		TwoDigitContext _localctx = new TwoDigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_twoDigit);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PadsmitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__0) | (1L << PreDigit))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(128); match(T__8);
				}
				break;
			case 2:
				_localctx = new DesmitLRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(130); match(T__4);
				{
				setState(131); match(T__11);
				setState(132); oneDigit();
				}
				}
				break;
			case 3:
				_localctx = new DesmitLContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==PreDigit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(134); match(T__4);
				}
				break;
			case 4:
				_localctx = new DesmitRContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135); match(T__4);
				{
				setState(136); match(T__11);
				setState(137); oneDigit();
				}
				}
				break;
			case 5:
				_localctx = new DesmitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(138); match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OneDigitContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public OneDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneDigit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterOneDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitOneDigit(this);
		}
	}

	public final OneDigitContext oneDigit() throws RecognitionException {
		OneDigitContext _localctx = new OneDigitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_oneDigit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__0) | (1L << Digit))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\5\6c\n\6\3\7\3\7\3\7\3\7\3\7\5\7j\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7{\n"+
		"\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u008e\n\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\6\5\2\5\5\16"+
		"\16\20\20\4\2\16\16\20\20\3\2\16\17\4\2\7\7\16\17\u00b0\2\22\3\2\2\2\4"+
		"\32\3\2\2\2\6U\3\2\2\2\b\\\3\2\2\2\nb\3\2\2\2\f\177\3\2\2\2\16\u008d\3"+
		"\2\2\2\20\u008f\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\33"+
		"\7\t\2\2\26\33\5\20\t\2\27\33\5\16\b\2\30\33\5\f\7\2\31\33\5\6\4\2\32"+
		"\25\3\2\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33"+
		"\5\3\2\2\2\34V\7\13\2\2\35V\7\f\2\2\36\37\7\13\2\2\37 \7\3\2\2 V\5\b\5"+
		"\2!\"\7\20\2\2\"V\7\13\2\2#$\7\20\2\2$%\7\13\2\2%&\7\3\2\2&V\5\b\5\2\'"+
		"(\7\n\2\2(V\7\13\2\2)*\t\2\2\2*+\7\6\2\2+V\7\13\2\2,-\t\3\2\2-.\7\n\2"+
		"\2.V\7\13\2\2/\60\7\b\2\2\60V\7\13\2\2\61\62\t\3\2\2\62\63\7\b\2\2\63"+
		"V\7\13\2\2\64\65\7\n\2\2\65\66\7\13\2\2\66\67\7\3\2\2\67V\5\b\5\289\t"+
		"\2\2\29:\7\6\2\2:;\7\13\2\2;<\7\3\2\2<V\5\b\5\2=>\t\3\2\2>?\7\n\2\2?@"+
		"\7\13\2\2@A\7\3\2\2AV\5\b\5\2BC\7\b\2\2CD\7\13\2\2DE\7\3\2\2EV\5\b\5\2"+
		"FG\t\3\2\2GH\7\b\2\2HI\7\13\2\2IJ\7\3\2\2JV\5\b\5\2KL\5\n\6\2LM\7\3\2"+
		"\2MN\7\r\2\2NV\3\2\2\2OP\5\n\6\2PQ\7\3\2\2QR\7\r\2\2RS\7\3\2\2ST\5\b\5"+
		"\2TV\3\2\2\2U\34\3\2\2\2U\35\3\2\2\2U\36\3\2\2\2U!\3\2\2\2U#\3\2\2\2U"+
		"\'\3\2\2\2U)\3\2\2\2U,\3\2\2\2U/\3\2\2\2U\61\3\2\2\2U\64\3\2\2\2U8\3\2"+
		"\2\2U=\3\2\2\2UB\3\2\2\2UF\3\2\2\2UK\3\2\2\2UO\3\2\2\2V\7\3\2\2\2W]\5"+
		"\f\7\2X]\5\16\b\2Y]\7\17\2\2Z]\7\16\2\2[]\7\7\2\2\\W\3\2\2\2\\X\3\2\2"+
		"\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^c\5\f\7\2_c\5\16\b\2`c"+
		"\7\17\2\2ac\7\16\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\13\3\2\2"+
		"\2de\t\3\2\2ef\7\b\2\2fi\7\3\2\2gj\5\16\b\2hj\5\20\t\2ig\3\2\2\2ih\3\2"+
		"\2\2j\u0080\3\2\2\2kl\t\3\2\2l\u0080\7\b\2\2mn\7\b\2\2nq\7\3\2\2or\5\16"+
		"\b\2pr\5\20\t\2qo\3\2\2\2qp\3\2\2\2r\u0080\3\2\2\2s\u0080\7\b\2\2tu\t"+
		"\4\2\2uv\7\3\2\2vw\7\4\2\2wz\7\3\2\2x{\5\16\b\2y{\5\20\t\2zx\3\2\2\2z"+
		"y\3\2\2\2{\u0080\3\2\2\2|}\t\4\2\2}~\7\3\2\2~\u0080\7\4\2\2\177d\3\2\2"+
		"\2\177k\3\2\2\2\177m\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\177|\3\2\2\2\u0080"+
		"\r\3\2\2\2\u0081\u0082\t\2\2\2\u0082\u008e\7\6\2\2\u0083\u0084\t\3\2\2"+
		"\u0084\u0085\7\n\2\2\u0085\u0086\7\3\2\2\u0086\u008e\5\20\t\2\u0087\u0088"+
		"\t\3\2\2\u0088\u008e\7\n\2\2\u0089\u008a\7\n\2\2\u008a\u008b\7\3\2\2\u008b"+
		"\u008e\5\20\t\2\u008c\u008e\7\n\2\2\u008d\u0081\3\2\2\2\u008d\u0083\3"+
		"\2\2\2\u008d\u0087\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\17\3\2\2\2\u008f\u0090\t\5\2\2\u0090\21\3\2\2\2\13\32U\\biqz\177\u008d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}