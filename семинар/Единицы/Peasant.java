package Units;

import java.util.ArrayList;

public class Peasant extends Unit {

    protected boolean readiness;

    public Peasant(String name, ArrayList<Unit> team, int x, int y) {
        super(name, 10, 0.5f, 1, 1, 0, team, x, y);
        this.readiness = true;
    }

    @Override
    public String toString() {
        return "Пизант";
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }

    @Override
    public void step(ArrayList<Unit> enemy) {
<<<<<<< HEAD:семинар/Units/Peasant.java
    }
}
=======
        if (readiness) {
            
        }else{
            readiness = true;
        }
    }
}
>>>>>>> dcf96e67958f41786d4bb7565e87434f355361a0:семинар/Единицы/Peasant.java
