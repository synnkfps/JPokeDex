# PokeDex em Java (JPokeDex)
###### feito por: ***** ****, Hugo Lemos, Éder Elias e Gabriel Bonaretti.

Um projeto que tenta ao máximo imitar a PokeDex de Pokémon.

## Recursos
- [X] 151 Pokémons (1ª geração)
- [X] Status de cada Pokémon
- [X] Teclado de ID numérico
- [X] Sons de cada um dos 151 Pokémons
- [X] Extremamente rápido (não utiliza recursos online)

## Como funciona
O programa em si é simples, ele é baseado num sistema de ID de cada Pokémon, já que as 3 pastas contém cada recurso deles.
1. ## Interface:
   - A interface é bem simples, é colocada uma imagem de fundo (da PokeDex com botões em lugares específicos)
2. ## Sistema:
   - No sistema interno existe um contador, que é o patriarco de tudo.
   - Cada botão do pad modifica o contador (^ ou v: +10 ou -10 no contador)
      - Há uma função chamada `modify(Integer value)`, ela é responsável por todo o sistema de troca do contador, dentro dela já está embutido um sistema que troca a imagem, toca o som e altera os detalhes.
    - Sistema de informações/imagem/som:
      - Tudo tem o ID do pokémon + extensão do arquivo (ex: `Imagens -> 25.png` | `Sons -> 25.wav` | `Detalhes -> 25.txt`)
      - O contador é atualizado antes dos recursos serem trocados.

## Preparação
- O projeto necessita de 3 pastas adicionais, com elas incluindo: imagens, sons, status.
  - As pastas estão no [GitHub](https://github.com/synnkfps/JPokeDex).
- O projeto também precisa de uma versão atual do Java.
- O projeto é rodado por Eclipse/IntelliJ, não testado no NetBeans
