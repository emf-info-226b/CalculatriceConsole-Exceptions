package calculatriceconsole;

/**
 * Classe principale de l'application "CalculatriceConsole".
 *
 * @author <a href="mailto:mario.ramalho@edufr.ch">Mario Ramalho</a>
 * @since 17.03.2023
 * @version 1.0
 */
public class CalculatriceConsole {

    /**
     * LA méthode main() de l'application, là où tout commence mais... tout se
     * finit-il bien là ?
     *
     * @param args les arguments pour le programme passés sur la ligne de
     * commande
     */
    public static void main( String[] args ) {
        Calculatrice calculatrice = new Calculatrice();
        System.out.println( "Début de l'application de test de la calculatrice" );

        System.out.println( "Addition de deux nombres 5 et 7" );
        String resultat = "5 + 7 = ";
        int somme = calculatrice.additionne( 5, 7 );
        System.out.print( resultat + somme );
        System.out.println();

        System.out.println( "Addition de 2 nombres 5 et 7 donné en format String" );
        resultat = "5 + 7 = ";
        String sommeStr = calculatrice.additionne( "5", "7" );
        System.out.print( resultat + sommeStr );
        System.out.println();

        System.out.println( "Addition de 2 nombres A et B donné en format String" );
        resultat = "A + B = ";
        sommeStr = calculatrice.additionne( "A", "B" );
        System.out.print( resultat + sommeStr );
        System.out.println();

        System.out.println( "Division de deux nombres 10 et 2 donné en format int" );
        resultat = "10 / 2 = ";
        double sommeDouble = calculatrice.divise( 10, 2 );
        System.out.print( resultat + sommeDouble );
        System.out.println();

        System.out.println( "Division par 0 de 2 nombres 10 et 0 donné en int" );
        resultat = "10 / 0 = ";
        sommeDouble = calculatrice.divise( 10, 0 );
        System.out.print( resultat + sommeDouble );
        System.out.println();
    }
}
