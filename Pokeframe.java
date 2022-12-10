import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Pokeframe extends JFrame {
    // Imagem de Fundo
    ImageIcon poke = new ImageIcon(getClass().getResource("pokedex_semcaracteres.jpg"));
    JLabel apa = new JLabel(poke);
    // Botões
    JButton next = Botao("->", 280, 438-38, 40, 30);
    JButton previous = Botao("<-", 220, 438-38, 40, 30);
    JButton ligar = Botao("ligar", 87, 415-38, 60, 16);
    JButton desligar = Botao("desligar", 156, 415-38, 60, 16);
    JButton plus10 = Botao("^", 256, 408-38, 30, 40);
    JButton minus10 = Botao("v", 256, 458-38, 30, 40);
    JButton audio = Botao("", 40, 370, 40, 30);
    // Números
    JButton um = Botao("1", 440, 275, 40, 25);
    JButton dois = Botao("2", 485, 275, 32, 25);
    JButton tres = Botao("3", 523, 275, 32, 25);
    JButton quatro = Botao("4", 560, 275, 35, 25);
    JButton cinco = Botao("5", 600, 275, 35, 25);
    JButton seis = Botao("6", 440, 304, 40, 25);
    JButton sete = Botao("7", 485, 304, 32, 25);
    JButton oito = Botao("8", 523, 304, 32, 25);
    JButton nove = Botao("9", 560, 304, 35, 25);
    JButton zero = Botao("0", 600, 304, 35, 25);
    JButton enter = Botao("", 620, 375, 25, 25);

    String scount;
    int ordem;

    static JLabel contador = Texto("0", 115, 443-38, 90, 90);
    static JLabel descricao = Texto("0", 115, 443-38, 90, 90);
    public static Boolean ligado = true;

    public static Integer count = Integer.parseInt(contador.getText()); // Variável matriarca
    static JLabel todosOsStats = Texto("Nenhum", 495, -43, 500, 500); // Nenhum vai representar o 0
    static JLabel pokemon = new JLabel(); // variavel para colocar o icone (imagem do pokemon)

    public Pokeframe() {
        setLayout(null);
        contador.setFont(new Font("Verdana", Font.PLAIN, 34));
        todosOsStats.setFont(new Font("Verdana", Font.PLAIN, 9));
        updateIcon();

        // Números, cada número tem suas funções para trocar a imagem, o som e o status
        um.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 16) {
                    scount = ""+ordem+1;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 1;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 1;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        dois.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+2;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 2;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 2;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        tres.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+3;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 3;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 3;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        quatro.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+4;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 4;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 4;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        cinco.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+5;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 5;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 5;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        seis.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+6;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 6;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 6;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        sete.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+7;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 7;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 7;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        oito.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+8;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 8;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 8;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        nove.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 15) {
                    scount = ""+ordem+9;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 9;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 9;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        // Sistema de liga e desliga
        ligar.addActionListener(e -> {
            ligado=true;
            contador.setVisible(true);
            pokemon.setVisible(true);
            todosOsStats.setVisible(true);
        });
        desligar.addActionListener(e -> {
            ligado = false;
            contador.setVisible(false);
            pokemon.setVisible(false);
            todosOsStats.setVisible(false);
        });

        zero.addActionListener(e -> {
            if (contador.getText().length() <= 2) {
                if (ordem >= 0 && ordem < 16) {
                    scount = ""+ordem+0;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }else {
                    ordem = 0;
                    scount = ""+ordem;
                    ordem = Integer.parseInt(scount);
                    contador.setText(scount);
                }
            }else  {
                ordem = 0;
                scount = ""+ordem;
                ordem = Integer.parseInt(scount);
                contador.setText(scount);
            }
        });

        enter.addActionListener(e -> {
            if (ordem < 0 || ordem>151) {
                ordem = 0;

            } else {
                count = Integer.parseInt(scount);
                contador.setText(String.valueOf(count));
                pegarStatus(count);
                updateIcon();
                ordem = 0;
            }
        });

        // Next (próximo), colocar o próximo pokémon
        next.addActionListener(e -> {
            modify(1);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        // Previous (anterior), colocar o pokémon anterior
        previous.addActionListener(e -> {
            modify(-1);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        
        // Botão para tocar o áudio
        audio.addActionListener(e -> {
            if (!ligado) return;
            contador.setText(String.valueOf(count));
            updatesom();
            if(count == 0 || count > 151) {
                JOptionPane.showMessageDialog(null, "Pokemon Inexistente");
            }
        });
   
        // Mais 10
        plus10.addActionListener(e -> {
            modify(10);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        // Menos 10
        minus10.addActionListener(e -> {
            modify(-10);
            contador.setText(String.valueOf(count));
            updateIcon();
        });

        // Posição da imagem do pokémon e do background
        pokemon.setBounds(80, 27, 400, 400);
        apa.setBounds(0,-38,700,590);

        // Adicionar tudo
        add(todosOsStats);
        add(contador);
        add(plus10);
        add(minus10);
        add(next);
        add(previous);
        add(ligar);
        add(desligar);
        add(pokemon);
        add(audio);
        add(um);
        add(dois);
        add(tres);
        add(quatro);
        add(cinco);
        add(seis);
        add(sete);
        add(oito);
        add(nove);
        add(zero);
        add(enter);
        add(apa);
        
        // Definições da Janela (texto, tamanho, redimensionável, posição, visibilidade)
        setTitle("Pokedexzinho");
        setSize(700,590-38);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    // Função main (principal): Inicializa o frame inteiro
    public static void main(String[] arg) {
        new Pokeframe();
    }

    // Função modify(valor): função que é responsável pelo funcionamento geral do programa
    // Basicamente ela tem um parâmetro que é "value", o valor/ID do pokémon atual (que é a variável count)
    public void modify(Integer value) {
        if (!ligado) return;
        if (value < 0) {
            // Prediction, vê se a próxima ação do usuário vai resultar em um valor abaixo de zero
            if (!(count + value < 0)) {
                count += value;
                pegarStatus(count);
            } else {
                JOptionPane.showMessageDialog(null, "O ID não pode ser abaixo de 0");
            }
        } else {
            // Prediction, vê se a próxima ação do usuário vai resultar em um valor abaixo de zero
            if (!(count + value > 151)) {
                count += value;
                pegarStatus(count);
            } else {
                JOptionPane.showMessageDialog(null, "O ID não pode ser acima de 151");
            }
        }
    }

    // Função pegarStatus(id): pega o status do ID chamado
    // Utiliza funções de html pois o java não aceita \n (quebra de linha) em um JLabel, já com HTML é só usar o <br>.
    public static void pegarStatus(Integer id) {
        todosOsStats.setText("");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(Pokeframe.class.getResource("status/" +id+ ".txt").getFile()), "Cp1250"))) {
            String line = null;
            todosOsStats.setText("<html>");
            // Ler todas as linhas
            while ((line = br.readLine()) != null) {
                todosOsStats.setText(todosOsStats.getText() + line + "<br>");
                System.out.println(todosOsStats.getText());
            }
            // Após ler, colocar um </html> para fechar
            todosOsStats.setText(todosOsStats.getText()+"</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // função updateIcon(): altera o ícone pro valor atual do contador
    public static void updateIcon() {
        ImageIcon imageIcon = new ImageIcon(Pokeframe.class.getResource(  "pokemons/" + count +  ".png" ));
        Image image = imageIcon.getImage();
        float size_x = imageIcon.getIconWidth()*2f;
        float size_y = imageIcon.getIconHeight()*2f;
        Image new_image = image.getScaledInstance((int) size_x, (int) size_y, Image.SCALE_FAST);
        imageIcon = new ImageIcon(new_image);
        pokemon.setIcon(imageIcon);
    }

    // função updatesom(): toca o som pro id atual
    public static void updatesom() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("poke_som/" + count + ".wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
    }

    // função Botao: função para facilitar a criação de botão
    public JButton Botao(String texto, Integer x, Integer y, Integer largura, Integer altura) {
        JButton temp = new JButton(texto);
        //setLayout(null);
        temp.setBorder(null);
        temp.setFocusPainted(false);
        temp.setContentAreaFilled(false);
        temp.setBounds(x, y, largura, altura);

        return temp;
    }

    // função Texto: função para facilitar a criação de texto
    public static JLabel Texto(String texto, Integer x, Integer y, Integer largura, Integer altura) {
        JLabel temp = new JLabel(texto);
        temp.setBorder(null);
        temp.setBounds(x, y, largura, altura);
        return temp;
    }
}
