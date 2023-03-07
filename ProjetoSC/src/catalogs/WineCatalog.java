package catalogs;

import java.io.File;
import java.util.List;

import entities.Wine;

public class WineCatalog {

	private List<Wine> wines;
	
	// Construtor WineCatalog (tirar duvidas com o stor primeiro)
	
	/**
	 * @return the wines
	 */
	public List<Wine> getWines() {
		return this.wines;
	}
	
	public Wine getWine(String wineName) {
		for (Wine w : this.wines)
			if (w.getName().equals(wineName))
				return w;
		return null;
	}

	public boolean addWine(String wineName, File image) {
		if(getWine(wineName) != null) {
			return false;
		}
		this.wines.add(new Wine(wineName, image));
		return true;
	}
	
	public boolean view(String wineName) {
		Wine wine = this.getWine(wineName);
		if (wine == null) {
			return false;
		}
		System.out.println("Informações sobre o vinho: \n");
		System.out.println(wine);

		return true;
	}
}