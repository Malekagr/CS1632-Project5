import static org.junit.Assert.*;

import org.junit.Test;

public class MainPanelTest {
	/* tests to make sure that the output is the same as the input, as this is was conertToInt does*/
	@Test
	public void converToIntTest1() {
		if (MainPanel.convertToInt(5) != 5){
			fail();
		}
	}
	/*tests to make sure a NumberFormatException is generated when trying to parse a negative number*/
	@Test
	public void coverToIntTest2(){
		try {
			MainPanel.convertToInt(-3);
			fail();
		    } catch (NumberFormatException iex) { 
		    	
		    }
		    
	}
	/* tests to make sure the input of 0 returns 0*/
	@Test
	public void coverToIntTest3(){
		if (MainPanel.convertToInt(0) != 0){
			fail();
		}
	}


}
