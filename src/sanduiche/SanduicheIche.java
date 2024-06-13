package sanduiche;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import ovo.OvoCapoeira;
import pao.PaoBola;
import presunto.PresuntoPeru;

public class SanduicheIche extends Sanduiche{
	
	@Override
	protected Pao pegaPao() {
		return new PaoBola();
	}
	
	@Override
	protected Presunto pegaPresunto() {
		return new PresuntoPeru();
	}
	
	@Override
	protected Ovo pegaOvo() {
		return new OvoCapoeira();
	}

}
