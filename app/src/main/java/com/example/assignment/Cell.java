package com.example.assignment;

public class Cell {
    private String imageUrl;
    private String imageName;

    public Cell(String url, String name) {
        imageUrl = url;
        imageName = name;

    }




    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


}
