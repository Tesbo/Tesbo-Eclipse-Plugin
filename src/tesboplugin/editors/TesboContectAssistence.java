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

public class TesboContectAssistence implements IContentAssistProcessor {

	 public static final String[] PROPOSALS = new String[] {"Test:","Step:","Verify:","End","Click","from list","offset","and hold","Scroll","and click","Right click","Double click",
	            "Print","Capture screenshot","Capture screenshot of","Clear cookies","Clear cache",
	            "Press","Enter","tab","Tab","plus A","plus C","plus V","ctrl","clear","Upload file","Get page source","Open URL",
	            "Switch","active element","alert","accept","close","cancel","Verify text","default content","frame using id","frame using name",
	            "parent frame","main frame","frame","new window","main window","parent window","Navigate","back","forward","refresh page","bottom",
	            "top","horizontal","text","index","value","Window resize","Window minimize","Window maximize",
	            "Mouse hover","Close window","size","Not equal","equal","ignore case","contains","start with","end with",
	            "number","alphanumeric","displayed","present","visible","page title","get cookies","check","is available","current URL",
	            "is equal to","equal to","is contains","Pause","disappear","clickable","display","sec","coordinate","first element","last element",
	            "less then","grater then","Select", "using text","using value","using index"};
	

	@Override
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		IDocument document = viewer.getDocument();

		try {

			
			
			int lineNumber = document.getLineOfOffset(offset);
			
			int lineOffset = document.getLineOffset(lineNumber);
			
			
			

			int lineTextLenght = offset - lineOffset;
			
			
			String lineStartToOffsetValue = document.get(lineOffset, lineTextLenght).toLowerCase();

			

			System.out.println("+++++++++++++++++++++++++++++++");
			System.out.println("offset" + offset);
			System.out.println("lineNumber  " + lineNumber);
			System.out.println("lineOffset  " + lineOffset);
			System.out.println("lineTextLenght  " + lineTextLenght);
			System.out.println("lineStartToOffsetValue  " + lineStartToOffsetValue);

			
			
			String [] LineArray = 
					lineStartToOffsetValue.split(" ");
			
				for (int i = 0; i< LineArray.length;i++)
				{		System.out.println("LineArray[ "+i+"]"+ LineArray[i]);	
				}
				
				System.out.println("Start With " + LineArray[LineArray.length-1]);
				System.out.println("-------------------------------");
			
				
				
				
				
				
				
				
				
			return Arrays.asList(PROPOSALS).stream()
					.filter(proposal -> 
							 proposal.toLowerCase().startsWith(LineArray[LineArray.length-1]))
					.map(proposal -> new CompletionProposal(proposal, (offset-LineArray[LineArray.length-1].length()), LineArray[LineArray.length-1].length(), proposal.length()))
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
