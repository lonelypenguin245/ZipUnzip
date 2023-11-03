/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZipandUnzip;

import java.io.IOException;

/**
 *
 * @author HI
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ZipModel model = new ZipModel();
        ZipView view = new ZipView();
        ZipController controller = new ZipController(model, view);

        controller.run();
    }
}
