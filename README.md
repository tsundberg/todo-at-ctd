# CTD TODO

An example of a TODO list using Cucumber-JVM.

Thomas should remember to buy cat food. 

This can be formulated as:

```
# language: sv

Egenskap: För att komma ihåg saker kan man behöva en lista.

  Scenario: Kom ihåg att köpa kattmat
    Givet att kattmaten är slut
    När Thomas skriver upp köp kattmat på sin att göra-lista
    Så ska det stå köp kattmat på hans att göra-listan

    
```

If you don't understand Swedish, the example above may not make much sense to you. It is in Swedish. 
Yes, it is possible to write Gherkin an many other languages than English.

## Building

The example uses Maven, build it with:

    mvn test

