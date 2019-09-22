package org.trabalhopersistencia.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javassist.expr.NewArray;

public class CSVFileReader implements Closeable{
	
	private File csvFile;
	private String delim;
	private List<String> head;
	private List<String> line;
	private BufferedReader reader;
	
	public CSVFileReader(File csvFile) throws IOException{
		this(csvFile, ";");		
	}
	
	public CSVFileReader(File csvFile, String delim) throws IOException{
		this.csvFile = csvFile;
		this.delim = delim;
		this.head = new ArrayList<String>();
		this.line = new ArrayList<String>();
		
		this.reader = new BufferedReader(new FileReader(csvFile));
		String head = reader.readLine();
		String split[] = head.split(delim);	
		for(String h : split) {
			this.head.add(h);
		}
	}
	
	public List<String> readCSVLine() throws IOException {		
		this.line.clear();
		if(!this.reader.ready())
			return null;
		
		String line = reader.readLine();
		String split[] = line.split(this.delim);
		
		for(String str : split) {
			this.line.add(str);
		}
		
		return this.line;
	}
	
	public boolean ready() throws IOException {
		return this.reader.ready();
	}
	
	public List<String> getCSVHead(){
		return this.head;
	}

	@Override
	public void close() throws IOException {
		reader.close();
	}
		
}
