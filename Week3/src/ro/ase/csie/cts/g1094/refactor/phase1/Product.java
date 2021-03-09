package ro.ase.csie.cts.g1094.refactor.phase1;

public class Product {
	public float computePriceWithDiscount(int productType, float initialPrice, int accountAge)
	  {
	    float finalPrice = 0;
	    float fidelityDiscount = (accountAge > 10) ? (float)15/100 : (float)accountAge/100; 
	    if (productType == 1)
	    {
	      finalPrice = initialPrice;
	    }
	    else if (productType == 2)
	    {
	      finalPrice = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	      finalPrice = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	      finalPrice = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	  }
}