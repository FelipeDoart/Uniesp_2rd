/* 2)
Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números ímpares. Utilize
obrigatoriamente a função prompt() para coletar os números. */
let numeros = [];
let pares = 0;
let impares = 0;
for (let i = 0; i < 10; i++) {
  let num = parseInt(prompt(`Digite o ${i + 1}º número inteiro:`));
  numeros.push(num);
    if (num % 2 === 0) {
    pares++;
  } else {
    impares++;
  }
}
console.log(`Quantidade de números pares: ${pares}`);
console.log(`Quantidade de números ímpares: ${impares}`);