import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaViewer;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.ToolFactory;

import com.xuggle.xuggler.Configuration;
import com.xuggle.xuggler.ICodec;
import com.xuggle.xuggler.IContainer;
import com.xuggle.xuggler.IContainerFormat;
import com.xuggle.xuggler.IPacket;
import com.xuggle.xuggler.IPixelFormat;
import com.xuggle.xuggler.IRational;
import com.xuggle.xuggler.IStream;
import com.xuggle.xuggler.IStreamCoder;
import com.xuggle.xuggler.IVideoPicture;
import com.xuggle.xuggler.video.ConverterFactory;
import com.xuggle.xuggler.video.IConverter;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Transcoder {
    private static final String inputFilename = "c:/videos/flame.avi";
    private static final String outputFilename = "c:/videos/flame2.mp4";

    public static void main(String[] args) {
        IMediaReader mediaReader =   ToolFactory.makeReader(inputFilename);

        mediaReader.addListener(
            ToolFactory.makeWriter(outputFilename, mediaReader));

        mediaReader.addListener(ToolFactory.makeViewer(true));

        while (mediaReader.readPacket() == null) ;

       /* IContainer writer = IContainer.make();
        IContainerFormat iContainerFormatWriter = IContainerFormat.make();
        iContainerFormatWriter.setOutputFormat("mp4", "c:/videos/flame2", null);
        writer.open(<FILE_NAME>, IContainer.Type.WRITE, iContainerFormatWriter);
        IStream iStream = writer.addNewStream(0); //My file will contain only one stream
        IStreamCoder streamCoder = iStream.getStreamCoder();
        //streamCoder.setTimeBase(IRational.make(<NUMERATOR AND DENOMINATOR GOES HERE>)); //No sure you will need this 
        streamCoder.setCodec(<CODEC_ID_LIKE_MGPEG_GOES_HERE);
        streamCoder.setWidth(640);
        streamCoder.setHeight(480);
        streamCoder.setPixelType(IPixelFormat.TYPE.YUV420P); //here it is
*/
    }
}
