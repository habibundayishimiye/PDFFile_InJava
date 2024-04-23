import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class MyPDF {
    public static void main(String args[]) {
        Document d=new Document();
        try {
            File f=new File("C:\\Programmer Hab Jass\\Year2 Notes\\Trimester 3\\Java Programming\\PDFFile\\PDF1.pdf");
            PdfWriter pd=PdfWriter.getInstance(d,new FileOutputStream(f));
            d.open();
            Paragraph p =new Paragraph("Welcome to Java PDF");
            d.add(p);
            d.addAuthor("Silas");
            d.addTitle("Java for PDF");
            for (int i=1;i<=100;i++) {
                d.add(new Paragraph(i+". I like Java"));
            }
            d.close();
            System.out.println("PDF File Created!");
        }
        catch(Exception e) {
            System.out.print(e);
        }
    }

}