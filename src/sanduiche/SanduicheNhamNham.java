package sanduiche;

import interfaces.Queijo;
import interfaces.Tomate;
import queijo.QueijoCheddar;
import tomate.TomateCereja;

public class SanduicheNhamNham extends Sanduiche{
	@Override
	protected Queijo pegaQueijo() {
		return new QueijoCheddar();
	}
	
	@Override
	protected Tomate pegaTomate() {
		return new TomateCereja();
	}

}
