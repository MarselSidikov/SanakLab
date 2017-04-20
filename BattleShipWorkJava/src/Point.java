/**
 * Created by Samat Khairutdinov on 07.04.17 20:04.
 * BattleShipWork
 */
public class Point {

    private Ship ship = null;

    private PointStatus pointStatus;

    private boolean open = false;

    public static Point defaultPoint (){
        return  new Point();
    }

    boolean hasShip(){
        return ship != null;
    }
}
