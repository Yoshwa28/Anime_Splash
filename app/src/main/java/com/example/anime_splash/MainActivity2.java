package com.example.anime_splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView Marco;
    TextView Informacion;

    String INFO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Marco = findViewById(R.id.Marco);
        Informacion = findViewById(R.id.Informacion);

        INFO = getIntent().getExtras().getString("INFO");

        switch (INFO) {
            //ANISON
            case "shonen":
                Informacion.setText("En japonés su significado literal es “joven” o “adolescente”. Este género se enfoca más en un público masculino adolescente, se caracteriza porque suele tener combates o escenas más violentas. Shonen es el género de anime más popular en la actualidad, muchos de estos animes y manga tienen un héroe masculino joven y se centran en la acción, la aventura y la lucha.\n" +
                        "\n" +
                        "Estos programas suelen contar una historia secuencial sobre el deseo del protagonista de superar una tarea insuperable.  Algunos ejemplos populares de anime y manga shonen son Dragon Ball , Bleach , Naruto , One Piece, Watamote y Attack on Titan.");
                Marco.setBackground(getResources().getDrawable(R.drawable.shonen));
                break;

            case "sponko":
                Informacion.setText("Su estilo es meramente deportivo y su trama se basa en el mismo, algunos ejemplos son: Slam Dunk, Supercampeones, etc.En Japón se tienen registros de actividades deportivas, como la caza, desde principios del siglo XVII durante la era Edo, teniendo un mayor auge durante la era Meiji, siendo el sumo el más popular de los pasatiempos deportivos. Pero no es hasta finales del siglo XX cuando comienzan a escribirse los primeros mangas del género Spokon y se comienzan transmitir los primeros animes del mismo.\n" +
                        "\n" +
                        "Sin embargo, el género Spokon se hace realmente popular con la aparición de Captain Tsubasa, también conocido como Super Campeones en Latinoamérica y Campeones: Oliver y Benji en España, quién definitivamente revolucionó mundo del manga y el anime coronándose, quizás no como el pionero de su género, pero sí como uno de los más emblemáticos de su historia.\n" +
                        "\n" +
                        "Ahora bien, a pesar de los avances tecnológicos y de las diferentes técnicas artísticas para la creación de animes, el Spokon es uno de los pocos que aún conserva esa misma vieja esencia en cada una de sus historias, es decir, que a pesar de que estas historias parezcan repetirse por la similitud que existe entre ellas, no es algo que pueda acarrear un problema, ya su público siempre se siente identificado con los diferentes clubes deportivos presentes en el gran repertorio de este tipo de series, ya sea por los momentos de cámara lenta donde todos estaremos al borde del desquicio por saber cómo terminará la escena, o por lo flashbacks de la serie que en mas de una ocasión nos dejarán con la boca abierta y nos harán decir “aaaaa... Esto lo explica todo” o el famoso “ahora todo tiene más sentido”; sin contar que esa extraña mezcla entre drama, suspenso e intenso esfuerzo mental y físico por alcanzar la cima, es lo que hace a este género del anime tan particular y único entre los demás.");
                Marco.setBackground(getResources().getDrawable(R.drawable.sponkon));
                break;

            case "seinen":
                Informacion.setText("Este género es más sofisticado en cuanto al anime y manga que el género shōnen, por lo general sus temas más frecuentes contienen tramas relacionadas con el sexo, la violencia y la política. Una forma común de identificar a un manga seinen es observando si este contiene furigana sobre el texto original kanji. La carencia de furigana puede indicar que el texto está dirigido a una audiencia adulta. También al igual que el género shōjo pueden encontrarse los géneros comedia, acción, romance, ecchi (estos 2 últimos en su mayoría) en su trama o historia, también raras veces llega a colocarse el género yuri (amor entre mújeres) o el yaoi (amor entre hombre).\n" +
                        "\n" +
                        "Algunos de los animes y/o mangas conocidos son Akuma no Riddle, Btooom!, Elfen Lied, Tokyo Ghoul, Kill la Kill, No Game No Life, entre otros.");
                Marco.setBackground(getResources().getDrawable(R.drawable.seinen));
                break;

            case "mecha":
                Informacion.setText("Su temática va centrada en robots, algunos ejemplos son: Gundam, Mazinger Z, etc. Su origen se encuentra en las series de animación de los 70 y 80, en el género animado japonés, los cuales vienen a simbolizar el culmen de los avances tecnológicos en la robótica.\n" +
                        "\n" +
                        "Ya hoy día se ven como una forma de retirar a los seres humanos de ciertas tareas peligrosas para ellos, tales como la remoción de desechos tóxicos, pero la realizan desde una cabina protegida o un cuarto de control, donde no tienen contacto con el material. Sin embargo, su ámbito se podría expandir, dados los grandes avances en micromotores, computación y en lo militar, gracias a su aplicación reciente como cargadores y otros.");
                Marco.setBackground(getResources().getDrawable(R.drawable.mecha));
                break;

            case "kodomo":
                Informacion.setText("En japonés su significado literal es “niño”, este es un género del anime enfocado principalmente hacia el público infantil, donde sus animaciones y tramas son más fantasiosas y sencillas. Sin embargo, en el ámbito del manga y del anime se emplea para referirse a un público infantil. La demografía kodomo se distingue por la ausencia de fanservice u otros elementos destinados a audiencias más adultas (es la tendencia habitual). Las historias están caracterizadas por el uso de temas y conceptos para los niños y la familia.\n" +
                        "\n" +
                        "También es muy común que personas adultas se interesen por dichas series (un 70% de la población japonesa adulta, según recientes encuestas), probablemente por su desenfadado estilo, su corta duración y una simple trama.\n" +
                        "\n" +
                        "Algunos ejemplos de series kodomo son: Heidi, Doraemon, Hamtaro, Bakugan Battle Brawlers…");
                Marco.setBackground(getResources().getDrawable(R.drawable.kodomo));
                break;

            case "josei":
                Informacion.setText("En japonés su significado literal es “mujer”. Este género se caracteriza porque va dirigido específicamente a un público más adulto o maduro, a diferencia del shojo, que se centra más en las adolescentes; este género se caracteriza por que abarca drama, romance, reencuentros de vida. Los animes que más destacan son: Nana, Paradise Kiss, Honey, etc. El manga josei, llamado también redikomi, apareció en los años 1980, durante el periodo boom del manga, cuando las chicas que leían manga shōjo querían contenido más maduro.1\u200B\n" +
                        "\n" +
                        "La primera revista en publicar este tipo de contenido fue Be-Love en 1980. A finales de los años 1980 aparecieron más revistas de este tipo y en la entrada de los años 1990 la cantidad aumentó hasta 50 revistas diferentes.2\u200B3\u200B\n" +
                        "\n" +
                        "Las historias suelen tratar las experiencias diarias de las mujeres que viven en Japón. Aunque algunas cubren temas de mujeres de instituto, la mayoría cubren las vidas de mujeres adultas. Este estilo tiende a ser una versión más restringida y realista del shōjo, manteniendo los rasgos gráciles de los personajes pero deshaciéndose de los ojos grandes y vidriosos que abundan en este último género. Sin embargo, pueden encontrarse excepciones al estilo aquí descrito. Además, al contrario que el shōjo, el josei puede mostrar un romance realista (en oposición al conocido romance idealizado del shōjo).");
                Marco.setBackground(getResources().getDrawable(R.drawable.josei));
                break;
        }
    }
}