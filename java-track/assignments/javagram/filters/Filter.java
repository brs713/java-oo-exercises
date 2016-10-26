package javagram.filters;

import javagram.Picture;

public interface Filter {
	
	public Picture process(Picture original);

}


//TODO List
	//1 - filter interface				*
	//2 - filter select menu			*
	//3 - 2 or more filters				*done
	//4 - overwrite verification		*done

// verify entry is numeric - javagram.java after filter menu list (ln# 55)
// check try/catch in main for getFilter()


//Hacker
	//1 - transformations				*
	//		-flips (horiz or vert)		*
	//		-rotation					*
	//2 - multiple filter application	*

//Comment
//Format
//Submit



//Notes / Tracking
	// Chris Bay walkthrough :  https://www.youtube.com/watch?v=WwrkB_Tw8fY&feature=youtu.be
		// Program first run @ 4:30

	//javagram		private static Filter getFilter(int selected) {}
		// can't instantiate type Filter




//
//int selection = -1;
//do {
//
//	try {
//		selection = in.nextInt();
//		if (selection < 0 || selection > 6) {
//			System.out.println("Gotta pick a menu item:  ");
//			selection = in.nextInt();
//		}
//	}
//	catch (InputMismatchException e) {
//		System.out.println("Input Mismatch:  Entry needs to be numeric.  Please try again:");		//TODO fix phrasing
//		in.next();				
//	}
//
//} while (selection < 0 || selection > 6);
//System.out.println("do/while try/catch complete.");
//
