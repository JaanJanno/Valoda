
grammar Valoda;

@header {
	package parser.antlr4.gen;
}

seq : word* EOF ;

word: Arv ;

Arv
	: 'nulle'
	| 'viens'
	| 'divi'
	| 'trīs'
	| 'četri'
	| 'pieci'
	| 'seši'
	| 'septiņi'
	| 'astoņi'
	| 'deviņi'
	| 'desmit'
	;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
