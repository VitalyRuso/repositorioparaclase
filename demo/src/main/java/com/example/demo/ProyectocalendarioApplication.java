package com.example.demo;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectocalendarioApplication {

	public static void main(String[] args) {
		String[] dias = { "Horas", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" };
		String[][] horario = {
				{ "De 08:00 a 08:55", "PROG - PRIM", "ITIN - RDIA0", "ENT - PRIM", "ITIN - RDIA0", "SIST - EM22" },
				{ "De 08:55 a 09:50", "PROG - PRIM", "MARC - JLL00", "ENT - PRIM", "PROG - PRIM", "SIST - EM22" },
				{ "De 09:50 a 10:45", "SIST - EM22", "PROG - PRIM", "BBDD - JO21", "PROG - PRIM", "MARC - JLL00" },
				{ "De 10:45 a 11:15", "Recreo", "Recreo", "Recreo", "Recreo", "Recreo" },
				{ "De 11:15 a 12:10", "SIST - EM22", "PROG - PRIM", "BBDD - JO21", "SIST - EM22", "MARC - JLL00" },
				{ "De 12:10 a 13:05", "OPT - AGOGR", "BBDD - JO21", "BBDD - JO21", "SIST - EM22", "PROG - PRIM" },
				{ "De 13:05 a 14:00", "ITIN - RDIA0", "BBDD - JO21", "PROG - PRIM", "OPT - AGOGR", "BBDD - JO21" } };

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Horario");

		Row header = sheet.createRow(0);
		for (int i = 0; i < dias.length; i++) {
			Cell cell = header.createCell(i);
			cell.setCellValue(dias[i]);
			CellStyle estiloCabecera = workbook.createCellStyle();

			estiloCabecera.setFillBackgroundColor(IndexedColors.AQUA.getIndex());
			estiloCabecera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			cell.setCellStyle(estiloCabecera);
		}

		for (int i = 0; i < horario.length; i++) {
			Row row = sheet.createRow(i + 1);
			for (int j = 0; j < dias.length; j++) {
				row.createCell(j).setCellValue(horario[i][j]);
			}
		}

		// Columnas
		for (int i = 0; i < dias.length; i++) {
			sheet.autoSizeColumn(i);
		}
		// Guardar
		try (FileOutputStream fileOut = new FileOutputStream("HorarioDAM.xlsx")) {
			workbook.write(fileOut);
			workbook.close();
			System.out.println("Archivo creado exitosamente.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
