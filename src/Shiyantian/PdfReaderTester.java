package Shiyantian;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


import org.apache.pdfbox.exceptions.CryptographyException;
import org.apache.pdfbox.exceptions.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

// Reads a pdf file and output the texts.

public class PdfReaderTester {
	public static void main(String[] args){
		PDDocument document;
		File f = new File("resources/Albatrans-91.06-91.10-Dépliant-hiver1.pdf");
		try {
			document = PDDocument.load(f.toURI().toURL());

			document.getClass();
			if( document.isEncrypted() )
			{
				try
				{
					document.decrypt( "" );
				}
				catch( InvalidPasswordException e )
				{
					System.err.println( "Error: Document is encrypted with a password." );
					System.exit( 1 );
				} catch (CryptographyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			PDFTextStripper stripper = new PDFTextStripper();
			String st = stripper.getText(document);
			PrintWriter out = new PrintWriter("textformat.txt");
			out.println(st);
			out.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}