/*
(Relembrando conceitos de BOM)
Browser Object Model (BOM) é uma interface de programação que permite a interação com o navegador web.
Ele fornece objetos e métodos para manipular a janela do navegador, o histórico de navegação,
os cookies, o local storage, entre outros aspectos relacionados ao ambiente do navegador.
Alguns dos principais objetos do BOM incluem:

1. window:  Objeto global que representa a janela do navegador. Ele contém propriedades e métodos para controlar a janela,
como abrir novas janelas, redimensionar, etc.
2.navigator:  Objeto que fornece informações sobre o navegador, como nome, versão, plataforma, etc.
3.screen:  Objeto que fornece informações sobre a tela do dispositivo, como largura, altura, profundidade de cor, etc.
4.location:  Objeto que representa a URL atual da página e permite redirecionar para outras URLs.
5.history:  Objeto que permite a navegação pelo histórico do navegador, possibilitando avançar e retroceder entre páginas 
visitadas.

(Relembrando conceitos de DOM)
Document Object Model (DOM) é uma interface de programação para documentos HTML e XML. Ele representa a estrutura 
do documento como uma árvore de objetos, permitindo que linguagens de programação, como JavaScript, manipulem o conteúdo, 
a estrutura e o estilo dos documentos de forma dinâmica. 
Alguns dos principais objetos do DOM incluem:

1. window:  Objeto global que representa a janela do navegador. Ele contém propriedades e métodos para controlar a janela, 
como abrir novas janelas, redimensionar, etc.
2.document:  Objeto que representa o documento HTML carregado na janela. Ele fornece acesso ao conteúdo da página,
permitindo a manipulação de elementos, atributos e estilos.

window.document:  Principal objeto do DOM que representa a página carregada no navegador
Em resumo, ele cria uma estrutura hierárquica que reflete a organização do documento HTML, permitindo a manipulação
dinâmica do conteúdo e da aparência da página web.

Metodos comuns do objeto document:
- getElementById(): Retorna um elemento com o ID especificado.
- getElementsByClassName(): Retorna uma coleção de elementos com a classe especificada.
- getElementsByTagName(): Retorna uma coleção de elementos com a tag especificada.
- querySelector(): Retorna o primeiro elemento que corresponde a um seletor CSS especificado.
ex: document.querySelector(#Principal img); // Seleciona o primeiro elemento com a classe 'minha-classe'
(obs: o querySelector retorna apenas o primeiro elemento que corresponde ao seletor)
(obs2: Selecionar apenas o elemento filho: document.querySelector(#Principal > img);)
- querySelectorAll(): Retorna uma coleção de todos os elementos que correspondem a um seletor CSS especificado.

 */