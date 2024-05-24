public class Triangolo implements Forma{

    private Integer width;
    private Integer length;

    // the class constructor
    public Triangolo(Integer width,Integer length){
        this.width = width;
        this.length = length;
    }

    // the get and set methods
    public Integer getWidth(){
        return width;
    }
    public void setWidth(Integer width){
        this.width = width;
    }
    public Integer getLength(){
        return length;
    }
    public void setLength(Integer length){
        this.length = length;
    }

    @Override
    public Integer calcolaArea() {
        return (this.length * this.width) /2;
    }

    // toString method

    @Override
    public String toString() {
        return "Triangolo{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
