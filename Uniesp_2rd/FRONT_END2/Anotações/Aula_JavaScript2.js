// Array: Estrutura de dados que armazena uma coleção de elementos
// os valores podem ser de qualquer tipo: números, strings, booleanos, objetos, etc.
// Os elementos são acessados por um índice, que começa em 0

// Exemplo de criação de um array:
let frutas = ["maçã", "banana", "laranja"];
console.log(frutas); // Output: ["maçã", "banana", "laranja"]

// Outra forma de criar um array:
let numeros = new Array(1, 2, 3, 4, 5);
console.log(numeros); // Output: [1, 2, 3, 4, 5]

// Acessando elementos do array:
console.log(frutas[0]); // Output: "maçã"

// Para alterar um elemento do array:
frutas[1] = "uva";
console.log(frutas); // Output: ["maçã", "uva", "laranja"]

//Para saber o tamanho do array:
console.log(frutas.length); // Output: 3
console.log(numeros.length) = "Banana";
//(Como também pode ser usado para inserir um elemento no final do array)
console.log(frutas); // Output: ["maçã", "uva", "laranja", "Banana"]

// Métodos comuns de array:

// Adicionar um elemento no final do array: push()
frutas.push("abacaxi");
console.log(frutas); // Output: ["maçã", "uva", "laranja", "Banana", "abacaxi"]
//Push também retorna o novo tamanho do array
console.log(frutas.push("abacaxi")); // Output: 5

// Remover o último elemento do array: pop()
frutas.pop();
console.log(frutas); // Output: ["maçã", "uva", "laranja"]

// Adicionar um elemento no início do array: unshift()
frutas.unshift("morango");
console.log(frutas); // Output: ["morango", "maçã", "uva", "laranja"]

// Remover o primeiro elemento do array: shift()
frutas.shift();
console.log(frutas); // Output: ["maçã", "uva", "laranja"]

// Encontrar o índice de um elemento: indexOf()
let indice = frutas.indexOf("uva");
console.log(indice); // Output: 1
// Se o elemento não for encontrado, retorna -1

//Pecorrendo uma array:
// For clássico:
for (let i = 0; i < frutas.length; i++) {
    console.log(frutas[i]);// Output: "maçã", "uva", "laranja"
}
// Usando for...in:
//(É possivel alterar o elemento do array usando o indice)
for (let indice in frutas) {
    console.log(frutas[indice],indice);// Output: "maçã" 0, "uva" 1, "laranja" 2
}
//Usando for...of:
for (let fruta of frutas) {
    console.log(fruta);
}
//Para encontrar um indice especifico:
let pos = frutas.findIndex((fruta) => fruta === "uva");
console.log(pos); // Output: 1

// Usando forEach():
frutas.forEach((fruta, indice) => {
    console.log(fruta, indice); // Output: "maçã" 0, "uva" 1, "laranja" 2
});

//Includes: Verifica se um elemento existe no array, retornando true ou false
console.log(frutas.includes("banana")); // Output: false
console.log(frutas.includes("uva")); // Output: true  

//Reverse: Inverte a ordem dos elementos no array
frutas.reverse();
console.log(frutas); // Output: ["laranja", "uva", "maçã"]
//Sort: Ordena os elementos do array em ordem alfabética ou numérica
frutas.sort();
console.log(frutas); // Output: ["maçã", "laranja", "uva"]

//Join: Concatena todos os elementos do array em uma string, separados por um delimitador especificado
let frutasString = frutas.join(", ");
console.log(frutasString); // Output: "maçã, laranja, uva"
//Split: Divide uma string em um array de substrings, com base em um delimitador especificado
let novaString = "maçã, laranja, uva";
let novaArray = novaString.split(", ");
console.log(novaArray); // Output: ["maçã", "laranja", "uva"]

//ARRAYS MULTIDIMENSIONAIS
// São arrays que contêm outros arrays como elementos, permitindo a criação de estruturas de dados mais complexas, como matrizes ou tabelas.
let matriz = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
console.log(matriz[1][2]); // Output: 6

// Percorrendo um array multidimensional:
for (let i = 0; i < matriz.length; i++) {
    for (let j = 0; j < matriz[i].length; j++) {
        console.log(matriz[i][j]);
    }
}

//Map: Cria um novo array com os resultados da aplicação de uma função a cada elemento do array original
let numeros2 = [1, 2, 3, 4, 5];
let numerosDobrados = numeros2.map((num) => num * 2);
//Ou assim:
//let numerosDobrados = numeros2.map(function(num) {
//    return num * 2;
//});
console.log(numerosDobrados); // Output: [2, 4, 6, 8, 10]