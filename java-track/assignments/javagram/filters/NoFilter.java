package javagram.filters;

import javagram.Picture;

public class NoFilter implements Filter{

	@Override
	public Picture process(Picture original) {
	
		return original;
	}
}
