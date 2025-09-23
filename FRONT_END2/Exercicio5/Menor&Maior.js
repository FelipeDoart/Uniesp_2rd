/* 
3) Faça um programa que, dado um conjunto de N números, determine o \
menor valor, o maior valor e a soma dos valores.
 */
let numeros = [];
let soma = 0;
let maior = null;
let menor = null;  

let quantidade = parseInt(prompt("Quantos números você quer inserir?"));

for (let i = 0; i < quantidade; i++) {
  let num = parseFloat(prompt(`Digite o ${i + 1}º número:`));
    numeros.push(num);
    soma += num;
}
for (let i = 0; i < numeros.length; i++) {
    if (maior === null || numeros[i] > maior) {
        maior = numeros[i];
    }
    else if (menor === null || numeros[i] < menor) {
        menor = numeros[i];
    }
}

console.log(`O maior valor é: ${maior}`);
console.log(`O menor valor é: ${menor}`);
console.log(`A soma dos valores é: ${soma}`);
//let menor = Math.min(...numeros);
//let maior = Math.max(...numeros);