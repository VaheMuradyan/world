import java.text.SimpleDateFormat;
import java.util.Date;
enum Color {
    Red, Green, Yellow, Black, White
}
public class Cell {
    private String value;
    private  Color color;


    Cell(String value){
        setValue(value);
        setColor("White");
    }
    Cell(Cell ob){
        setValue(ob.value);
        setColor(ob);
    }
    Cell(){ }
    Cell(Cell ob, String color){
        setValue(ob.value);
        setColor(color);
    }
    public void setValue(String ban){
        this.value = ban.length() > 0 ? ban : " ";
    }

    public String getValue(){
        return value;
    }
    public Color getColor(){
        return color;
    }

    public int toInt() throws NumberFormatException{
        int val = Integer.parseInt(value);
        return val;
    }

    public double toDouble() throws NumberFormatException {
        double val = Double.parseDouble(value);
        return val;
    }

    public Date toDate() throws Exception{
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(value);
        return date;
    }

    public void setColor(Cell ob){
        this.color = ob.color;
    }
    public void setColor(String color){
        if(color.equals("Red") || color.equals("Green") || color.equals("Yellow") || color.equals("Black") || color.equals("White")) {
            switch (color) {
                case "Red":
                    this.color = Color.Red;
                    break;
                case "Green":
                    this.color = Color.Green;
                    break;
                case "Yellow":
                    this.color = Color.Yellow;
                    break;
                case "Black":
                    this.color = Color.Black;
                    break;
                case "White":
                    this.color = Color.White;
                    break;
            }
        } else {
            this.color = Color.White;
        }
    }
    public void reset(){
        value = " ";
        color = Color.White;
    }
}
