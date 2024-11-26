public class GestionnaireNotes {

    /**
     * on fait une fonction qui affiche le nom, les notes et la moyennes de l'élèves
     * 
     * @param nomEtudiant donne le nom de l'étudiant
     * @param notes un tableau avec toutes les notes de l'éleves
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        affichageNote(nomEtudiant, notes[]);
        somme = sommeNotes(notes[]);
        affichageMoyenne(somme);
    }
    
    /**
     * on fait une fonction qui Affichage des notes
     * 
     * @param nomEtudiant donne le nom de l'étudiant
     * @param notes un tableau avec toutes les notes de l'éleves
     */
    public void affichageNote(String nomEtudiant, int[] notes){
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * on fait une fonction qui calcule la somme de la moyenne
     * 
     * @param notes un tableau avec toutes les notes de l'éleves
     */
    public int sommeNotes(int[] notes){
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return somme;
    }

    /**
     * on fait une fonction qui Affichage la moyenne
     * 
     * @param nomEtudiant donne le nom de l'étudiant
     */
    public void affichageMoyenne(int somme){
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }
}
