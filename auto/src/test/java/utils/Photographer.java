package utils;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.auto.utility.Time;

import TestBase.BaseClass;

public class Photographer extends BaseClass {
	public static void captureShot(String nameToStoreShotWith) {
		TakesScreenshot shooter = (TakesScreenshot)driver;
		var src = shooter.getScreenshotAs(OutputType.FILE);
		try {
				FileUtils.copyFile(src, new File(MessageFormat.format("./screenshots/{0}-{1}.png",nameToStoreShotWith,Time.getDateTime())));
		} catch (IOException e) {
			System.out.println("Error occure while trying to save screenshot taken");
			e.printStackTrace();
		}
	}
}
