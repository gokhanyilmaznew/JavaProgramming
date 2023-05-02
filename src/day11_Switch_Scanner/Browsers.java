package day11_Switch_Scanner;

public class Browsers {

    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";
        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" || browserName == "safari" || browserName == "edge";

        if (validBrowser) {

            if (browserName == "crome") {
                result = "Crome Browser is Selected";
            } else if (browserName == "firefox") {
                result = "FireFox is Selected";
            } else if (browserName == "opera") {
                result = "Opera is Selected";
            } else if (browserName == "safari") {
                result = "Safari Browser is Selected";
            } else {
                result = "Edge Browser is selected";
            }
        } else {
            result = "Invalid Browser Name";
        }
        System.out.println(result);

    }
}


















