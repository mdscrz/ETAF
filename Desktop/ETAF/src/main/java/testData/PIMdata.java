package testData;
import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;
import com.github.javafaker.Number;

import io.netty.util.internal.ThreadLocalRandom;



public class PIMdata {
	static Faker faker = new Faker();
	// Generate random data
	 	static String randomName = faker.name().fullName();       // Random full name
	    static String randomFirstName = faker.name().firstName(); // Random first name
	    static String randomLastName = faker.name().lastName();   // Random last name
	    //static String randomMiddleName = faker.name().nameWithMiddle(); //Random middle name
	    static int randomEEid = ThreadLocalRandom.current().nextInt(10000, 99999); //random 5 digits
	public static String fullName = randomName;
	public static String firstName = randomFirstName;
	public  static String middleName = "Garcia";
	public static String lastName = randomLastName;
	public static int eeID = randomEEid;
	public static int currentEEId = eeID;
	public static String pathToUploadData =System.getProperty("user.home") +"\\Desktop\\ETAF\\src\\main\\java\\testData\\importData_Test.csv";

}
