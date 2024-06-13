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
	
	public String fazerSanduiche() {
		return pegaPao().fatiaPao() + "\n" + pegaTomate().fatiasTomate() + "\n" + pegaQueijo().fatiaQueijo() + "\n"
				+ pegaOvo().tipoOvo() + "\n" + pegaPresunto().fatiaPresunto() + "\n" + pegaPao().fatiaPao();
	}

}
