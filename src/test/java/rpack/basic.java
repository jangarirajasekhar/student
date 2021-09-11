package rpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basic {

	@Test
	public void man() {
		System.out.println("hii this is raju");
	}

	@BeforeClass
	public void animal() {
		System.out.println("buaty of world peacock");
	}

	@AfterClass
	public void book() {
		System.out.println("best friend is a book");
	}

	@Test
	public void movie() {
		System.out.println("simharasi my faviorate movie");
	}
}
/*groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.11</version>
<scope>test</scope>*/