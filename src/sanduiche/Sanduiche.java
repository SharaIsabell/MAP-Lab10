package sanduiche;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import interfaces.Tomate;
import ovo.OvoGranja;
import pao.PaoFrances;
import presunto.PresuntoFrango;
import queijo.QueijoMussarela;
import tomate.TomateComum;

public class Sanduiche {
	
	protected Pao pegaPao() {
		return new PaoFrances();
	}
	
	protected Tomate pegaTomate() {
		return new TomateComum();
	}
	
	protected Queijo pegaQueijo() {
		return new QueijoMussarela();
	}
	
	protected Ovo pegaOvo() {
		return new OvoGranja();
	}
	
	protected Presunto pegaPresunto() {
		return new PresuntoFrango();
	}
	
	public void fazerSanduiche() {
		pegaPao().fatiaPao();
		pegaTomate().fatiasTomate();
		pegaQueijo().fatiaQueijo();
		pegaOvo().tipoOvo();
		pegaPresunto().fatiaPresunto();
		pegaPao().fatiaPao();
	}

}
