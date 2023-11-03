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
public class ZipController {
    private ZipModel model;
    private ZipView view;

    public ZipController(ZipModel model, ZipView view) {
        this.model = model;
        this.view = view;
    }

    public void run() throws IOException {
        while (true) {
            view.printMain();
            int choose = view.checkIntLimit(1, 3);
            switch (choose) {
                case 1:
                    zipFile();
                    break;
                case 2:
                    unzipFile();
                    break;
                case 3:
                    return;
            }
        }
    }

    private void zipFile() throws IOException {
        System.out.print("Enter Source Folder: ");
        String pathSrc = view.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathCompress = view.checkString();
        System.out.print("Enter Name: ");
        String fileZipName = view.checkString();

        boolean check = model.compressTo(pathSrc, fileZipName, pathCompress);
        if (check) {
            System.out.println("Successfully");
        } else {
            System.out.println("Fail");
        }
    }

    private void unzipFile() throws IOException {
        System.out.print("Enter Source file: ");
        String pathZipFile = view.checkString();
        System.out.print("Enter Destination Folder: ");
        String pathExtract = view.checkString();
        boolean check = model.extractTo(pathZipFile, pathExtract);
        if (check) {
            System.out.println("Successfully");
        } else {
            System.out.println("Fail");
        }
    }
}
