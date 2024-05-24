public class Rettangolo implements Forma{
       private Integer width;
       private Integer length;

    // the class constructor
    public Rettangolo(Integer width,Integer length){
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

    //override method to calculate area
    @Override
    public Integer calcolaArea() {
        return this.length * this.width;
    }

    // to string method

    @Override
    public String toString() {
        return "Rettangolo {" +
                "width = " + width +
                ", length = " + length +
                '}';
    }
}
