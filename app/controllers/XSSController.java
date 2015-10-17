package controllers;

import play.mvc.Controller;

/**
 * User: Paul Zhang
 * Date: 15/10/17
 * Time: 下午4:25
 */
public class XSSController extends Controller {

    public static void xssDemo(String param) {
        render("/xss/demo.html", param);
    }

    public static void storageXssDemo() {
        String result = "<script>alert(/xss/)</script>";
        render("/xss/storage.html", result);
    }

    public static void domBased() {
        render("/xss/dombased.html");
    }
}
