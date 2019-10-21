package tesboplugin.editors;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;



public class TesboKeywordRule extends WordRule {

	public TesboKeywordRule() {
		super(new TesboDetector());
		
		String  tesboKeyword[] = {"click","pause","right","Click","Enter","Pause"};
		
		
		Color VerifyColor= new Color(Display.getCurrent(),202,108, 42);
		Color TestColor= new Color(Display.getCurrent(),169, 234, 58);
		Color CodeColor= new Color(Display.getCurrent(),31, 145, 193);
		Color StepColor= new Color(Display.getCurrent(),70, 132, 43);
		Color tesboKeysColor = new Color(Display.getCurrent(),62,101,208);
		
		
		addWord("Step:", new Token(new TextAttribute(StepColor)));
		addWord("Code:", new Token(new TextAttribute(CodeColor)));
		addWord("Verify:", new Token(new TextAttribute(VerifyColor)));
		addWord("End", new Token(new TextAttribute(new Color(Display.getCurrent(), 243,67,62))));
	//	addWord("Test:", new Token(new TextAttribute(TestColor)));
		
		
		
		for(int i = 0;i < tesboKeyword.length;i++)
		{
			
			addWord(tesboKeyword[i], new Token(new TextAttribute(tesboKeysColor)));
			
			
		}
		
		
		
		
		// TODO Auto-generated constructor stub
	}

}
