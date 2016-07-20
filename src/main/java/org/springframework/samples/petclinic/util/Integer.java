package org.springframework.samples.petclinic.util;

public class Integer {
	
	/**
	 * 1st version : convert a number from 0 to 9
	 */
	public static int parseInt1(String number) {
		return number.charAt(0) - '0';
	}

	/**
	 * 2nd version : Convert number with many digits Important thing to
	 * understand : substraction between a character and 0 will give the right
	 * number, for example : char 8 - char 0 = 8. We substract indexes in the
	 * characters matrix. Then we multiply the result on each loop to get
	 * through decade, hundred, etc...
	 */
	public static int parseInt2(String number) {

		int result = 0;

		for (int i = 0; i < number.length(); i++) {
			result *= 10;
			result += (number.charAt(i) - '0');
		}
		return result;
	}

	/**
	 * 3rd version : add recognition of negative and positive signs (-+)
	 */
	public static int parseInt3(String number) {

		int result = 0;
		boolean isNegative = false;

		if (number.startsWith("-") || number.startsWith("+")) {
			isNegative = number.startsWith("-");
			number = number.substring(1);
		}

		for (int i = 0; i < number.length(); i++) {
			result *= 10;
			result += (number.charAt(i) - '0');
		}

		if (isNegative) {
			result *= -1;
		}
		return result;
	}
}
