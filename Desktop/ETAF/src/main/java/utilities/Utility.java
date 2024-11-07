package utilities;

import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.os.WindowsUtils;

import com.github.javafaker.Faker;

import io.netty.util.internal.ThreadLocalRandom;

public class Utility {
	
	static Faker faker = new Faker();
	// Generate random data
    static String randomFirstName = faker.name().firstName(); // Random first name
    static String randomLastName = faker.name().lastName();   // Random last name
    static String randomMiddleName = faker.name().lastName(); //Random middle name
	private static Map<String, String> mapStore= new HashMap<String, String>();
	
    static int randomEEid = ThreadLocalRandom.current().nextInt(10000, 99999); //random 5 digits
    
	// Create Directory
	public static void createDirectory(String directoryName) {
		File directory = new File(directoryName);
		if (!directory.exists()) {
			directory.mkdirs();
		}
	}
	 public static void inputDatainFile(int targetRow, int targetColumn, String Key) {
		 String filePath = System.getProperty("user.home") + "\\Desktop\\ETAF\\src\\main\\java\\testData\\importData_Test.csv";  // Update to your CSV file path
	        

	        List<String[]> csvData = new ArrayList<>();

	        // Read the CSV file into memory
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");
	                csvData.add(values);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Modify the target cell with a random string
	        if (targetColumn == 0) {
	            csvData.get(targetRow)[targetColumn] = randomFirstName ;
	            
	            System.out.println("Random string '" + randomFirstName + "' has been written to the CSV file!");
	            mapStore.put(Key, randomFirstName);
	        }
	         if (csvData.size() > targetRow && csvData.get(targetRow).length > targetColumn &&targetColumn == 1) {
	            csvData.get(targetRow)[targetColumn] = randomMiddleName ;
	            
	            System.out.println("Random string '" + randomMiddleName + "' has been written to the CSV file!");
	            mapStore.put(Key, randomMiddleName);
	        }
	        
	         if (csvData.size() > targetRow && csvData.get(targetRow).length > targetColumn && targetColumn == 2) {
	            csvData.get(targetRow)[targetColumn] =  randomLastName ;
	            
	            System.out.println("Random string '" + randomLastName + "' has been written to the CSV file!");
	            mapStore.put(Key, randomLastName);
	        }
	         if (csvData.size() > targetRow && csvData.get(targetRow).length > targetColumn &&targetColumn == 3 ) {
	        	String eeIdtoSTR = Integer.toString(randomEEid);
	            csvData.get(targetRow)[targetColumn] =  eeIdtoSTR +",,,,,,,,,,,,,,,,,,";
	            
	            System.out.println("Random string '" + eeIdtoSTR + "' has been written to the CSV file!");
	            mapStore.put(Key, eeIdtoSTR);
	        }
	        else {
	            System.out.println("Specified row/column is out of bounds.");
	        }
	        

	        // Write the modified data back to the CSV file
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
	            for (String[] row : csvData) {
	                bw.write(String.join(",", row));
	                bw.newLine();
	            }
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	 public static void selectFileinExplorer(String path) {
	        JFileChooser fileChooser = new JFileChooser();
	        
	        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")+ path));
	        // Optional: Set a filter for specific file types (e.g., CSV, text files)
	        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV files","csv");
	        fileChooser.setFileFilter(filter);

	        // Open the file chooser dialog
	        int result = fileChooser.showOpenDialog(null);
	        
	        // Check if a file was selected
	        if (result == JFileChooser.APPROVE_OPTION) {
	            File selectedFile = fileChooser.getSelectedFile();
	            String filePath = selectedFile.getAbsolutePath();
	            System.out.println("Selected file path: " + filePath);
	            // You can now use the file path (e.g., open, read, or process the file)
	        } else {
	            System.out.println("File selection was cancelled.");
	        }
	    }

	 public static boolean isFileDownloaded(String downloadDir, String fileName) {
	        File dir = new File(downloadDir);
	        File[] dirContents = dir.listFiles();

	        if (dirContents != null) {
	            for (File file : dirContents) {
	                if (file.getName().equals(fileName)) {
	                    System.out.println("File found: " + file.getAbsolutePath());
	                    return true;  // File exists
	                }
	            }
	        }
	        System.out.println("File not found: " + fileName);
	        return false;  // File does not exist
	    }

	    public static void ValidateDownloadSuccessful(String[] args) {
	        String downloadDir = System.getProperty("user.home") + "/Downloads";  // Path to the Downloads folder
	        String fileName = "importData.csv";  // Replace with your actual file name

	        boolean isDownloaded = isFileDownloaded(downloadDir, fileName);
	        System.out.println("Download status: " + (isDownloaded ? "File exists" : "File does not exist"));
	    }
//	@SuppressWarnings("deprecation")
//	public static void killProcess(String browser) {
//		switch (browser) {
//		case "chrome":
//			WindowsUtils.killByName("chromedriver.exe");
//			break;
//		case "firefox":
//			WindowsUtils.killByName("gecko.exe");
//			break;
//		case "ie":
//			WindowsUtils.killByName("IEDriverServer.exe");
//			break;
//		}
//	}
	
	public static void cleanDirectory(String dirParam) {
		File dir = new File(dirParam);
		if (dir.isDirectory()) {
			try {
				FileUtils.deleteDirectory(dir);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
