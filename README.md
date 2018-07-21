# WordChains
Word Chain kata Spring Boot application

My solution to Word Chains kata:
http://codekata.com/kata/kata19-word-chains/

SpringBoot web application, that allows you to search for the shortest word chain between two words. The rule is only one word at a time 
can be changed, and all the word chain's word should be in the dictionary.

Technologies: Java8, Spring Boot, JUnit, Lombok, Thymeleaf, HTML5, CSS, Bootstrap
Design patterns: MVC, Dependency Injection
Alghorithms: graph theory, breadth-first serach, Dijkstra algorithm

Example results:
- for words "java" and "test": java tava tala tela telt test
- for words "brain" and "storm": brain blain slain stain starn stare store storm
- for words "associate" and "developer" there is no possible connection 


Note - program first creates all nodes and edges in a graph, then uses algorithm to find the shortest (or only possible) connection.
It works infallibly, however it would be nice to improve it's speed, if you enter two long words. That's my aim for the future.
