package tesboplugin.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.Color;

import org.eclipse.swt.widgets.Display;

public class TesboKeywordRule extends WordRule {

	public TesboKeywordRule() {
		super(new TesboDetector());

		String tesboKeyword[] = { "click", "Click", "from", "From","list","List", "offset", "Offset", "and", "And", "hold",
				"Hold", "click", "Click", "scroll", "Scroll", "right", "Right", "click", "Click", "double", "Double",
				"print", "Print", "capture", "Capture", "Screenshot", "screenshot", "of", "clear", "Clear", "cookies",
				"Cookies", "cache", "Cache", "press", "Press", "Enter", "enter", "tab", "Tab", "plus", "Plus", "ctrl",
				"Ctrl", "clear", "Clear", "upload", "Upload", "file", "File", "Get", "get", "Page", "page", "source",
				"Source", "Open", "open", "url", "URL", "Url", "switch", "Switch", "active", "Active", "element",
				"Element", "alert", "Alert", "accept", "Accept", "close", "Close", "cancel", "Cancel", "verify",
				"Verify", "text", "Text", "default", "Default", "content", "Content", "frame", "Frame", "using",
				"Using", "id", "Id", "name", "Name", "parent", "Parent", "main", "Main", "new", "New", "window",
				"Window", "navigate", "Navigate", "back", "Back", "forward", "Forward", "Refresh", "refresh", "bottom",
				"Bottom", "top", "Top", "horizontal", "Horizontal", "text", "Text", "index", "Index", "value", "Value",
				"Resize", "resize", "Minimize", "minimize", "Maximize", "maximize", "Mouse", "Mouse", "Hover", "hover",
				"size", "size", "Not", "not", "equal", "Equal", "ignore", "Ignore", "case", "Case", "contains",
				"Contains", "start", "Start", "With", "with", "end", "number", "Number", "alphanumeric",
				"Alphanumeric", "displayed", "Displayed", "present", "Present", "visible", "Visible", "title", "Title",
				"check", "Check", "available", "Available", "Current", "current", "pause", "Pause", "disappear",
				"Disappear", "clickable", "Clickable", "display", "Display", "sec", "Sec", "SEC", "coordinate",
				"Coordinate","last","Last","First","first","grater","Grater","then","Then","Deselect","deselect","Select","select"};

		Color VerifyColor = new Color(Display.getCurrent(), 0, 204, 0);
		Color tesboKeysColor = new Color(Display.getCurrent(), 179, 89, 0);
		Color StepColor = new Color(Display.getCurrent(), 153, 51, 255);
		Color dataSet = new Color(Display.getCurrent(), 71, 209, 209);
		Color ifCondition = new Color(Display.getCurrent(), 102, 0, 102);

		addWord("Step:", new Token(new TextAttribute(StepColor)));
		addWord("Verify:", new Token(new TextAttribute(VerifyColor)));
		addWord("End", new Token(new TextAttribute(new Color(Display.getCurrent(), 0, 0, 255))));
		addWord("DataSet:", new Token(new TextAttribute(dataSet)));
		addWord("If::", new Token(new TextAttribute(ifCondition)));
		addWord("Else", new Token(new TextAttribute(ifCondition)));
		addWord("Else::", new Token(new TextAttribute(ifCondition)));
		addWord("End::", new Token(new TextAttribute(ifCondition)));
		addWord("Session:", new Token(new TextAttribute(dataSet)));

		
		
		
		for(int i = 0;i < tesboKeyword.length;i++) { 
		  addWord(tesboKeyword[i], new Token(new TextAttribute(tesboKeysColor)));
		 
		}
		 


		// TODO Auto-generated constructor stub
	}

}
