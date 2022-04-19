module com.twelvemonkeys.webp {
    requires java.desktop;
    requires com.twelvemonkeys.core;

    exports com.twelvemonkeys.imageio.plugins.webp;

    provides javax.imageio.spi.ImageReaderSpi with com.twelvemonkeys.imageio.plugins.webp.WebPImageReaderSpi;
}