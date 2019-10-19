package tesboplugin.editors;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;

public class TesboContentAssistence2 implements IContentAssistProcessor {

	 public static final String[] PROPOSALS = new String[] { "Test:", "Step:", "Verify:" };
	
	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		IDocument document = viewer.getDocument();

		try {
			
			
			int lineOfOffset = document.getLineOfOffset(offset);
			int lineOffset = document.getLineOffset(lineOfOffset);

			int lineTextLenght = offset - lineOffset;
			String lineStartToOffsetValue = document.get(lineOffset, lineTextLenght).toLowerCase();

			return Arrays.asList(PROPOSALS).stream()
					.filter(proposal -> !viewer.getDocument().get().contains(proposal)
							&& proposal.toLowerCase().startsWith(lineStartToOffsetValue))
					.map(proposal -> new CompletionProposal(proposal, lineOffset, lineTextLenght, proposal.length()))
					.toArray(ICompletionProposal[]::new);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return new ICompletionProposal[0];
		
	}

	@Override
	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return null;
	}

	@Override
	public char[] getCompletionProposalAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] getContextInformationAutoActivationCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IContextInformationValidator getContextInformationValidator() {
		// TODO Auto-generated method stub
		return null;
	}

}
