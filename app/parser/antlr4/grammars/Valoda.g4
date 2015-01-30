
grammar Valoda;

@header {
	package parser.antlr4.gen;
}

word: number EOF ;

number
	: 'nulle'		# Nulle
	| oneDigit		# OneDigitNum
	| twoDigit		# TwoDigitNum
	| threeDigit	# TriDigitNum
	| thousands		# ThousandNum
	;
	
thousands
	//'tūkstoš' (' ' postNumber)?					# Tukstos
	: 'tūkstoš'										# Tukstos
	| 'tūkstotis'									# Tukstotis
	| 'tūkstoš' (' ' postNumber)					# TukstosR
	//PreDigit 'tūkstoš' (' ' postNumber)? 			# TukstosPre
	| PreDigit 'tūkstoš'				 			# TukstosPre
	| PreDigit 'tūkstoš' (' ' postNumber) 			# TukstosPreR
	// 10-19
	| 'desmit' 'tūkstoš'								# TukstosDesmit
	| ('vien' | 'trīs' | PreDigit) 'padsmit' 'tūkstoš'	# TukstosPadsmit
	| ('trīs' | PreDigit) 'desmit' 'tūkstoš'			# TukstosDesmitMulti
	| 'simt' 'tūkstoš'									# TukstosSimt
	| ('trīs' | PreDigit) 'simt' 'tūkstoš'				# TukstosSimtMulti
	// 10-19
	| 'desmit' 'tūkstoš' (' ' postNumber)								# TukstosDesmitR
	| ('vien' | 'trīs' | PreDigit) 'padsmit' 'tūkstoš' (' ' postNumber)	# TukstosPadsmitR
	| ('trīs' | PreDigit) 'desmit' 'tūkstoš' (' ' postNumber)			# TukstosDesmitMultiR
	| 'simt' 'tūkstoš' (' ' postNumber)									# TukstosSimtR
	| ('trīs' | PreDigit) 'simt' 'tūkstoš' (' ' postNumber)				# TukstosSimtMultiR
	//preNumber ' ' 'tūkstoši' (' ' postNumber)?	# Tukstosi
	| preNumber ' ' 'tūkstoši'						# Tukstosi
	| preNumber ' ' 'tūkstoši' (' ' postNumber)		# TukstosiR
	;
	
postNumber
	: threeDigit
	| twoDigit
	| Digit
	| 'trīs'
	| 'viens'
	;
	
preNumber
	: threeDigit
	| twoDigit
	| Digit
	| 'trīs'
	;
	
threeDigit
	//('trīs' | PreDigit)? 'simt'  (' ' (twoDigit | oneDigit))?	# Simt
	: ('trīs' | PreDigit) 'simt'  (' ' (twoDigit | oneDigit))	# SimtLR
	| ('trīs' | PreDigit) 'simt'  								# SimtL
	| 'simt'  (' ' (twoDigit | oneDigit))						# SimtR
	| 'simt'													# Simt
	//('trīs' | Digit) ' ' 'simti' (' ' (twoDigit | oneDigit))?	# Simti
	| ('trīs' | Digit) ' ' 'simti' (' ' (twoDigit | oneDigit))	# SimtiR
	| ('trīs' | Digit) ' ' 'simti'								# Simti
	;
	
twoDigit
	: ('vien' | 'trīs' | PreDigit) 'padsmit'		# Padsmit
	//('trīs' | PreDigit)? 'desmit' (' ' oneDigit)? # Desmit
	| ('trīs' | PreDigit) 'desmit' (' ' oneDigit)	# DesmitLR
	| ('trīs' | PreDigit) 'desmit'					# DesmitL
	| 'desmit' (' ' oneDigit)						# DesmitR
	| 'desmit' 										# Desmit
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
