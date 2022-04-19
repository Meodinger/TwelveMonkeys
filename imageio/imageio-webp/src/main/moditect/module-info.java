module com.twelvemonkeys.imageio.webp {
    requires static java.desktop;
    requires transitive com.twelvemonkeys.imageio.core;
    requires transitive com.twelvemonkeys.imageio.metadata;

    exports com.twelvemonkeys.imageio.plugins.webp;

    uses javax.imageio.spi.ImageInputStreamSpi;

    provides javax.imageio.spi.ImageReaderSpi with
            com.twelvemonkeys.imageio.plugins.webp.WebPImageReaderSpi;
}