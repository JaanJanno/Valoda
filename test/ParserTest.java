import java.util.HashMap;

import org.junit.*;
import controllers.antlr4.Parsers;

public class ParserTest {

	static HashMap<String, Integer> numbers = new HashMap<>();

	static {
		numbers.put("nulle", 0);
		numbers.put("viens", 1);
		numbers.put("divi", 2);
		numbers.put("trīs", 3);
		numbers.put("četri", 4);
		numbers.put("pieci", 5);
		numbers.put("seši", 6);
		numbers.put("septiņi", 7);
		numbers.put("astoņi", 8);
		numbers.put("deviņi", 9);
		
		numbers.put("desmit", 10);
		numbers.put("trīspadsmit", 13);	
		numbers.put("trīsdesmit", 30);	
		numbers.put("divdesmit astoņi", 28);
		
		numbers.put("simt", 100);	
		numbers.put("septiņsimt", 700);
		numbers.put("trīs simti", 300);
		numbers.put("deviņsimt četri", 904);
		numbers.put("deviņsimt četrdesmit", 940);
		numbers.put("deviņsimt četrdesmit pieci", 945);
		
		numbers.put("tūkstoš", 1000);
		numbers.put("tūkstoš astoņsimt", 1800);
		numbers.put("tūkstoš viens", 1001);
		numbers.put("tūkstoš desmit", 1010);
		numbers.put("tūkstoš simt", 1100);
		numbers.put("divtūkstoš", 2000);
		numbers.put("divtūkstoš astoņsimt", 2800);
		numbers.put("trīs tūkstoši", 3000);
		
		numbers.put("desmittūkstoš", 10000);
		numbers.put("desmittūkstoš viens", 10001);
		numbers.put("vienpadsmittūkstoš", 11000);
		numbers.put("vienpadsmittūkstoš piecpadsmit", 11015);
		numbers.put("trīspadsmittūkstoš", 13000);
		numbers.put("trīspadsmittūkstoš divsimt viens", 13201);
		
		numbers.put("trīsdesmittūkstoš", 30000);
		numbers.put("trīsdesmittūkstoš trīssimt pieci", 30305);
		numbers.put("trīsdesmit tūkstoši", 30000);
		numbers.put("piecdesmit tūkstoši astoņsimt", 50800);
		
		numbers.put("simttūkstoš", 100000);
		numbers.put("simttūkstoš trīssimt", 100300);
		numbers.put("simt tūkstoši", 100000);
		numbers.put("simt vienpadsmit tūkstoši simt vienpadsmit", 111111);
		
		numbers.put("divsimttūkstoš", 200000);
		numbers.put("divsimttūkstoš četrdesmit četri", 200044);
	}

	@Test
	public void parseTest() {
		for (String number : numbers.keySet()) {
			Assert.assertEquals("Parsed text", number, Parsers.parseNumberAsTree(number).getText());
		}
	}
	
	@Test
	public void parseAsNumberTest() {
		for (String number : numbers.keySet()) {
			System.out.println(numbers.get(number).toString() + " = " + number);
			Assert.assertEquals("Parsed text", (int)numbers.get(number), Parsers.parseNumberAsInt(number));
		}
	}
}
