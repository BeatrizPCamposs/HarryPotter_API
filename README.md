<h2>API: PotterDB e HarryPotterBooks<h2>

<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/229957740-54ce8e39-fdef-4c6e-9a9d-3ce9f55fa2ae.png" heigth="250px" width="250px"/></h1>
<p align="center">
<img src="http://img.shields.io/static/v1?label=FUNCIONALIDADE&message=APRESENTA%20DADOS%20REFERENTES%20AO%20MUNDO%20DO%20HARRY%20POTTER: PERSONAGENS, FILMES%20E%20LIVROS&color=yellow&style=for-the-badge"/>
</p>

 <details open="sumarioo">
 <summary><b>Sumário:</summary></b>
  
- [ Desenvolvedores ](#Desenvolvedores)
- [ Funcionalidades da Aplicação ](#funcionalidades)
- [ HarryPotterBooks - (Criando nova API) ](#novaapi)
- [ PotterDB - (Antiga API) ](#antigaapi)
- [ Mapa de Navegação da Aplicação ](#1)
- [ Protótipo da Aplicação](#1)


</details>

## :computer: Desenvolvedores
**Desenvolvido por:** Beatriz Pereira Campos e Leonardo Ferreira Mazzuco Matias; <br>
**Turma:** 3ºDS;

## :hammer: Funcionalidades da Aplicação
<p Align="justify"> ﾠﾠO tema do nosso projeto é sobre a saga de “Harry Potter”, onde trabalhamos com o intuito de desenvolver uma aplicação diretamente focada em atrair os grandes espectadores e fãs dessa saga, procurando levar informações e trazer diversas funcionalidades, exclusividades e entretenimento ao usuário. Por mais que a aplicação possua bastante funcionalidades, nós buscamos trazer facilidade de entendimento no uso do aplicativo, introduzindo diversas imagens e caixas de texto entre as activities.  </p>

<p Align="justify"> ﾠﾠLogo na inicialização da aplicação contamos com uma tela de Splash, a qual possuí um sensor de movimento durante sua execução, sendo ele o acelerômetro (o sensor acelerômetro é ativado quando o dispositivo retorna os valores captados, e caso ele seja maior que 10, ele executará a função que foi atribuída), o qual mudará de intent após o usuário “agitar” o dispositivo (sendo algo pensado inteiramente para uma melhor interação e experiencia do usuário). </p> 

<p Align="justify"> ﾠﾠA tela de cadastro é executada logo após o funcionamento da tela de splash, e nela são solicitados alguns dados do usuário, para que ele consiga acessar a parte interna do aplicativo, sendo dados básicos para criação de um login, como: nome, criação e confirmação de senha, os quais serão armazenados externamente no banco de dados local SQLite. </p>

<p Align="justify"> ﾠﾠAdemais, se o usuário já possuir um cadastro ele pode apertar o botão que se encontra na tela de cadastro com a mensagem “Já sou Cadastrado”, e será automaticamente redirecionada a tela de login, onde terá apenas que informar o seu nome de usuário e senha (os quais caso não sejam validados, não permitiram que o tal acesse a parte interna do app, exibindo uma mensagem informando o erro), após inserir seu login o usuário terá acesso a tela home. </p>

<p Align="justify"> ﾠﾠA tela Home dá ao usuário acesso as demais activities, possuindo um menu no canto superior a esquerda. Nele é apresentado uma barra de pesquisa e um campo de seleção, contendo opções de redirecionamento a tela dos personagens e filmes, possuintes de diversas outras activities, as quais são especificas para determinado, personagem ou filme (elas contêm mais informações sobre cada filme e personagem, específico). Outro ponto importante a se destacar é que nessas opções do menu ocorre a implementação da API. </p>

<p Align="justify"> ﾠﾠA PotterDB é uma API que contém dados do universo de Harry Potter, fornecendo informações sobre os personagens e filmes da saga. Já a HarryPotterBooks é uma API criada com o propósito principal de oferecer uma ampla gama de informações sobre os livros da saga Harry Potter. </p>


***
## 📚 HarryPotterBooks - Criando nova API

> API desenvolvida para consulta de Livros da saga HarryPotter.
<details close="novaapi">
<summary><b>HarryPotterBooks - Criando nova API (Livros)</summary></b>
 
* [Descrição, Métodos e Rotas](https://github.com/BeatrizPCamposs/HarryPotter_API/edit/main/README.md)
* [Diagramas](https://github.com/BeatrizPCamposs/HarryPotter_API/edit/main/README.md)
* [Vídeo de Funcionamento](https://github.com/BeatrizPCamposs/HarryPotter_API/edit/main/README.md)
</details>



***
## 🎥 PotterDB - Antiga API
> Utilizando API  para consulta de Filmes e Personagens da saga HarryPotter.
<details close="antigaapi">
<summary><b>PotterDB - Antiga API (Filmes e Personagens)</summary></b>
 
## 🔗 URL do vídeo mostrando a funcionalidade da aplicação
https://youtu.be/VSSZjv5GxnA

## 🔗 URL da Documentação
https://github.com/danielschuster-muc/potter-db

## 🔗 URL de Acesso a API
https://api.potterdb.com/
## 📒 Métodos Disponíveis
Para acessar os dados das APIs é necessário fazer um GET solicitando os seguintes endpoints.
Vamos chamar este GET através de uma linha de comando, como por exemplo: (https://api.potterdb.com/v1/characters/harry-potter).

<details close="metodo1">
<summary><b>Livros</summary></b>
 
- `/v1/books`
: Este método irá obter recursos hospedados no servidor e retornará a lista de todos os livros.

- `/v1/books/:slug`
: Este método irá obter recursos hospedados no servidor e retornará a lista de livros específicos.

</details>
 
<details close="metodo2">
<summary><b>Capítulos</summary></b>
 
- `/v1/books/:chapters`
: Este método irá obter recursos hospedados no servidor e retornará a lista de todos os capítulos de um certo livro.

- `/v1/books/:chapters/:slug`
: Este método irá obter recursos hospedados no servidor e retornará a lista de um capítulo específico de um livro específico.

</details>
 
<details close="metodo3">
<summary><b>Personagens</summary></b>
 
- `/v1/characters`
: Este método irá obter recursos hospedados no servidor e retornará a lista de todos os personagens.

- `/v1/characters/:slug`
: Este método irá obter recursos hospedados no servidor e retornará a lista de personagens específicos.

</details>
 
<details close="metodo4">
<summary><b>Filmes</summary></b>
 
- `/v1/movies/`
: Este método irá obter recursos hospedados no servidor e retornará a lista de todos os filmes.

- `/v1/movies/:slug`
: Este método irá obter recursos hospedados no servidor e retornará a lista de filmes específicos.
 
</details>

## :pushpin: Filtragem
 
- `/v1/characters?filter[name_cont_any] = name`
: Este método de organização irá filtrar os resultados retornando apenas os caracteres buscado por um nome específico.

- `/v1/characters?sort = name`
: Neste método de organização pode-se classificar os resultados por um campo específico.

- `/v1/characters?page[number = 10]&page[size = 20]`
: Este método de organização irá filtrar os resultados retornando apenas a página desejada e a quantidade de resultados que foram escolhidos.

 
## 📄  Atributos solicitados por cada Método
<details close="atributos1">
<summary><b>Livros</summary></b>

- `slug`
: O slug é um parâmetro que faz parte da URL, sendo utilizado como identificador. Nesse caso, ele identifica o livro, pelo seu ID.

- `title`
: O título deste livro.
 
- `summary`
: O resumo deste livro.
 
 - `author`
 : O autor do livro.
 
 - `realese_date`
 : Data na qual o livro foi lançado.
 
 - `pages`
 : O número de páginas deste livro.
 
 - `order`
 : A ordem cronológica deste livro dentro da saga de Harry Potter (ex: 1.Harry Potter e a pedra filosofal; 2.Harry Potter e a câmara secreta...);
 
 - `wiki`
 : Link de direcionamento para página específica deste livro.
</details>
 
<details close="atributos2">
<summary><b>Capítulos</summary></b>
  
  - `slug`
  : O slug é um parâmetro que faz parte da URL, sendo utilizado como identificador. Nesse caso, ele identifica um capítulo específico do livro.

 - `title`
  : O título deste capítulo.
  
  - `summary`
  : O resumo deste capítulo.
  
  - `order`
  : A ordem cronológica deste capítulo dentro do livro (ex: Capítulo 1, Capítulo 2...);
  
</details>
 
 <details close="atributos3">
 <summary><b>Personagens</summary></b>
  
  - `slug`
 : O slug é um parâmetro que faz parte da URL, sendo utilizado como identificador. Nesse caso, ele identifica um personagem específico, pelo seu ID.
 
 - `Name`
 : O nome deste personagem.
   
 - `Born`
 : A data de nascimento deste personagem.
  
 - `gender`
 : O gênero deste personagem.
   
 - `image`
 : Um link para uma imagem deste personagem.
   
 - `wiki`
 : Link de direcionamento para página específica deste personagem.
</details>
 
  <details close="atributos4">
 <summary><b>Filmes</summary></b>
  
  - `slug`
 : O slug é um parâmetro que faz parte da URL, sendo utilizado como identificador. Nesse caso, ele identifica um filme específico, pelo seu ID.
 
 - `title`
 : O título deste filme.
   
 - `summary`
 : O resumo deste filme.
   
 - `trailer`
 : Um link para o trailer deste filme em específico.
   
 - `wiki`
 : Link de direcionamento para página específica deste filme.
</details>
 
 
## :chart_with_upwards_trend:  Diagrama de Classes, Diagrama do Banco de Dados e MER
<details close="classe">
<summary><b>Diagrama de Classes (API - PotterDB)</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236312558-da40ec17-2eb6-45d4-836e-c308c62d03ce.png" heigth="800px" width="1000px"/></h1>
</details>
 
<details close="classee">
<summary><b>Diagrama de Classes (API - HarryPotter (NOVA))</summary></b>
<h1 align="center"><img src= "https://github.com/BeatrizPCamposs/HarryPotter_API/assets/101807045/d6a275f8-3108-44cb-906c-de10314fdd6e" heigth="600px" width="600px"/></h1>
</details>

<details close="banco">
<summary><b>Diagrama do Banco de Dados (API - PotterDB)</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236313053-9de16228-c41a-415c-bb09-a89b35eea7a5.png" heigth="800px" width="1000px"/></h1>
</details>

<details close="bancoo">
<summary><b>Diagrama do Banco de Dados (API - HarryPotter (NOVA))</summary></b>
<h1 align="center"><img src= "https://github.com/BeatrizPCamposs/HarryPotter_API/assets/101807045/6e6d6657-20ef-4b32-9ecd-c1ad55e2e553" heigth="600px" width="600px"/></h1>
</details>
 
<details close="MER">
<summary><b>MER (API - HarryPotter (NOVA))</summary></b>
<h1 align="center"><img src= "https://github.com/BeatrizPCamposs/HarryPotter_API/assets/101807045/f2fbd51d-d84a-463f-925f-93e3a0284d85" heigth="600px" width="600px"/></h1>
</details>
</details>

***
## 🗺️ Mapa de Navegação da Aplicação
<details close="mapa">
<summary><b>Mapa de Navegação</summary></b>
<h1 align="center"><img src= "https://github.com/BeatrizPCamposs/HarryPotter_API/assets/101807045/967e1772-ad95-4a29-b6b7-bafc6140a3d7" heigth="700px" width="900px"/></h1>
</details>
 
***
## :pushpin: Protótipo da Aplicação
> Protótipo disponível em: ("https://www.figma.com/file/w0VV8BlFHCfYQUzdpNb9bV/Prot%C3%B3tipo-App-Harry-Potter---API?type=design&node-id=0%3A1&t=JSIeGcGgULknkfwW-1")
 
<details close="part1">
<summary><b>Splash, Cadastro e Login</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236341142-e049f091-ebdd-4cac-8354-2a3e4636c90f.png" heigth="700px" width="900px"/></h1>
</details>
 
<details close="part2">
<summary><b>Home e Menu</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236341445-99545c91-8fff-4cfe-8be7-f76465391017.png" heigth="300px" width="500px"/></h1>
</details>
 
<details close="part3">
<summary><b>Filmes e Filme Específico</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236342105-24283d19-ddc8-4e7d-801f-4958b430575b.png" heigth="600px" width="800px"/>
</details>

 
<details close="part4">
<summary><b>Personagens e Personagem Específico</summary></b>
<h1 align="center"><img src= "https://user-images.githubusercontent.com/101807045/236342479-80d99473-0f5c-4299-9138-f84af7dfec2d.png" heigth="300px" width="500px"/></h1>
</details>
