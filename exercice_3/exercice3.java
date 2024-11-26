public class StockManager {

    /**
     * on fait une fonction qui gere le stock
     * 
     * @param typeOperation decrit le type d'opération
     * @param quantite donne la quantité de produit
     * @param produit donne le nom du produit
     * @param stock donne le stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        gestion(typeOperation, produit, quantite, stock);
    }
    /**
     * on fait une fonction qui gere le stock suivant la cituation
     * 
     * @param typeOperation decrit le type d'opération
     * @param quantite donne la quantité de produit
     * @param produit donne le nom du produit
     * @param stock donne le stock
     */
    public void gestion(String typeOperation, String produit, int quantite, int stock){
        // Ajout au stock
        if (typeOperation.equals("ajout")) {
            ajout(stock, produit);
        }
        // Retrait du stock
        else if (typeOperation.equals("retrait")){
            retrait
        }
        // Si l'action est inconnu
        else{
            System.out.println("Opération inconnue.");
        }
    }
    /**
     * on fait une fonction qui ajoute un produit au stock
     * 
     * @param produit donne le nom du produit
     * @param stock donne le stock
     */
    public void ajout(int stock, String produit){
        stock += quantite;
            System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }
    /**
     * on fait une fonction qui enleve un produit au stock
     * 
     * @param produit donne le nom du produit
     * @param stock donne le stock
     */
    public void retrait(int stock, String produit){
        if (stock >= quantite) {
                stock -= quantite;
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
    }


}
