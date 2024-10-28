# Trabalho_Game🎮
Trabalho de um game RPG realizado para materia de Progamação Orientada a Objeto.

------------------------------------------------------------------------------------------------------
# Nome dos integrantes do grupo📄
Nome: Victor Eduardo Almeida Bispo

Nome: luiz

Nome: João Pedro Ferreira Pellegrini

------------------------------------------------------------------------------------------------------
Link Repositorio GitHub : https://github.com/ViBispo/Trabalho_Game

------------------------------------------------------------------------------------------------------
# Trama🎭 

No mundo místico de Eldoria, dois reinos ancestrais competem pelo domínio de uma relíquia lendária: a poderosa Jóia dos Deuses. Há séculos, o Reino da Luz e o Reino das Sombras convivem em um frágil equilíbrio, mas rumores de que a Jóia dos Deuses foi encontrada em uma antiga caverna ao norte despertam o desejo de conquista em ambos os reinos.

A Jóia dos Deuses é uma fonte inesgotável de energia mística, capaz de conceder poderes inimagináveis ao seu portador, além de moldar o destino de Eldoria. Entretanto, seu poder é tão grande que, nas mãos erradas, pode transformar um reino próspero em um vasto deserto sombrio.

O Reino da Luz
Defensores da esperança e da justiça, os guerreiros do Reino da Luz acreditam que a Jóia deve ser protegida e selada para sempre, mantendo o equilíbrio do mundo. O líder dos guerreiros, Arthur, é um valente cavaleiro que jurou proteger Eldoria dos perigos do Reino das Sombras.

O Reino das Sombras
Os habitantes do Reino das Sombras são guiados pelo ambicioso mago sombrio Merlin, que acredita que apenas ele pode controlar o verdadeiro poder da Jóia. Merlin deseja usar seu poder para conquistar Eldoria e moldá-la conforme sua própria visão de um império perfeito.

O Herói Escolhido
O jogador é convocado para representar um dos lados: Arthur, o Guerreiro da Luz, ou Merlin, o Mago das Sombras. Cada lado oferece uma missão única:

Guerreiro Arthur: Sua missão é defender a Jóia dos Deuses das forças sombrias e restaurar a paz. No caminho, Arthur enfrenta magias traiçoeiras e a corrupção dos soldados das Sombras. Mas, em seu coração, há um desejo de proteger aqueles que ama e preservar o legado de Eldoria.

Mago Merlin: Seu objetivo é recuperar a Jóia dos Deuses e finalmente subjugar o Reino da Luz. Merlin acredita que o poder da Jóia deve estar em mãos dignas e fortes, e só ele tem o conhecimento e a habilidade para usar seu potencial ao máximo.

O Encontro na Caverna dos Destinos
Ambos os heróis seguem seus caminhos cheios de desafios e inimigos. O confronto final acontece na Caverna dos Destinos, onde a Jóia dos Deuses repousa. Dizem que esta caverna é protegida por espíritos antigos que só permitirão que um verdadeiro herói reclame o poder da Jóia.

No auge do confronto, Arthur e Merlin se encontram. Agora, o destino de Eldoria está em suas mãos. O vencedor será aquele que provar ser o mais digno e poderoso.

Finalizações Alternativas:

Vitória do Guerreiro: Arthur sela a Jóia dos Deuses para sempre e retorna ao seu reino como o salvador de Eldoria. As sombras dissipam, e a paz é restaurada.
Vitória do Mago: Merlin conquista a Jóia e espalha sua escuridão sobre Eldoria, criando um novo império de poder absoluto. Sombras cobrem o horizonte, e a era de Merlin começa.

------------------------------------------------------------------------------------------------------
# Objetivo📍 
Esse jogo é um simples RPG baseado em turnos, onde o jogador pode escolher entre dois personagens: um Guerreiro ou um Mago. A estrutura do jogo inclui uma batalha entre o personagem escolhido pelo jogador e um oponente controlado pelo computador. Vamos explicar em detalhes como o jogo funciona:

------------------------------------------------------------------------------------------------------

# Introdução
Quando o jogo é iniciado, ele apresenta ao jogador a trama do jogo. O mundo de Eldoria está em guerra entre o Reino da Luz e o Reino das Sombras, disputando a poderosa "Jóia dos Deuses".

# Escolha de Personagem👥
O jogador tem duas opções de personagens:

Guerreiro Arthur: Possui maior vida e força para ataques físicos.
Mago Merlin: Tem menos vida, mas usa magia que consome mana para causar dano ao oponente.
O jogador escolhe o personagem digitando 1 para Guerreiro ou 2 para Mago. Caso insira um número inválido, o personagem padrão será o Guerreiro.

# Batalha ⚔
A batalha é o núcleo do jogo e segue um esquema de turnos:

Ações do jogador: A cada turno, o jogador escolhe entre atacar (1) ou verificar status (2).

Atacar: Causa dano ao inimigo. O Guerreiro ataca diretamente com a espada, enquanto o Mago lança feitiços que consomem mana. Se o Mago ficar sem mana, ele ataca de forma fraca.
Verificar status: Exibe a vida atual do jogador e, se for um Mago, também mostra a quantidade de mana disponível.
Ações do inimigo: Se o inimigo ainda estiver vivo após o turno do jogador, ele também ataca o jogador, seguindo a mesma lógica de ataque baseada na classe.

# Final do Jogo🏆
O jogo termina quando a vida de um dos personagens chega a zero. O vencedor é anunciado, e o jogo exibe um desfecho baseado no personagem vitorioso:

Se o jogador vencer, ele restaura a paz em Eldoria.
Se o inimigo vencer, o Reino das Sombras triunfa.
Resumo do Código
Classes principais: Personagem (classe abstrata que define as características básicas), Guerreiro (especializado em ataques físicos) e Mago (especializado em ataques mágicos).
A classe Trama: Gerencia a introdução e narrativa do jogo.
Métodos de ataque: Cada personagem possui um método atacar que é executado dependendo da classe e das condições (por exemplo, mana disponível).
Funcionamento resumido:
O jogador escolhe um personagem.
Ambos os personagens alternam turnos atacando um ao outro até que um deles perca toda a vida.
A vitória é determinada pela vida restante.
Esse jogo é um exemplo clássico de RPG baseado em turnos e oferece uma experiência simples e direta para aprender o básico de lógica de jogo e controle de fluxo.
