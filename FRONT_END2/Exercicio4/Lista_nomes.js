/* • Crie um array com 5 nomes e exiba o terceiro nome no console. 
• Adicione um nome ao final e um no início do array. 
• Remova o último nome e exiba o array atualizado. 
• Use map() para criar um novo array dobrando os valores de [2, 4, 6, 8]. 
• Use filter() para criar um novo array apenas com números maiores que 
5 em [1, 3, 5, 7, 9] */

let nomes = ['Ana', 'Bruno', 'Carla', 'Daniel', 'Eva'];
console.log(nomes[2]); // Exibe o terceiro nome

nomes.push('Fernando'); // Adiciona um nome ao final
nomes.pop('Eva'); // Remove o último nome

let numeros = [2, 4, 6, 8];
let numerosDobrados = numeros.map(num => num*2); // Dobra os valores
console.log(nomes);
console.log(numerosDobrados);
let numerosFiltrados = [1, 3, 5, 7, 9].filter(num => num > 5); // Filtra números maiores que 5
console.log(numerosFiltrados);