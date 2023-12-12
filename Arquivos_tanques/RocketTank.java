//Lucas, Pedro 
package TankImplementation;

import TankSimulation.BlocoCenario;
import TankSimulation.Tank;
import TankSimulation.TankArena;
import javaengine.CSprite;
import javaengine.CTempo;
import TankImplementation.RocketTankLider;

public class RocketTank extends Tank {
	
	public RocketTank(CSprite[] sprite, TankArena arena) {
		super(sprite, arena);
	}

	@Override
	public void executa() {
		if(RocketTankLider(temPowerUp())){
			movePara(new BlocoCenario(1,0));
		}else if (temPowerUp()) {
			movePara(new BlocoCenario(5,4));
		}else {
			movePara(new BlocoCenario(1,0));
		}
	}
	private boolean RocketTankLider(boolean temPowerUp) {
		// TODO Auto-generated method stub
		return false;
	}
}
