import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Pokeframe extends JFrame {
    public static String[] pokemons = {null,"bulbasaur","ivysaur","venusaur","charmander","charmeleon","charizard","squirtle","wartortle","blastoise","caterpie","metapod","butterfree","weedle","kakuna","beedrill","pidgey","pidgeotto","pidgeot","rattata","raticate","spearow","fearow","ekans","arbok","pikachu","raichu","sandshrew","sandslash","nidoran-f","nidorina","nidoqueen","nidoran-m","nidorino","nidoking","clefairy","clefable","vulpix","ninetales","jigglypuff","wigglytuff","zubat","golbat","oddish","gloom","vileplume","paras","parasect","venonat","venomoth","diglett","dugtrio","meowth","persian","psyduck","golduck","mankey","primeape","growlithe","arcanine","poliwag","poliwhirl","poliwrath","abra","kadabra","alakazam","machop","machoke","machamp","bellsprout","weepinbell","victreebel","tentacool","tentacruel","geodude","graveler","golem","ponyta","rapidash","slowpoke","slowbro","magnemite","magneton","farfetchd","doduo","dodrio","seel","dewgong","grimer","muk","shellder","cloyster","gastly","haunter","gengar","onix","drowzee","hypno","krabby","kingler","voltorb","electrode","exeggcute","exeggutor","cubone","marowak","hitmonlee","hitmonchan","lickitung","koffing","weezing","rhyhorn","rhydon","chansey","tangela","kangaskhan","horsea","seadra","goldeen","seaking","staryu","starmie","mr-mime","scyther","jynx","electabuzz","magmar","pinsir","tauros","magikarp","gyarados","lapras","ditto","eevee","vaporeon","jolteon","flareon","porygon","omanyte","omastar","kabuto","kabutops","aerodactyl","snorlax","articuno","zapdos","moltres","dratini","dragonair","dragonite","mewtwo"};
    ImageIcon poke = new ImageIcon(Objects.requireNonNull(getClass().getResource("pokedex.jpg")));
    JLabel apa = new JLabel(poke);
    JButton next = Botao(">", 280, 438-38, 40, 30);
    JButton previous = Botao("<", 220, 438-38, 40, 30);
    JButton ligar = Botao("ligar", 87, 415-38, 60, 16);
    JButton desligar = Botao("desligar", 156, 415-38, 60, 16);
    JButton plus10 = Botao("^", 256, 408-38, 30, 40);
    JButton minus10 = Botao("v", 256, 458-38, 30, 40);

    static JLabel contador = Texto("0", 115, 443-38, 90, 90);
    public static Integer count = Integer.parseInt(contador.getText());

    static JLabel pokemon = new JLabel(); // variavel para colocar o icone (imagem do pokemon)
    static JLabel atual = Texto("Nenhum", 480, 160, 100, 50);

    public Pokeframe() {
        setLayout(null);
        // System.out.println(pokemons.toString());
        contador.setFont(new Font("Verdana", Font.PLAIN, 34));
        updateIcon();
        next.addActionListener(e -> {
            modify(1);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        previous.addActionListener(e -> {
            modify(-1);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        plus10.addActionListener(e -> {
            modify(10);
            contador.setText(String.valueOf(count));
            updateIcon();
        });
        minus10.addActionListener(e -> {
            modify(-10);
            contador.setText(String.valueOf(count));
            updateIcon();
        });

        pokemon.setBounds(80, 27, 400, 400);
        apa.setBounds(0,-38,700,590);

        add(contador);
        add(plus10);
        add(minus10);
        add(next);
        add(previous);
        add(ligar);
        add(desligar);
        add(pokemon);
        add(atual);
        add(apa);

        setTitle("Pokedex");
        setSize(700,590-38);
        setDefaultCloseOperation(Pokeframe.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] arg) {
        new Pokeframe();
    }
    public void modify(Integer value) {

        if (value < 0) {
            if (!(count + value < 0)) {
                count += value;
                atual.setText(pokemons[count]);
            } else {
                JOptionPane.showMessageDialog(null, "O ID não pode ser abaixo de 0");
            }
        } else {
            if (!(count + value > 151)) {
                count += value;
                atual.setText(pokemons[count]);
                //JOptionPane.showMessageDialog(null, PokemonStorage.getFromId(count));
            } else {
                JOptionPane.showMessageDialog(null, "O ID não pode ser acima de 151");
            }
        }
    }
    public static void updateIcon() {
        ImageIcon imageIcon = new ImageIcon("./pokemons/" + count + ".png");
        Image image = imageIcon.getImage();
        float size_x = imageIcon.getIconWidth()*2f;
        float size_y = imageIcon.getIconHeight()*2f;
        Image new_image = image.getScaledInstance((int) size_x, (int) size_y, Image.SCALE_FAST);
        imageIcon = new ImageIcon(new_image);
        pokemon.setIcon(imageIcon);
    }
    public JButton Botao(String texto, Integer x, Integer y, Integer largura, Integer altura) {
        JButton temp = new JButton(texto);
        //setLayout(null);
        temp.setBorder(null);
        temp.setFocusPainted(false);
        temp.setContentAreaFilled(false);
        temp.setBounds(x, y, largura, altura);

        return temp;
    }

    public static JLabel Texto(String texto, Integer x, Integer y, Integer largura, Integer altura) {
        JLabel temp = new JLabel(texto);
        temp.setBorder(null);
        temp.setBounds(x, y, largura, altura);
        return temp;
    }
}
