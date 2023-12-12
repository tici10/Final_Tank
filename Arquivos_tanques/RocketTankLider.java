
package TankImplementation;

import TankSimulation.BlocoCenario;
import TankSimulation.Tank;
import TankSimulation.TankArena;
import javaengine.CSprite;
import javaengine.CTempo;
import TankImplementation.RocketTank;

public class RocketTankLider extends Tank {
	public RocketTankLider(CSprite[] sprite, TankArena arena) {
		super(sprite, arena);
	}

	@Override
	public void executa() {
		if(RocketTank(temPowerUp())){
			movePara(new BlocoCenario(9,9));
		}else if (temPowerUp()) {
			movePara(new BlocoCenario(5,4));
		}else {
			movePara(new BlocoCenario(9,9));
		}
	}
	private boolean RocketTank(boolean temPowerUp) {
		// TODO Auto-generated method stub
		return false;
	}
}
