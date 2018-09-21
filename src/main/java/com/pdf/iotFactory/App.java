package com.pdf.iotFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.ZonedDateTime;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Hello world!
 *
 */
public class App {

	public static final String imageURL = "/home/luis/Imágenes/hipster512_opt.png";

	public static void main(String[] args) throws DocumentException, IOException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("/home/luis/Documentos/hello.pdf"));
		document.open();
		document.add(createFirstTable());
		document.close();

	}

	public static PdfPTable createFirstTable() throws DocumentException, IOException {
		PdfPTable table = new PdfPTable(11);
		table.setWidthPercentage(100);
		//table.addCell(createImageCell(imageURL));
		table.addCell(createCell(1, 3, "IMG", true, CellSide.NONE));
		table.addCell(createCell(6, 3, "IQ COMERCIALIZADORA Y SERVICIOS DE VALOR S.A. DE C.V.", true, CellSide.NONE));
		table.addCell(createCell(1, 1, "Fecha", true, CellSide.RIGHT));
		table.addCell(createCell(1, 1, ZonedDateTime.now().toLocalDate().toString(), false, CellSide.LEFT));
		table.addCell(createCell(1, 1, "Producto", true, CellSide.RIGHT));
		table.addCell(createCell(1, 1, "Rastreo", false, CellSide.LEFT));
		table.addCell(createCell(1, 1, "Inicio", true, CellSide.RIGHT));
		table.addCell(createCell(1, 1, "29/07/1990", false, CellSide.LEFT));
		table.addCell(createCell(1, 1, "Fin", true, CellSide.RIGHT));
		table.addCell(createCell(1, 1, "29/07/1990", false, CellSide.LEFT));
		table.addCell(createCell(2, 1, "Número de serie", true, CellSide.RIGHT));
		table.addCell(createCell(2, 1, "kamehameha", false, CellSide.LEFT));

		table.addCell(createCell(2, 1, "cita", true, CellSide.NONE));
		table.addCell(createCell(3, 1, "No.", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Marca", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Submarca", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Modelo", true, CellSide.NONE));

		table.addCell(createCell(5, 1, "Cliente", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Color", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Placas", true, CellSide.NONE));
		table.addCell(createCell(2, 1, "Km", true, CellSide.NONE));

		table.addCell(createCell(5, 1, "Responsable", true, CellSide.NONE));
		table.addCell(createCell(6, 4, "Observaciones del cliente", true, CellSide.NONE));

		table.addCell(createCell(5, 1, "Tecnico", true, CellSide.NONE));
		table.addCell(createCell(5, 1, "Notas:", true, CellSide.BOTTOM));
		table.addCell(createCell(5, 1, " ", true, CellSide.TOP));

		table.addCell(createCell(4, 1, "Generalidades", true, CellSide.NONE));
		table.addCell(createCell(3, 1, "Accesorios del vehículo", true, CellSide.NONE));
		table.addCell(createCell(4, 1, "Funcionalidad", true, CellSide.NONE));

		table.addCell(createCell(2, 1, "Condiciones", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Inicial", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Final", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Accesorio", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Inicial", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Final", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Prueba", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Inicial", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Final", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Testigo encendido", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Antena", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Encendido/apagado", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Apertura y Cierre de puertas correcto", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Tapetes", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Limpiadores y rociadores", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 2, "Apertura y Cierre de puertas correcto", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Tapetes", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Limpiadores y rociadores", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(1, 1, "Placas", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 2, "Intermitentes y direccionales", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Funcion correcta de motor", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Radio", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Ruidos extraños", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Gato", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Luces altas y bajas", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 2, "Funcion correcta de palanca de velocidades", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Extintor", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Luces  de freno y reversa", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(1, 1, "Refaccion", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Luces interiores y cortesía", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Detalles en pintura", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Triangulos", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Luces tablero", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Bateria", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Herramienta", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Faros de niebla", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Funcionamiento de bateria", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Tapones", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Otras Luces", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Derrame de fluidos", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "Rines", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Controles al volante", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Nivel de gasolina", false, CellSide.NONE));
		table.addCell(createCell(2, 1, " ", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "Tapon de gasolina", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Espejos laterales", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(4, 5, "Observaciones", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Cristales", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(1, 2, "Llanta de refacción", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "A/C y calefacción", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(2, 1, "Sistema de audio", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(1, 1, "Cenicero", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Cláxon", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(1, 1, "Manual", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 2, "Encendedor y tomacorreintes", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 2, "N/A", false, CellSide.NONE));

		table.addCell(createCell(4, 1, "Funcion del sistema", true, CellSide.NONE));
		table.addCell(createCell(3, 6, "Observaciones", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Ubicacacion", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Quemacoco / capote", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Inmobilización ( On / Off )", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(4, 5, "Observaciones", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Cláxon", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Llaves ID / escaner biométrico", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Llamada", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Sensor de intrusión", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(3, 1, "Encuesta de satisfaccion", true, CellSide.NONE));

		table.addCell(createCell(3, 1, "Monitoreo ECU", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(3, 2, "¿El personal se identificó de manera correcta?", false, CellSide.NONE));
		table.addCell(createCell(4, 1, "Prueba de manejo", true, CellSide.NONE));

		table.addCell(createCell(3, 1, "Otras", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Testigos", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Otras", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(3, 1, " ", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Ruidos", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Otras", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(3, 2, "¿La instalación fue realizada en tiempo y forma?", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Frenado", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Otras", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Cambio de velocidad", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(4, 7, "Comentarios y sugerencias:", true, CellSide.NONE));
		table.addCell(createCell(3, 1, " ", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Estabilidad motor", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(3, 2, "¿El personal mostró buena disposicion al atenderle?", false, CellSide.NONE));
		table.addCell(createCell(2, 1, "Estabilidad motor", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));
		table.addCell(createCell(1, 1, "N/A", false, CellSide.NONE));

		table.addCell(createCell(4, 5, "Observaciones:", false, CellSide.NONE));

		table.addCell(createCell(3, 1, " ", false, CellSide.NONE));

		table.addCell(createCell(3, 2, "¿Está satisfecho con el servicio realizado?", false, CellSide.NONE));
		table.addCell(createCell(3, 1, " ", false, CellSide.NONE));

		table.addCell(createCell(3, 1, "Nombre y firma de instalador", true, CellSide.NONE));
		table.addCell(createCell(4, 1, "Nombre y firma del cliente", true, CellSide.NONE));
		table.addCell(createCell(4, 1, "Nombre y firma del responsable", true, CellSide.NONE));

		table.addCell(createCell(3, 2, " ", true, CellSide.BOTTOM));
		table.addCell(createCell(4, 2, " ", true, CellSide.BOTTOM));
		table.addCell(createCell(4, 2, " ", true, CellSide.BOTTOM));
		
		table.addCell(createCell(3, 2, " ", true, CellSide.TOP));
		table.addCell(createCell(4, 2, " ", true, CellSide.TOP));
		table.addCell(createCell(4, 2, " ", true, CellSide.TOP));

		table.addCell(createCell(11, 2,
				"Con la firma del presente documento se hace constar que ambas partes están deacuerdo con la información mencionada dentro del mismo y se acepta la conformidad con el servicio proporcionado por la compañía  IQ Comercializadora y Servicios de Valor S.A. de C.V.",
				true, CellSide.NONE));

		return table;
	}

	public static PdfPCell createImageCell(String path) throws DocumentException, IOException {
		Image img = Image.getInstance(path);
		PdfPCell cell = new PdfPCell(img, true);

		return cell;
	}

	private static PdfPCell createCell(int colSize, int rowSize, String text, boolean bold, CellSide side) {
		PdfPCell cell = new PdfPCell();
		cell.setColspan(colSize);
		cell.setRowspan(rowSize);

		cell.disableBorderSide(side.value());

		Font font = FontFactory.getFont("Courier", 6);

		if (bold)
			font.setStyle(Font.BOLD);

		Paragraph p = new Paragraph(text, font);
		p.setAlignment(Element.ALIGN_LEFT);
		cell.addElement(p);
		return cell;
	}

}
