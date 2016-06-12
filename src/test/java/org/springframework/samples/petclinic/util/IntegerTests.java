package org.springframework.samples.petclinic.util;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class IntegerTests {
	
	@Test
	public void testParseIntegerWith1Digit() {
		Assertions.assertThat(Integer.parseInt1("3")).isEqualTo(3);
		Assertions.assertThat(Integer.parseInt1("1")).isEqualTo(1);
	}

	@Test
	public void testParseInteger() {
		Assertions.assertThat(Integer.parseInt2("123")).isEqualTo(123);
		Assertions.assertThat(Integer.parseInt2("1")).isEqualTo(1);
	}

	@Test
	public void testParseIntegerNegative() {
		Assertions.assertThat(Integer.parseInt3("123")).isEqualTo(123);
		Assertions.assertThat(Integer.parseInt3("1")).isEqualTo(1);
		Assertions.assertThat(Integer.parseInt3("-1")).isEqualTo(-1);
		Assertions.assertThat(Integer.parseInt3("-98745")).isEqualTo(-98745);
		Assertions.assertThat(Integer.parseInt3("555")).isEqualTo(555);
	}
}
