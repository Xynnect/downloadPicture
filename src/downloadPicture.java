import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;
import java.net.URL;

/**
 * Created by zyan on 06/04/15.
 */
public class downloadPicture {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://upload.wikimedia.org/wikipedia/commons/c/cc/Rectangle_.png");
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        int n = 0;
        while (-1!=(n=in.read(buf)))
        {
            out.write(buf, 0, n);
        }
        out.close();
        in.close();
        byte[] response = out.toByteArray();
        FileOutputStream fos = new FileOutputStream("/home/zyan/IdeaProjects/Rectangle_.png");
        fos.write(response);
        fos.close();
        //commit
    }
}
