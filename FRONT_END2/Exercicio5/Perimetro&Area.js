/* 
5) Escreva uma função
que encontre a área e o perímetro de um círculo, de acordo com o raio
fornecido. Utilize obrigatoriamente a função prompt() para coletar o
salário inicial. */
let raio = parseFloat(prompt("Insira o raio do círculo: "));
let area = 3.14 *(raio**2);
let perimetro = 2 *3.14* raio;
console.log(`A área do círculo é: ${area.toFixed(2)}`);
console.log(`O perímetro do círculo é: ${perimetro.toFixed(2)}`);