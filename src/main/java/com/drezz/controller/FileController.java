package com.drezz.controller;

import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.drezz.service.FileService;
import net.sourceforge.tess4j.Tesseract;

@Controller
public class FileController {

//@Autowired
//private FileService service;
	
    @GetMapping("/")
    public String getData() {
        return "homefile";
    }
   
    // @PostMapping annotation maps HTTP POST
    // requests onto specific handler methods
    @PostMapping("/upload")
    public String uploadMultipartFile(@RequestParam("file") MultipartFile file) {
    try {
    	String contentType = file.getContentType();
    	if(contentType.equalsIgnoreCase(".pdf") || contentType.equalsIgnoreCase(".jpg")) {
    	Tesseract tesseract = new Tesseract();
    	tesseract.setDatapath("C:\\Program Files\\Tesseract-OCR\\tessdata");
    	String str =tesseract.doOCR((File) file);
        System.out.println(str);
    	}
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return "FileList";
    }
    
    @GetMapping("/")
    public String homepage() {
      return "redirect:/images";
    }

    @GetMapping("/images/new")
    public String newImage(Model model) {
      return "upload_form";
    }

    
    
    @PostMapping("/images/upload")
    public String uploadImage(Model model, @RequestParam("file") MultipartFile file) {
     

      return "upload_form";
    }

    @GetMapping("/images")
    public String getListImages(Model model) {
      

      return "images";
    }

    
}
