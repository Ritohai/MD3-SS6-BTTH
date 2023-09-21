package TH1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String display() {
        return "width = " + width + " height = " + height;
    }

    public String getArea() {
        return "Diện tích: " + height * width;
    }
    public String getPerimeter(){
        return "Chu vi là : "+ (2*(width+height));
    }
}
