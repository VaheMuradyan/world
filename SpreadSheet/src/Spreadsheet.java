public class Spreadsheet {
    private int rows;
    private int cols;

    Cell[][] arr;
    Spreadsheet(int x, int y){
        rows = x > 0 ? x : 0;
        cols = y > 0 ? y : 0;
        arr = new Cell[rows][cols];
    }

    public void setCellAt(int x, int y, Cell ob) throws ArrayIndexOutOfBoundsException{

            arr[x][y] = new Cell(ob);
    }

    public void setCellAt(int x, int y, String line) throws ArrayIndexOutOfBoundsException {

            arr[x][y] = new Cell(line);
    }

    public Cell getCell(int x, int y) throws ArrayIndexOutOfBoundsException{

            return arr[x][y];

    }





}
