package com.butterbox.cartesianproduct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Class to file Cartesian Product particularly for distance calculations
//  The method CartesianPrdnoDups performs a Cartesian product ignoring same values and values with duplicate distances.
public class CartesianProduct {

	public static List<String> ProductnoDups(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String tmp;
		List<String> lsfile = new ArrayList<String>();
		List<String> crtPrd = new ArrayList<String>();

		while ((tmp = br.readLine()) != null) {
			lsfile.add(tmp);
		}

		for (int j = 0; j <= lsfile.size(); j++) {
			for (int k = j + 1; k < lsfile.size(); k++) {
				// System.out.println(lsfile.get(j) + " "+ lsfile.get(k));
				crtPrd.add(lsfile.get(j) + " " + lsfile.get(k));
			}
		}
		br.close();
		return crtPrd;
	}
	
	public static List<String> Product(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String tmp;
		List<String> lsfile = new ArrayList<String>();
		List<String> crtPrd = new ArrayList<String>();

		while ((tmp = br.readLine()) != null) {
			lsfile.add(tmp);
		}

		for (int j = 0; j < lsfile.size(); j++) {
			for (int k = 0; k < lsfile.size(); k++) {
				// System.out.println(lsfile.get(j) + " "+ lsfile.get(k));
				crtPrd.add(lsfile.get(j) + " " + lsfile.get(k));
			}
		}
		
		br.close();
		return crtPrd;
	}

	// Implementation - for testing purpose
	public static void main(String args[]) throws IOException {
		List<String> list = new ArrayList<String>();
		list = ProductnoDups(args[0]);
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("");
		
		list = Product(args[0]);

		for (String x : list) {
			System.out.println(x);
		}
	}

}
