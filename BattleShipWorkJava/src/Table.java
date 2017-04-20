/**
 * Created by Samat Khairutdinov on 07.04.17 20:01.
 * BattleShipWork
 */
public class Table {
    public static final int D = 10;

    private Point[][] points = new Point[D][D];

    public Table(Point[][] points) {
        this.points = points;
    }

    public Table() {
        for(int i = 0; i < D; i++){
            for(int j = 0; j < D; j++){
                points[i][j] = Point.defaultPoint();
            }
        }
    }



    private boolean setShip(int x, int y, /* enum ShipOrientation,*/ int hp){
        return false;
    }



    private int getLeftBorder(int y){
        if(y == 0)
            return y;
        else
            return y-1;
    }
    private int getRightBorder(int y){
        if(y == Table.D-1)
            return y;
        else
            return y+1;
    }
    private int getUpBorder(int x){
        if(x == 0)
            return x;
        else
            return x-1;
    }
    private int getDownBorder(int x){
        if(x == Table.D-1)
            return x;
        else
            return x+1;
    }


    private boolean checkPoint(int x, int y){
        if(x >= 0 && x <= Table.D - 1 && y >= 0 && y <= Table.D - 1) {
            for (int i = getUpBorder(x); i <= getDownBorder(x); i++) {
                for (int j = getLeftBorder(y); j <= getRightBorder(y); j++) {
                    if (points[i][j].hasShip())
                        return false;
                }
            }
        }
        return true;
    }

}
