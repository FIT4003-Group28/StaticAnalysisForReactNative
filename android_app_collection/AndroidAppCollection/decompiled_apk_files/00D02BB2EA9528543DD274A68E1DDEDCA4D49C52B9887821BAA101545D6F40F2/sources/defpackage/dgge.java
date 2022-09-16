package defpackage;
/* compiled from: PG */
/* renamed from: dgge  reason: default package */
/* loaded from: classes.dex */
public enum dgge implements dsrb {
    IMAGE_UNKNOWN(0),
    IMAGE_INTERNET(1),
    IMAGE_ALLEYCAT(2),
    IMAGE_FIFE(3),
    IMAGE_PANORAMIO(4),
    METADATA_GEO_PHOTO_SERVICE(5),
    VIDEO_YOUTUBE(6),
    KEYHOLE(7),
    IMAGE_CONTENT_FIFE(8),
    IMAGE_ALLEYCAT_SEARCH(9),
    MEDIA_GUESSABLE_FIFE(10);
    
    public final int l;

    dgge(int i) {
        this.l = i;
    }

    public static dgge b(int i) {
        switch (i) {
            case 0:
                return IMAGE_UNKNOWN;
            case 1:
                return IMAGE_INTERNET;
            case 2:
                return IMAGE_ALLEYCAT;
            case 3:
                return IMAGE_FIFE;
            case 4:
                return IMAGE_PANORAMIO;
            case 5:
                return METADATA_GEO_PHOTO_SERVICE;
            case 6:
                return VIDEO_YOUTUBE;
            case 7:
                return KEYHOLE;
            case 8:
                return IMAGE_CONTENT_FIFE;
            case 9:
                return IMAGE_ALLEYCAT_SEARCH;
            case 10:
                return MEDIA_GUESSABLE_FIFE;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dggd.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
