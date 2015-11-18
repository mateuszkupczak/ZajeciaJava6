package com.kupczak.javatraining;
 
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean(name="imagesView")
public class ImagesView {
    
    private List<String> images;
    private String image;
    
    @PostConstruct
    public void init() {
    	images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("pic" + i + ".jpg");
        }
    }
    
    public List<String> getImages() {
        return images;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
    }
}