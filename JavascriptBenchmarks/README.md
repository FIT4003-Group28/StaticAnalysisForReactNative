# StaticAnalysisForReactNative

This branch contains the work done on the javascript benchmarks.

Requires GraphViz and node.

Example usage:

node .\main.js "./Ivan's FizzBuzz Tests/FizzBuzz_Method" --editcg


--editcg is my edited version of callgraph creation. If you get an error you can check the file extension as well.

eg here i forgot to add a .js but it still works.

It prints the nodes and edges and the numbers of them as well.

The useful files are: 
1. main.js
2. astutil.js
3. Ivan's FizzBuzz Tests directory
4. Callgraph Working directory
5. PhillipsCallgraphs