module com.twelvemonkeys.core {
    requires java.desktop;
    requires com.twelvemonkeys.common.lang;
    requires com.twelvemonkeys.common.image;
    requires com.twelvemonkeys.common.io;

    exports com.twelvemonkeys.imageio;
    exports com.twelvemonkeys.imageio.color;
    exports com.twelvemonkeys.imageio.stream;
    exports com.twelvemonkeys.imageio.util;
    exports com.twelvemonkeys.imageio.spi;

    provides javax.imageio.spi.ImageInputStreamSpi with com.twelvemonkeys.imageio.stream.BufferedFileImageInputStreamSpi;
    provides javax.imageio.spi.ImageInputStreamSpi with com.twelvemonkeys.imageio.stream.BufferedRAFImageInputStreamSpi;
    provides javax.imageio.spi.ImageInputStreamSpi with com.twelvemonkeys.imageio.color.ProfileDeferralActivator$Spi;
}