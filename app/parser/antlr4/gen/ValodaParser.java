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
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Digit=12, PreDigit=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "'simti'", "'vien'", "'padsmit'", "'viens'", "'simt'", 
		"'nulle'", "'desmit'", "'tūkstoš'", "'tūkstoši'", "'trīs'", "Digit", "PreDigit", 
		"WS"
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
				setState(19); match(T__4);
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
	public static class TukstosiContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
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
	public static class TukstosContext extends ThousandsContext {
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
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
	public static class TukstosPreContext extends ThousandsContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public PostNumberContext postNumber() {
			return getRuleContext(PostNumberContext.class,0);
		}
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

	public final ThousandsContext thousands() throws RecognitionException {
		ThousandsContext _localctx = new ThousandsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_thousands);
		int _la;
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TukstosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26); match(T__2);
				setState(29);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(27); match(T__10);
					setState(28); postNumber();
					}
				}

				}
				break;
			case 2:
				_localctx = new TukstosPreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(PreDigit);
				setState(32); match(T__2);
				setState(35);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(33); match(T__10);
					setState(34); postNumber();
					}
				}

				}
				break;
			case 3:
				_localctx = new TukstosiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37); preNumber();
				setState(38); match(T__10);
				setState(39); match(T__1);
				setState(42);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(40); match(T__10);
					setState(41); postNumber();
					}
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
		public PostNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postNumber; }
	 
		public PostNumberContext() { }
		public void copyFrom(PostNumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostTriDigitedContext extends PostNumberContext {
		public ThreeDigitContext threeDigit() {
			return getRuleContext(ThreeDigitContext.class,0);
		}
		public PostTriDigitedContext(PostNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostTriDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostTriDigited(this);
		}
	}
	public static class PostOneContext extends PostNumberContext {
		public PostOneContext(PostNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostOne(this);
		}
	}
	public static class PostTwoDigitedContext extends PostNumberContext {
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public PostTwoDigitedContext(PostNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostTwoDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostTwoDigited(this);
		}
	}
	public static class PostOneDigitedContext extends PostNumberContext {
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public PostOneDigitedContext(PostNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostOneDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostOneDigited(this);
		}
	}
	public static class PostThreeContext extends PostNumberContext {
		public PostThreeContext(PostNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPostThree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPostThree(this);
		}
	}

	public final PostNumberContext postNumber() throws RecognitionException {
		PostNumberContext _localctx = new PostNumberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_postNumber);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new PostTriDigitedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46); threeDigit();
				}
				break;
			case 2:
				_localctx = new PostTwoDigitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47); twoDigit();
				}
				break;
			case 3:
				_localctx = new PostOneDigitedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48); match(Digit);
				}
				break;
			case 4:
				_localctx = new PostThreeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(49); match(T__0);
				}
				break;
			case 5:
				_localctx = new PostOneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50); match(T__6);
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
		public PreNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preNumber; }
	 
		public PreNumberContext() { }
		public void copyFrom(PreNumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreTwoDigitedContext extends PreNumberContext {
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
		public PreTwoDigitedContext(PreNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPreTwoDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPreTwoDigited(this);
		}
	}
	public static class PreTriDigitedContext extends PreNumberContext {
		public ThreeDigitContext threeDigit() {
			return getRuleContext(ThreeDigitContext.class,0);
		}
		public PreTriDigitedContext(PreNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPreTriDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPreTriDigited(this);
		}
	}
	public static class PreThreeContext extends PreNumberContext {
		public PreThreeContext(PreNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPreThree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPreThree(this);
		}
	}
	public static class PreOneDigitedContext extends PreNumberContext {
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public PreOneDigitedContext(PreNumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).enterPreOneDigited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValodaListener ) ((ValodaListener)listener).exitPreOneDigited(this);
		}
	}

	public final PreNumberContext preNumber() throws RecognitionException {
		PreNumberContext _localctx = new PreNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_preNumber);
		try {
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PreTriDigitedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53); threeDigit();
				}
				break;
			case 2:
				_localctx = new PreTwoDigitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54); twoDigit();
				}
				break;
			case 3:
				_localctx = new PreOneDigitedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55); match(Digit);
				}
				break;
			case 4:
				_localctx = new PreThreeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56); match(T__0);
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
	public static class SimtContext extends ThreeDigitContext {
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
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
	public static class SimtiContext extends ThreeDigitContext {
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
		public TerminalNode Digit() { return getToken(ValodaParser.Digit, 0); }
		public TwoDigitContext twoDigit() {
			return getRuleContext(TwoDigitContext.class,0);
		}
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

	public final ThreeDigitContext threeDigit() throws RecognitionException {
		ThreeDigitContext _localctx = new ThreeDigitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_threeDigit);
		int _la;
		try {
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SimtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				_la = _input.LA(1);
				if (_la==T__0 || _la==PreDigit) {
					{
					setState(59);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==PreDigit) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(62); match(T__5);
				setState(68);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(63); match(T__10);
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(64); twoDigit();
						}
						break;
					case 2:
						{
						setState(65); oneDigit();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SimtiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==Digit) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(71); match(T__10);
				setState(72); match(T__9);
				setState(78);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(73); match(T__10);
					setState(76);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(74); twoDigit();
						}
						break;
					case 2:
						{
						setState(75); oneDigit();
						}
						break;
					}
					}
					break;
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
		public TerminalNode PreDigit() { return getToken(ValodaParser.PreDigit, 0); }
		public OneDigitContext oneDigit() {
			return getRuleContext(OneDigitContext.class,0);
		}
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

	public final TwoDigitContext twoDigit() throws RecognitionException {
		TwoDigitContext _localctx = new TwoDigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_twoDigit);
		int _la;
		try {
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new PadsmitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__0) | (1L << PreDigit))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(83); match(T__7);
				}
				break;
			case 2:
				_localctx = new DesmitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				_la = _input.LA(1);
				if (_la==T__0 || _la==PreDigit) {
					{
					setState(84);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==PreDigit) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(87); match(T__3);
				setState(90);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(88); match(T__10);
					setState(89); oneDigit();
					}
					break;
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
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__0) | (1L << Digit))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\4\5\4&\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5\5\5\66\n\5"+
		"\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\5\7?\n\7\3\7\3\7\3\7\3\7\5\7E\n\7\5\7G\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\5\7Q\n\7\5\7S\n\7\3\b\3\b\3\b\5\b"+
		"X\n\b\3\b\3\b\3\b\5\b]\n\b\5\b_\n\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20"+
		"\2\6\4\2\r\r\17\17\3\2\r\16\5\2\5\5\r\r\17\17\4\2\7\7\r\16s\2\22\3\2\2"+
		"\2\4\32\3\2\2\2\6.\3\2\2\2\b\65\3\2\2\2\n;\3\2\2\2\fR\3\2\2\2\16^\3\2"+
		"\2\2\20`\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\33\7\t\2"+
		"\2\26\33\5\20\t\2\27\33\5\16\b\2\30\33\5\f\7\2\31\33\5\6\4\2\32\25\3\2"+
		"\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2"+
		"\2\2\34\37\7\13\2\2\35\36\7\3\2\2\36 \5\b\5\2\37\35\3\2\2\2\37 \3\2\2"+
		"\2 /\3\2\2\2!\"\7\17\2\2\"%\7\13\2\2#$\7\3\2\2$&\5\b\5\2%#\3\2\2\2%&\3"+
		"\2\2\2&/\3\2\2\2\'(\5\n\6\2()\7\3\2\2),\7\f\2\2*+\7\3\2\2+-\5\b\5\2,*"+
		"\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\34\3\2\2\2.!\3\2\2\2.\'\3\2\2\2/\7\3\2\2"+
		"\2\60\66\5\f\7\2\61\66\5\16\b\2\62\66\7\16\2\2\63\66\7\r\2\2\64\66\7\7"+
		"\2\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2"+
		"\2\2\66\t\3\2\2\2\67<\5\f\7\28<\5\16\b\29<\7\16\2\2:<\7\r\2\2;\67\3\2"+
		"\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\13\3\2\2\2=?\t\2\2\2>=\3\2\2\2>?\3"+
		"\2\2\2?@\3\2\2\2@F\7\b\2\2AD\7\3\2\2BE\5\16\b\2CE\5\20\t\2DB\3\2\2\2D"+
		"C\3\2\2\2EG\3\2\2\2FA\3\2\2\2FG\3\2\2\2GS\3\2\2\2HI\t\3\2\2IJ\7\3\2\2"+
		"JP\7\4\2\2KN\7\3\2\2LO\5\16\b\2MO\5\20\t\2NL\3\2\2\2NM\3\2\2\2OQ\3\2\2"+
		"\2PK\3\2\2\2PQ\3\2\2\2QS\3\2\2\2R>\3\2\2\2RH\3\2\2\2S\r\3\2\2\2TU\t\4"+
		"\2\2U_\7\6\2\2VX\t\2\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y\\\7\n\2\2Z[\7"+
		"\3\2\2[]\5\20\t\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^T\3\2\2\2^W\3\2\2\2"+
		"_\17\3\2\2\2`a\t\5\2\2a\21\3\2\2\2\22\32\37%,.\65;>DFNPRW\\^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}