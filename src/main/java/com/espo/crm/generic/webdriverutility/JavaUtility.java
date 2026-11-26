package com.espo.crm.generic.webdriverutility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

public final class JavaUtility {

	
	
    private JavaUtility() {
        // Prevent object creation
    	//This constructor is used to prevent anyone from creating an object of your utility class unnecessarily.
    }

    private static final String ALPHANUMERIC_CHARS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    private static final String ALPHABETIC_CHARS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static final String UPPERCASE_CHARS =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Reusable date formatters
    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final DateTimeFormatter US_DATE_FORMAT =
            DateTimeFormatter.ofPattern("MM/dd/yyyy");

    private static final DateTimeFormatter TIMESTAMP_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss-SSS");

    // Random numbers and characters

    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1000);
    }

    public static int getRandomNumber(int min, int max) {

        if (min > max) {
            throw new IllegalArgumentException("Min cannot be greater than max");
        }

        return (int) ThreadLocalRandom.current()
                .nextLong((long) min, (long) max + 1);
    }

    public static char getRandomChar() {
        return generateRandomString(UPPERCASE_CHARS, 1).charAt(0);
    }

    public static String getRandomAlphabetic(int length) {
        return generateRandomString(ALPHABETIC_CHARS, length);
    }

    public static String getRandomAlphaNumeric(int length) {
        return generateRandomString(ALPHANUMERIC_CHARS, length);
    }

    // CRM-specific test data

    public static String getRandomEmail() {
        return "testuser_" + getRandomAlphaNumeric(8).toLowerCase()
                + "@example.com";
    }

    public static String getRandomPhoneNumber() {

        int firstDigit = ThreadLocalRandom.current().nextInt(6, 10);

        long remainingDigits = ThreadLocalRandom.current()
                .nextLong(100_000_000L, 1_000_000_000L);

        return Integer.toString(firstDigit) + remainingDigits;
    }

    // Date helpers

    public static String getSystemDateYYYYMMDD() {
        return LocalDate.now().format(DATE_FORMAT);
    }

    public static String getRequiredDateYYYYMMDD(int days) {
        return LocalDate.now().plusDays(days).format(DATE_FORMAT);
    }

    public static String getRequiredDateMMDDYYYY(int days) {
        return LocalDate.now().plusDays(days).format(US_DATE_FORMAT);
    }

    // Timestamp helper

    public static String getTimeStamp() {
        return LocalDateTime.now().format(TIMESTAMP_FORMAT);
    }

    // Internal helper

    private static String generateRandomString(String characterPool, int length) {

        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }

        if (characterPool == null || characterPool.isEmpty()) {
            throw new IllegalArgumentException("Character pool cannot be empty");
        }

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {

            int index = ThreadLocalRandom.current()
                    .nextInt(characterPool.length());

            sb.append(characterPool.charAt(index));
        }

        return sb.toString();
    }
}
    
   /** private static final String ALPHANUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final String ALPHABETIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    // --- Random Numbers & Characters ---

    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1000);
    }

    public static int getRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static char getRandomChar() {
        return (char) ThreadLocalRandom.current().nextInt('A', 'Z' + 1);
    }

    public static String getRandomAlphabetic(int length) {
        return generateRandomString(ALPHABETIC_CHARS, length);
    }

    public static String getRandomAlphaNumeric(int length) {
        return generateRandomString(ALPHANUMERIC_CHARS, length);
    }

    // --- CRM-Specific Test Data ---

    public static String getRandomEmail() {
        return "testuser_" + getRandomAlphaNumeric(6).toLowerCase() + "@example.com";
    }

    public static String getRandomPhoneNumber() {
        // Generates a valid 10-digit Indian mobile number starting with 6, 7, 8, or 9
        int firstDigit = ThreadLocalRandom.current().nextInt(6, 10);
        long remainingDigits = ThreadLocalRandom.current().nextLong(100_000_000L, 1_000_000_000L);
        return firstDigit + String.valueOf(remainingDigits);
    }

    // --- Date & Time-stamp Helpers ---

    public static String getSystemDateYYYYMMDD() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static String getRequiredDateYYYYMMDD(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public static String getRequiredDateMMDDYYYY(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }

    public static String getTimeStamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
    }

    // --- Internal Helper ---

    private static String generateRandomString(String characterPool, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = ThreadLocalRandom.current().nextInt(characterPool.length());
            sb.append(characterPool.charAt(index));
        }
        return sb.toString();
    }
    ==================================================================================================================
    
   
	==================================================================================================================

    **/

	/**public static int getRandomNumber() {
		
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}
	
	public static String getSystemDateYYYYDDMM() {
		
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);
		return date;
		
	}
	
	public static String getRequiredDateYYYYMMDD(int days) {
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate = sim.format(cal.getTime());
		return requiredDate;
		
	}
	public static String getRequiredDateMMDDYYYY(int days) {
		
		SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String requiredDate = sim.format(cal.getTime());
		return requiredDate;
	
	}
	
	**/