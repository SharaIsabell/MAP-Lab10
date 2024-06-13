package sanduiche;

import interfaces.Pao;
import interfaces.Queijo;
import pao.PaoIntegral;
import queijo.QueijoPrato;

public class Natuiche extends Sanduiche{
	
	@Override
	protected Pao pegaPao() {
		return new PaoIntegral();
	}
	
	@Override
	protected Queijo pegaQueijo() {
		return new QueijoPrato();
	}

}
