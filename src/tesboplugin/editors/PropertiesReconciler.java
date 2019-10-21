package tesboplugin.editors;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.PatternRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;



public class PropertiesReconciler extends PresentationReconciler {

   

    public PropertiesReconciler() {
    	
      	Color redColor = Display.getCurrent().getSystemColor(SWT.COLOR_DARK_RED);
		 Color commentColor = Display.getCurrent().getSystemColor(SWT.COLOR_DARK_GREEN);
	        RuleBasedScanner scanner = new RuleBasedScanner();
	        
	        SingleLineRule quote = new SingleLineRule("'", "'", new Token(new TextAttribute(new Color(Display.getCurrent(),234,177, 63))));
	        SingleLineRule quote2 = new SingleLineRule("\"", "\"", new Token(new TextAttribute(new Color(Display.getCurrent(),234,177,63))));
	       
	        TesboKeywordRule wordRule = new TesboKeywordRule();
	        
	        PatternRule patternRule = new PatternRule("//", null, new Token(new TextAttribute(commentColor)), (char)0, true);
	       
	        PatternRule locatorRule = new PatternRule("@", " ", new Token(new TextAttribute(new Color(Display.getCurrent(), 215,79,102))), (char)0, true);

	        PatternRule TestRule = new PatternRule("Test:", null, new Token(new TextAttribute(new Color(Display.getCurrent(), 243,67,62))), (char)0, true);
	       
	        
	        scanner.setRules(new IRule[] { quote, quote2, wordRule, patternRule,locatorRule,TestRule});
	        
	        
	        
	        
	        DefaultDamagerRepairer dr = new DefaultDamagerRepairer(scanner);
	        this.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
	        this.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
    }
    
    
    
    
}