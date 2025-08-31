## Java Collections — ArrayList

## O que é um Array?

<p align="justify">
    Arrays, ou Vetores, são Estrutura de Dados estáticas que armazenam uma coleção de elementos do mesmo tipo. Ou seja, trata-se do aglomerado de dados e/ou valores de mesmo tipo sob uma determinada variável com alocamento predefinido.  
</p>

<p align="justify">
    Cada item armazenado no Array é popularmente denominado como "elemento", podendo ser acessado através da numeração de sua respectiva posição, sendo este o seu "índice".
</p>

<br>

## O que é o ArrayList?

<p align="justify">
    O ArrayList se trata de uma classe da biblioteca <b>java.util</b> com a implementação da interface <b>List</b> para armazenar coleções de objetos. Diferente do Array tradicional, que possúi tamanho fixo, esta estrutura de dados é dinâmica, permitindo com que seja possível adicionar, remover e acessar os elementos de maneira mais flexível. 
</p>

**• Interface List**

<p align="justify">
    Através da implementação da interface <b>List</b> torna-se possível de se utilizar uma série de métodos, tais como: <b>add()</b>, <b>remove()</b>, <b>get()</b>, <b>size()</b>, <b>isEmpty()</b>, <b>contains()</b>, entre outros.
</p>

<br>

## Declaração do ArrayList

<br>
<p align="center">
    <b>ArrayList&lt;String&gt; stringList = new ArrayList<>();</b>
</p>
<br>

> <h3>1. ArrayList&lt;String&gt;</h3>

<p align="justify">
    <b>• ArrayList</b>: é uma classe da biblioteca <b>java.util</b> que representa uma lista dinâmica, ou seja, um tipo de estrutura de dados que pode crescer e diminuir conforme os elementos são adicionados ou removidos.
</p>

<p align="justify">
    <b>• &lt;String&gt;</b>: Isto é denominado de <b>Generics</b>. Trata-se de um recurso que parte do pressuposto de utilizar <b>tipos de dados parametrizados</b>, assim um tipo pode ser especificado no momento em que a classe, interface ou método é usado, em vez de ser fixo no momento da criação. Dessa forma, por meio da utilização dos Generics, torna-se possível escrever um código mais flexível e reutilizável, dado que será possível usar diferentes tipos de dados sem a necessidade de escrever um algoritmo para cada tipo específico.
</p>

<p align="justify">
    Neste caso, o tipo adequado ao ArrayList foi o de <b>String</b>. Através desta específicação, é informado que a lista irá armazenar somente objetos do tipo <b>String</b>.
</p>

> <h3>2. stringList</h3>

<p align="justify">
    <b>• stringList</b>: Este é o nome da variável. Você pode escolher qualquer nome válido, para isso é há algumas convenções comuns utilizadas, tais como:
</p>

<p align="justify">
    <b>CamelCase</b>: As palavras são unidas sem espaços, com a primeira letra de cada palavra, exceto a primeira, sendo maiúscula. Exemplo: nomeCompleto.
</p>

<p align="justify">
    <b>Snake Case</b>: As palavras são separadas por sublinhado. Exemplo: nome_completo
</p>

> <h3>3. new ArrayList<>()</h3>

<p align="justify">
    <b>• new</b>: Cria uma nova instância (ou seja, um objeto) da classe.
</p>

<p align="justify">
    <b>• ArrayList<>()</b>: Estamos instanciando a lista usando o tipo <b>String</b> já previamente declarado na estrutura.
</p>