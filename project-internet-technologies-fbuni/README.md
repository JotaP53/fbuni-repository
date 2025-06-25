# Projeto Website Buenas Viagens!

## Descrição

Este projeto consiste no desenvolvimento front-end de um website para uma agência de viagens fictícia chamada "Buenas Viagens!". O objetivo foi criar uma interface atraente, responsiva e amigável, baseada em designs fornecidos, cobrindo as principais seções de um site de viagens.

O projeto serviu como avaliação da cadeira de Tecnologias de Internet do Centro Universitário Farias Brito.

<a href="https://www.figma.com/design/9KJ0TJzWD1xDuKOFIWk2K6/trabalho-v2?node-id=8-2&t=5PW797AApxqD2dna-1" target="_blank" rel="noopener noreferrer">Visite o protótipo no Figma</a>

## Funcionalidades Implementadas (Seções)

O site atualmente inclui as seguintes seções principais:

1.  **Cabeçalho (Header)**:
    * Logo/Nome do site "Buenas Viagens!".
    * Menu de navegação principal (Home, Passeios, Destinos, Avaliações).
    * Layout responsivo.

2.  **Seção Hero (Banner Principal)**:
    * Imagem de fundo de destaque em tela cheia ou grande proporção.
    * Título chamativo "EXPLORE O MUNDO!".
    * Formulário de busca de viagens sobreposto à imagem, contendo campos para destino, data de ida e volta, e botão de busca.
    * O formulário de busca possui uma "faixa" de fundo (azul ou escura translúcida) para destaque sobre a imagem principal.

3.  **Seção "Próximos Passeios & Destinos"**:
    * Título da seção com destaque em partes do texto.
    * Layout em duas colunas:
        * Coluna de texto com descrição e botão "Saiba mais".
        * Galeria de imagens em grade 2x2.
    * Design responsivo para empilhamento em telas menores.

4.  **Seção "Para onde você quer viajar?" (Destaques de Viagens)**:
    * Título da seção centralizado.
    * Fundo da seção em tom lavanda claro.
    * Grid responsivo (3x2 em desktop) de cards de destinos.
    * Cada card contém: imagem do destino, nome/localização, breve descrição, preço (com preço original riscado) e botão "Saiba mais".
    * Efeitos de hover nos cards.

5.  **Seção "Avaliações dos Clientes"**:
    * Título da seção centralizado.
    * Apresentação de um testemunho por vez (design de slider).
    * Inclui citação, imagem circular do autor com borda destacada, nome e profissão do autor.
    * Setas de navegação (esquerda/direita) para indicar funcionalidade de slider (a lógica do slider em si requer JavaScript, não implementado aqui).
    * Design responsivo.

6.  **Rodapé (Footer)**:
    * Layout multicolunado em fundo cinza escuro.
        * Coluna 1: Informações da empresa (Logo, nome, endereço, copyright).
        * Coluna 2: Links para "Nossos Parceiros".
        * Coluna 3: Formulário de assinatura de newsletter e ícones de redes sociais.
    * Barra inferior (sub-footer) em cor lavanda/roxa.
    * Design responsivo.

## Tecnologias Utilizadas

* **HTML5**: Para a estrutura semântica do conteúdo.
* **CSS3**: Para estilização, layout (Flexbox, Grid), responsividade (Media Queries) e animações/transições sutis (hover effects).

## Estrutura de Arquivos

A estrutura de arquivos do projeto pode ser organizada da seguinte forma:

```text
/buenas-viagens-website/
├── index.html                     # Arquivo HTML principal
├── style.css                      # Folha de estilos CSS principal
├── images/                        # Pasta principal para todas as imagens
│   ├── secao-destinos/            # Imagens para a seção de cards de destinos
│   │   ├── barcelona.jpg         
│   │   ├── lauterbrunner.jpg     
│   │   ├── londres.jpg           
│   │   ├── milao.jpg             
│   │   ├── paris.jpg             
│   │   └── porto.jpg             
│   │
│   ├── secao-proximos-passeios/   # Imagens para a galeria "Próximos Passeios"
│   │   ├── img1.jpg              
│   │   ├── img2.jpg              
│   │   ├── img3.jpg              
│   │   └── img4.jpg              
│   │
│   └── soocial-media-icon/        # Ícones de redes sociais e outras imagens (?)
│       ├── face.svg              
│       ├── insta.svg             
│       ├── x.svg                 
│       ├── img-1.jpg              # Imagem genérica 1, verificar se pertence aqui
│       └── img-2.webp             # Imagem genérica 2, verificar se pertence aqui
│
└── README.md                      # Este arquivo de documentação
```

## Como Visualizar o Projeto

1.  Clone este repositório (se estiver no Git) ou baixe os arquivos.
2.  Certifique-se de que todas as imagens referenciadas no HTML e CSS estejam presentes nas pastas corretas (principalmente na pasta `/img/`). **Substitua os nomes de arquivo de imagem placeholder pelos nomes reais das suas imagens.**
3.  Abra o arquivo `index.html` em qualquer navegador web moderno (Chrome, Firefox, Edge, Safari).

## Pontos de Atenção e Customização

* **Imagens**: Os caminhos das imagens no HTML (tag `<img>`) e no CSS (propriedade `background-image`) são placeholders (ex: `'hero-background.jpg'`, `img/barcelona-card.jpg`). É crucial substituí-los pelos nomes e caminhos corretos das suas imagens para que o design seja exibido corretamente.
* **Fontes**: O projeto utiliza fontes padrão (Arial, sans-serif). Para replicar designs específicos, pode ser necessário importar e aplicar fontes customizadas (ex: via Google Fonts) no CSS.
* **Cores**: As cores foram baseadas nos prints fornecidos. Elas podem ser facilmente ajustadas no arquivo `style.css` procurando pelos códigos hexadecimais ou RGBA correspondentes.
* **Funcionalidade do Slider de Avaliações**: A seção de avaliações foi estilizada para parecer um slider, mas a funcionalidade de alternar entre testemunhos com as setas requer JavaScript, que não faz parte do escopo atual deste README (focado em HTML/CSS).
* **Curvaturas de Seção**: Alguns designs (como o topo da seção "Para onde você quer viajar?") podem ter sugerido bordas curvas ou formas. Implementações simplificadas foram adotadas; efeitos de curva mais complexos podem exigir SVG ou técnicas CSS avançadas com pseudo-elementos.

## Contribuição

Este projeto foi desenvolvido como um exercício de front-end. Sinta-se à vontade para usá-lo como base para estudos ou projetos pessoais.

---

Lembre-se de preencher ou ajustar os nomes das imagens, caminhos, e qualquer outra informação específica do seu setup!