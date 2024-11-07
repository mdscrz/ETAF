package testData;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;

import io.netty.util.internal.ThreadLocalRandom;



public class AdminData {
	static Faker faker = new Faker();
	// Generate random data
	 	static String randomUserName = faker.name().username();    // Random username
	 			
	public static String userName = randomUserName;
	public static String expectedRole = "Admin";
	

}
