public class FactureManager {

    /**
     * on fait une fonction qui calcule le coût total pour une facture
     * elle renvoie le coût totale en fonction du type de commande et du prix totale
     * 
     * @param typeProduit decrit le type de produit
     * @param quantite donne le nombre de produit acheté
     * @param prixUnitaire donne le prix a l'unité du produit
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        total = reduction(typeProduit);
        
        total = CalculPrixTotale(total);

        return total;
    }
    
    /**
     * on fait une fonction qui calcule la reduction a appliqué selon la catégorie
     * elle renvoie le coût totale apres réduction
     * 
     * @param typeProduit decrit le type de produit
     */
    public double reduction(String typeProduit){
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
            return total;
        } 
        else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
            return total;
        } 
        else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
            return total;
        }
    }

    /**
     * on fait une fonction qui fait un réduction si le coût total dépasse 1000€
     * elle renvoie le coût totale apres réduction si reduction sinon rien
     * 
     * @param total decrit le type de produit
     */
    public double CalculPrixTotale(double total){
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
            return total;
        }
    }
}
