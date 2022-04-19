module com.twelvemonkeys.imageio.metadata {
    requires static java.desktop;
    requires transitive com.twelvemonkeys.imageio.core;

    exports com.twelvemonkeys.imageio.metadata;
    exports com.twelvemonkeys.imageio.metadata.exif;
    exports com.twelvemonkeys.imageio.metadata.iptc;
    exports com.twelvemonkeys.imageio.metadata.jpeg;
    exports com.twelvemonkeys.imageio.metadata.psd;
    exports com.twelvemonkeys.imageio.metadata.tiff;
    exports com.twelvemonkeys.imageio.metadata.xmp;
}