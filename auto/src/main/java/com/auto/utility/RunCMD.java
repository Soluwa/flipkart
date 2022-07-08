package com.auto.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class RunCMD {
	public static void runCommand(String commandToRun) {
		try {
			Process process = Runtime.getRuntime().exec(commandToRun);
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(MessageFormat.format("Unable to run command: {0}", commandToRun));
		}
	}
}
