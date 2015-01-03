
grammar Valoda;

@header {
	package parser.antlr4.gen;
}

seq : word (' ' word)* EOF ;

word: number ;

number
	: 'nulle'		# Nulle
	| oneDigit		# OneDigitNum
	| twoDigit		# TwoDigitNum
	| threeDigit	# TriDigitNum
	| thousands		# ThousandNum
	;
	
thousands
	: 'tūkstoš' (' ' postNumber)?					# Tukstos
	| PreDigit 'tūkstoš' (' ' postNumber)? 			# TukstosPre
	| preNumber ' ' 'tūkstoši' (' ' postNumber)?	# Tukstosi
	;
	
postNumber
	: threeDigit	# PostTriDigited
	| twoDigit		# PostTwoDigited
	| Digit			# PostOneDigited
	| 'trīs'		# PostThree
	| 'viens'		# PostOne
	;
	
preNumber
	: threeDigit	# PreTriDigited
	| twoDigit		# PreTwoDigited
	| Digit			# PreOneDigited
	| 'trīs'		# PreThree
	;
	
threeDigit
	: ('trīs' | PreDigit)? 'simt'  (' ' (twoDigit | oneDigit))?	# Simt
	| ('trīs' | Digit) ' ' 'simti' (' ' (twoDigit | oneDigit))?	# Simti
	;
	
twoDigit
	: ('vien' | 'trīs' | PreDigit) 'padsmit'		# Padsmit
	| ('trīs' | PreDigit)? 'desmit' (' ' oneDigit)?	# Desmit
	;
	
oneDigit
	: ('viens' | 'trīs' | Digit)
	;
	
Digit
	: 'divi' // No three!
	| 'četri'
	| 'pieci'
	| 'seši'
	| 'septiņi'
	| 'astoņi'
	| 'deviņi'
	;
	
PreDigit
	: 'div'	// No three!
	| 'četr'
	| 'piec'
	| 'seš'
	| 'septiņ'
	| 'astoņ'
	| 'deviņ'
	;

WS : [\t\r\n]+ -> skip ; // skip tabs, newlines
