TP 4 : Programmation Orientée Objet 2 (Java) 
Thème :Interfaces Graphiques (Swing), Programmation Événementielle et Architecture MVC.




Informations
- Étudiant : Brahimi Mohammed
- Enseignant : Dr. Adel Khelifati
- Outil utilisé : Eclipse IDE / Java Swing



Détail des Exercices

Exercice 1 : Interface d'Inscription (Focus Layouts)
Réalisation d'une interface de fiche d'inscription sans traitement d'événements.
- Objectifs : Maîtriser l'organisation visuelle et les gestionnaires de mise en page.
- Réalisation : 
    - Utilisation de `BorderLayout` pour la structure principale.
    - Utilisation de `GridLayout` pour le formulaire (Nom, Prénom, etc.).
    - Utilisation de `BoxLayout` et `FlowLayout` pour les options et boutons.
    - Ajout d'un `JScrollPane` pour la zone de commentaires.

Exercice 2 : Simulateur de Commande (Événements & Erreurs)
Application interactive calculant le montant d'une commande.
- Fonctionnalités :
    - Saisie de l'article, prix et quantité.
    - Application d'une remise de 10% pour les clients fidèles.
    - Choix entre livraison Standard (0 DA) et Express (300 DA).
- Gestion des Événements : Utilisation de `ActionListener` pour déclencher les calculs.
- Sécurité : Mise en place de blocs `try-catch` pour empêcher le crash de l'application en cas de saisie invalide (ex: texte dans un champ numérique) et affichage de messages via `JOptionPane`.

Exercice 3 : Gestion de Stock (Architecture MVC)
Application de gestion de stock organisée selon le design pattern **Modèle-Vue-Contrôleur (MVC)**.
- Structure :
    1. Modèle (`StockModel`) :Contient la logique métier (stock initial à 20, capacité max à 100, interdiction de stock négatif).
    2. Vue (`StockView`) :Gère uniquement l'affichage graphique et les mises à jour visuelles.
    3. Contrôleur (`StockController`) : Fait le pont entre la vue et le modèle. Il écoute les boutons (Ajouter, Retirer, Reset) et met à jour la vue.
- Point d'entrée : `MainStockApp.java` pour l'initialisation du système.



1. Clonage :
   ```bash
   git clone https://github.com/[VOTRE_NOM_UTILISATEUR]/[NOM_DU_DEPOT].git
