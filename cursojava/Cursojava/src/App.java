import br.com.devflix.gui.*;
import br.com.devflix.videos.*;
//import videos.Filme;
public class App {
    public static void main(String[] args) throws Exception {

        /*videos.*/Filme filme = new /*videos.*/Filme();
        /*videos.*/Filme filme2 = new /*videos.*/Filme();


        Novel novel = new Novel();
        Documentario documentario = new Documentario();


        Janela janelinha = new Janela();
        MiniaturaVideos miniatura = new MiniaturaVideos();

        Anime desenhojapones = new Anime();
       
        desenhojapones.xis="GOKU";
        System.out.println(desenhojapones.xis);
    }
}
