Atividade de Aqueciemento 

Contexto: Você foi chamado para uma entrevista de emprego na Mozilla Foundation, e o seu teste consiste na implementação dos botões de avançar e voltar do navegador. Eles possuem o seguinte comportamento: 
(a) Ao iniciar o navegador nenhuma pilha existe, os botões de retorno e avanço
estarão desativados. O crescimento da pilha é automático.
(b) Ao digitar o primeiro endereço, o navegador adiciona a página inicial à
pilha do voltar e ativa este botão.
(c) Ao voltar, o topo desta pilha será enviado para a pilha de avançar e ativa
este botão, desativando o anterior, caso a pilha esteja vazia.
(d) Ao avançar, o topo desta pilha será enviado para a pilha do voltar e, o botão
será desativado, caso, a pilha esteja vazia.
(e) As pilhas vazias devem ser eliminadas.

Conceito Utilizado 
Foi utilizada a estrutura de dados Pilha (Stack), que segue o princípio:
LIFO (Last In, First Out) — o último elemento inserido é o primeiro a sair.

Funcionalidades
> acessor(String url)
> acessa uma nova página
> armazena a página anterior na pilha de voltar 
> limpa a pilha de avançar

> voltar()
> retornar para a página anterior
> move a página atual para a pilha de avançar

> avancar()
> avançar para próxima página
> move a página atual para a pilha de voltar

> mostrarEstado() (funcionalidade extra)
> Exibe:
> Página atual
> Conteúdo das pihas
> Auxilia na visualização do funcionamento do sistema

Exemplo de Execução 
Navegador nav = new Navegador();
nav.acessar("google.com"); nav.acessar("youtube.com"); nav.acessar("facebook.com"); 
nav.voltar(); nav.voltar(); 
nav.avancar(); 
nav.acessar("instagram.com");

Comportamento do Sistema
> Ao acessar uma nova página, o histórico de avanço é apagado.
> O botão voltar só funciona se houver páginas anteriores.
> O botão avançar só funciona se houver páginas disponíveis.
> O sistema simula fielmente o comportamento de navegadores reais. 

Melhorias Implementadas 
Além dos requisitos do trabalho, foram adicionadas melhorias: 
> O sistema simula fielmente o comportamento de navegadores reais
> Método para visualização do estado interno
> Tratamento de entrada inválida (URL vazia ou nula)
> Código organizado e indentado

Objetivo Acadêmico
Este projeto tem como objetivo aplicar na prática os conceitos de pilhas, demonstrando seu uso em problemas reais, como navegação em sistemas web. 

Autor 
João Pedro Miranda Reis Silva - 972310486
João Victor Nunes Inácio - 972311105


