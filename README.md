# Sujet
## Énoncé
On désire gérer une promotion d'étudiants, sachant qu'une promotion comporte au plus 40 étudiants.

Chaque étudiant est caractérisé par les attributs suivants : un nom, une date de naissance et une moyenne générale de toutes ses notes.

On désire pouvoir :

1. Saisir la liste de tous les étudiants (Saisir nom et date de naissance).
2. Ajouter un étudiant sur la liste en cours d'année et modifier la moyenne d'un étudiant.
3. Afficher la liste de tous les étudiants avec leur moyenne.
4. Afficher la moyenne générale de tous les étudiants.

## Étapes de réalisation
1. Créer 2 classes : la classe Etudiant et la classe Promotion

### Classe Etudiant
Attributs privé
- Nom : CC
- DataNaissance : CC
- Moyenne : Double

Méthodes publiques
+ ~~Etudiant()~~ _Retiré car étudiant inutilisable sans attributs_
+ Etudiant(CC, CC, Double)
+ ~~Afficher()~~ _Transformé en toString() pour pouvoir l'utiliser dans plus de contexte_
+ modifierMoyenne(Double) _renommé setMoyenne(Double)_
+ getNom() : CC
+ ~~saisirEtudiant()~~ _Ce fait via la classe d'utilisation en utilisant le constructeur_

### Classe Promotion
Attributs privé
- Tab : collection d'étudiants
- ~~nbEtudiants : Entier~~ _remplacer par la méthode getNbEtudiants qui récupère la taille de tab_

Méthodes publiques
+ Promotion()
+ Promotion(collection d'étudiant)
+ ~~initialisationTab()~~ _inclus dans le constructeur_
+ ~~Afficher()~~ _même chose que la classe Etudiant_
+ getMoyenneGeneral() : double
+ ajouterEtudiant()

# Information Complémentaire
## Installation
1) Pour les testes unitaire, importé JUnit 5.4.
2) Puis, via MAVEN, installer la librairie `org.hamcrest:hamcrest:2.22`

## Emplacement Fichier
- L'agorithme ce trouve dans le fichier `algoMenu.txt`
- Les classes Promotion et Etudiant ce trouve dans le dossier `src`
- Le programme d'utilisation des classes est aussi dans le dossier `src` et ce nomme `promoEtudiant.java`
- Les classes de tests ce trouve dans le dossier `tests` à la racine du projet
