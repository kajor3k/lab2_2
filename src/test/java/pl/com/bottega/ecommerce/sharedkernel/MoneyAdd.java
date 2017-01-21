package pl.com.bottega.ecommerce.sharedkernel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.Currency;

import org.junit.Before;
import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyAdd {
	String result;
	Money cash;
	
	@Before
	public void init(){
		
		BigDecimal denomination = new BigDecimal("1000.00001");
		cash = new Money(denomination);
		cash.add(cash);
		result = cash.toString();
		
		}
	
	@Test
	
	 public void addition(){
		
		assertThat(result, is(cash.toString()));
	}
	
}
