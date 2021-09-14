package com.PDF;

import com.Base.TestBase;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class CreatePdf extends TestBase {
    public static void main(String[] args) throws DocumentException, IOException {
        firefox_launch();
        OpenUrl("https://demo.opencart.com/");
        CreatePDF();
        firefox_close();

    }

    public static void CreatePDF() throws IOException, DocumentException {
        byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);  //Taking SS As Byte
        Document doc = new Document();

        String output = "./src/main/PDF/NewPdf.pdf";
        FileOutputStream fos = new FileOutputStream(output);
        PdfWriter writer = PdfWriter.getInstance(doc,fos);

        writer.open();
        doc.open();

        Image img = Image.getInstance(input);
        img.scaleToFit(PageSize.A4.getWidth()/2,PageSize.A4.getHeight()/2);

        doc.add(img);
        doc.add(new Paragraph(""));
        doc.close();
        writer.close();
        System.out.println("Pdf Done");


    }
}
