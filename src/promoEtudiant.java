import java.util.Scanner;

public class promoEtudiant
{
    public static void main(String[] args)
    {
        // Variable
        String input, name, dateNaissance;
        double moyenne;
        int idEtudiant;
        boolean exit = false, result;
        Etudiant etudiant;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Promotion
        Promotion promo = new Promotion();

        // Message de bienvenue
        System.out.println("Bonjour, bienvenue dans votre programme de gestion étudiants");

        // Pré saisie de valeur
        do {
            System.out.println("Souhaitez vous commencer avec des valeur prédéfini (oui/non)");

            // Saisie utilisateur
            System.out.print("> ");
            input = scanner.nextLine();
        }while (!input.equals("oui") && !input.equals("non"));
        if(input.equals("oui")) {
            promo.addEtudiant(new Etudiant("Bob", "12/05/2000", 13));
            promo.addEtudiant(new Etudiant("Alice", "26/11/1999", 17));
            promo.addEtudiant(new Etudiant("Pierre", "01/02/2000", 13));
        }

        // Boucle du menu console
        do {
            // Demander à l'utilisateur ce qu'il souhaite faire
            System.out.println("Menu principal, que souhaitez vous faire ? (list, ajouter, éditer, moyenne, quitter)");

            // Saisie utilisateur
            System.out.print("> ");
            input = scanner.nextLine();

            // Selon la saisie utilisateur
            switch (input){
                case "list" :
                    System.out.println(promo);
                    break;
                case "ajouter":
                    if(promo.getNbEtudiants() < 40) {
                        System.out.print("Nom de l'étudiant : ");
                        name = scanner.nextLine();
                        System.out.print("Date de naissance : ");
                        dateNaissance = scanner.nextLine();
                        System.out.print("Moyenne : ");
                        moyenne = Double.parseDouble(scanner.nextLine());
                        result = promo.addEtudiant(new Etudiant(name, dateNaissance, moyenne));
                        if(!result) System.out.println("Erreur lors de l'ajout de l'étudiant");
                    }
                    else System.out.println("La promotion contient déjà 40 étudiants");
                    break;
                case "éditer":
                    System.out.println(promo.getNameList());
                    do {
                        System.out.print("Numéro de l'étudiant que vous souhaitez modifier : ");
                        idEtudiant = Integer.parseInt(scanner.nextLine());
                        if((idEtudiant > 0) && (idEtudiant <= promo.getNbEtudiants()))
                        {
                            etudiant = promo.getEtudiants().get(idEtudiant-1);
                            System.out.println(etudiant.toString());
                            System.out.print("Nouvelle moyenne de l'étudiant : ");
                            moyenne = Double.parseDouble(scanner.nextLine());
                            etudiant.setMoyenne(moyenne);
                            idEtudiant = 0;
                        }
                        else if(idEtudiant == 0) System.out.println("Retour au menu principal");
                        else System.out.println("Numéro d'étudiant invalide");
                    } while (idEtudiant != 0);
                    break;
                case "moyenne":
                    System.out.println("La moyenne général de la promotion est de " + promo.getMoyenneGeneral());
                    break;
                case "quitter":
                    exit = true;
                    break;
                default:
                    System.out.println("Commande invalide");
                    break;
            }
        }while (!exit); // tan que la sortie n'est pas vrai

        // message de fin
        System.out.println("Au revoir et à bientôt !");
    }
}
