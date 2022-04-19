module com.twelvemonkeys.metadata {
    requires java.desktop;
    requires com.twelvemonkeys.core;

    exports com.twelvemonkeys.imageio.metadata;
    exports com.twelvemonkeys.imageio.metadata.exif;
    exports com.twelvemonkeys.imageio.metadata.iptc;
    exports com.twelvemonkeys.imageio.metadata.jpeg;
    exports com.twelvemonkeys.imageio.metadata.psd;
    exports com.twelvemonkeys.imageio.metadata.tiff;
    exports com.twelvemonkeys.imageio.metadata.xmp;
}