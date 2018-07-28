# WordChains

My solution to Word Chains kata:
http://codekata.com/kata/kata19-word-chains/

Spring Boot web application, that allows you to search for the shortest word chain between two words. The rule is that only one letter at a time can be changed, and all of the word chain's words should be in the dictionary. It's easier to understand with an example:
- for input words "java" and "test" the result is: java tava tala tela telt test
- for words "brain" and "storm": brain blain slain stain starn stare store storm
- for words "associate" and "developer" there is no possible connection 

Technologies: Java8, Spring Boot, Maven, JUnit, Lombok, Thymeleaf, HTML5, CSS, Bootstrap
Design patterns: MVC, Dependency Injection
Alghorithms: graph theory, breadth-first serach, Dijkstra's algorithm

Note - the program first creates all nodes and edges in the graph, then uses algorithm to find the shortest (or only possible) connection.
It works infallibly, however it would be nice to improve it's speed, if you enter two long words. That's my aim for the future.
