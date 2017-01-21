package pl.com.bottega.ecommerce.sharedkernel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;
import java.util.Currency;

import org.junit.Before;
import org.junit.Test;

import pl.com.bottega.ecommerce.sharedkernel.Money;

public class MoneyCurrencyWrongInstance {
	
	@Before
	public void init(){
		Currency cur = Money.DEFAULT_CURRENCY;
		Money zero = Money.ZERO;
		final BigDecimal denomination = new BigDecimal("1000.00001");
		Money cash = new Money(denomination, cur);
		
		final String result = cash.toString();
		
		
		}
	
	@Test
	
	 public void exists(){
		
		assertThat(result, is(cash.toString()));
	}
	
}
