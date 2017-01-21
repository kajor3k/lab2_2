package pl.com.bottega.ecommerce.sharedkernel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MoneyLessEqualThanMoney {
	String result;
	Money cash;
	
	
	@Before
	public void init(){
		
		BigDecimal denomination = new BigDecimal("1000.00001");
		//Currency currency = Currency.getInstance("wrongCurrency");
		cash.equals(denomination);
		
		cash.lessOrEquals((new Money(1000.0001,"EUR")));
		
		result = cash.toString();
		
		
		}
	
	@Test
	
	 public void isWrongCurrency(){
		
		
		
		assertThat(result.equals(cash.lessOrEquals((new Money(99,"EUR")))), is(false));
	}
}
