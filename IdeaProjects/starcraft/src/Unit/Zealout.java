package unit;
import data.Unit;
public class Zealout extends Unit{
    private int shield = 10;

    public Zealout() {
        super("Zealout", 100, 12);
    }
    @Override
    public String getDamage(Unit unit) {
        if(shield < 0) {
            return super.getDamage(unit);
        }else {
            shield -= unit.getAttackPoint();
            return super.getName()+ "가 "+ unit.getName()+ "한테 "
                    + unit.getAttackPoint() + "딜을 받았다";
        }

    }
}