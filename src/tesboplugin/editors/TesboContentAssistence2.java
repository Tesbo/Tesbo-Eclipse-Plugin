package tesboplugin.editors;

import java.util.Arrays;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionListener;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistantExtension2;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class TesboContentAssistence2 implements IContentAssistantExtension2 {

	@Override
	public void addCompletionListener(ICompletionListener listener) {
		// TODO Auto-generated method stub
		System.out.println(listener);
		
	}

	@Override
	public void removeCompletionListener(ICompletionListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRepeatedInvocationMode(boolean cycling) {
		// TODO Auto-generated method stub
		
System.out.println(cycling);
	}

	@Override
	public void setShowEmptyList(boolean showEmpty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusLineVisible(boolean show) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStatusMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmptyMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	

}
