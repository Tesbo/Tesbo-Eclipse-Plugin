package tesboplugin.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class TesboDetector implements IWordDetector {
	public boolean isWordStart(char c) {
		return Character.isAlphabetic(c) ;
	}

	public boolean isWordPart(char c) {
		
		
		return Character.isAlphabetic(c) || c == ':';
	}
}
