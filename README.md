## Exemple Spring Boot - Creational Patterns Java
Dans ce projet, nous allons voir quelques exemples de Creational Patterns Java.

### Qu'est-ce que Design Patterns ?
---
Les **Design Patterns** sont simplement des ensembles de pratiques standardisées utilisées dans l'industrie du développement de logiciels. 
Ils représentent des solutions, fournies par la communauté, aux problèmes courants rencontrés dans les tâches quotidiennes concernant 
le développement de logiciels. Les connaître et les connaître par cœur peut vous aider à augmenter la vitesse et la qualité de votre développement.

Il existe trois catégories principales de modèles de conception : 
* **Creational Patterns** 
* **Structural Patterns**
* **Behavioral Patterns**

Dans ce repo nous allons voir des exemples de **Creational Patterns** :<br/>
**Creational Patterns**, comme leur nom l'indique, sont plus préoccupés par les solutions et les options qui tournent autour de l'instanciation d'objets, et comment le faire plus efficacement dans les circonstances les plus variées.
<br/>
* **Factory Method/Template** également souvent appelée Factory Pattern, est un modèle de conception largement utilisé qui commande la création d'objets.
Dans ce modèle, une classe Factory est créée en tant que classe parent de toutes les sous-classes appartenant à un certain segment logique de classes associées.
* **Abstract Factory** : Ce modèle est responsable de la création de toutes les autres usines en tant que sous-classes, exactement comme les factories sont responsables de la création de toutes leurs propres sous-classes.
* **Builder** : Le modèle Builder est utilisé pour aider à construire des objets finaux, pour les classes avec une énorme quantité de champs ou de paramètres de manière étape par étape. Ce n'est pas très utile dans les petites classes simples qui n'ont pas beaucoup de champs, mais les objets complexes sont à la fois difficiles à lire et à gérer par eux-mêmes.<br/>
L'initialisation d'un objet avec plus de quelques champs à l'aide d'un constructeur est compliquée et susceptible d'erreur humaine.
* **Prototype** : Le modèle Prototype est principalement utilisé pour minimiser le coût de création d'objets, généralement lorsque des applications à grande échelle créent, mettent à jour ou récupèrent des objets qui coûtent beaucoup de ressources.<br/>
Cela se fait en copiant l'objet, une fois qu'il est créé, et en réutilisant la copie de l'objet dans des requêtes ultérieures, pour éviter d'effectuer une autre opération gourmande en ressources. Cela dépend de la décision du développeur s'il s'agira d'une copie complète ou superficielle de l'objet, bien que l'objectif soit le même.
* **Singleton** : Le modèle Singleton garantit l'existence d'une seule instance d'objet dans l'ensemble de la JVM.<br>
C'est un modèle assez simple et il offre la possibilité d'accéder à cet objet même sans l'instancier. D'autres modèles de conception utilisent ce modèle, comme les modèles Abstract Factory, Builder et Prototype.
<br/>
Voila, avec cela, tous les Creational Patterns en Java sont entièrement couverts, avec des exemples de travail.
