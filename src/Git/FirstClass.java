package Git;

public class ScreenShotEX {

	public static void main(String[] args) {
		System.out.println("Hello World");

	}
public static void takeScreenShot(String fileName) throws IOException {
		String path =".\\screenshots";
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path+fileName+".png"));
	}
}
