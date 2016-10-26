package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = "";
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		
		//declare & set default value
		int selection = -1;

		// initialize the filter (NoFilter() will sets a filter that will only copy the original.)
		Filter filter = new NoFilter();
		
		do {
			selection = displayFilterMenu(in);
			try {
				// get the filter
				filter = getFilter(selection);
			}

			// displays an error message upon invalid filter
			// resets selection to -1 to fail loop exit & force another iteration 
			catch (IllegalArgumentException e) {
				System.out.println("Invalid Argument:  " + e + " doesn't correspond to filter.");
				selection = -1;
			}
		} while (selection == -1);

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		boolean isFinished = false;
		while (!isFinished) {

			// save image, if desired
			System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
			String fileName = in.next();

			// if, when asked to save, the user enters the same filename as the original, prompt for the overwrite
			if (fileName.equals(relPath)) {
				System.out.println("Original " + fileName + " will be overwritten.  Are you sure?  (Y / N):");
			}
		
			
			//NEW IF BLOCK:
			// if the filenames are equal but they don't want to overwrite
			if (fileName.equals(relPath) && (!in.next().toUpperCase().equals("Y"))){
				//do nothing	(isFinished = false;)
			}
			
			// or if the user wants to exit
			else if (fileName.equals("exit")) {
				System.out.println("Image not saved");
				isFinished = true;
			}
			
			// otherwise, save the files  ( (filenames equal && overwrite == Y)  &&  (!exit) )
			else {
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
				isFinished = true;
			}
		}
		
		// close input scanner
		in.close();
		System.out.println("\n\nIf we got this far, the only thing left is the final return statement, so why is this still running?");
		return;  //Why doesn't this close the program?
	}
	
	
	
	private static int displayFilterMenu(Scanner in) {
		
		//show user a list of options
		System.out.println("\nFilter to be applied:");
		System.out.println("1 - blue");
		System.out.println("2 - invert");
//		System.out.println("3 - brightness");
//		System.out.println("4 - blur");
//		System.out.println("5 - monochrome");
		System.out.println("6 - grayscale");
		System.out.println("0  -  no filter (copy original image)");
		
		//initialize selection before attempting to get valid user input
		String selection = "";

		do {
			selection = in.next();
			if (!isNumeric(selection)) {
				//displays an error msg upon non-numeric entry
				System.out.println("Input Mismatch:  Entry needs to be numeric.  Please try again:");
			}
		} while (!isNumeric(selection)); 

		return Integer.parseInt(selection);
	}
	
	private static boolean isNumeric(String s) {
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	
	private static Filter getFilter(int selected) {

		Filter selectedFilter = new NoFilter();

		// TODO - create some more filters, and add logic to return the appropriate one
		switch (selected) {
		case 0:
			break;
		case 1:
			selectedFilter = new BlueFilter();
			break;
		case 2:
			selectedFilter = new InvertFilter();
			break;
			//		case 3:
			//			selectedFilter = new BrightnessFilter();
			//			break;
			//		case 4:
			//			selectedFilter = new BlurFilter();
			//			break;
			//		case 5:
			//			selectedFilter = new MonochromeFilter();
			//			break;
		case 6:
			selectedFilter = new GrayscaleFilter();
			break;

		default:
			throw new IllegalArgumentException(Integer.toString(selected));
		}
		return selectedFilter;
		
	}
}