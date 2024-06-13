package pao;

import interfaces.Pao;

public class PaoFrances implements Pao{

	public static void main(String[] args) {
		System.out.println("🍞 🥖 🫓");
		System.out.println("🥚");
		System.out.println("🍅");
		System.out.println("🧀");
		System.out.println("🥩");
	}

	@Override
	public String fatiaPao() {
		return "Fatia de pão francês 🥖";
	}
}
