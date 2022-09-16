package c.d.h.a.a.i;
/* loaded from: classes.dex */
public class d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1917159454:
                if (str.equals("QualifiedResourceFetchProducer")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1914072202:
                if (str.equals("BitmapMemoryCacheGetProducer")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1683996557:
                if (str.equals("LocalResourceFetchProducer")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1579985851:
                if (str.equals("LocalFileFetchProducer")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1307634203:
                if (str.equals("EncodedMemoryCacheProducer")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1224383234:
                if (str.equals("NetworkFetchProducer")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 473552259:
                if (str.equals("VideoThumbnailProducer")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 656304759:
                if (str.equals("DiskCacheProducer")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 957714404:
                if (str.equals("BitmapMemoryCacheProducer")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1019542023:
                if (str.equals("LocalAssetFetchProducer")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1023071510:
                if (str.equals("PostprocessedBitmapMemoryCacheProducer")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1721672898:
                if (str.equals("DataFetchProducer")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1793127518:
                if (str.equals("LocalContentUriThumbnailFetchProducer")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2109593398:
                if (str.equals("PartialDiskCacheProducer")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2113652014:
                if (str.equals("LocalContentUriFetchProducer")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
            case 5:
                return 3;
            case 6:
                return 2;
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                return 6;
            default:
                return 1;
        }
    }

    public static String a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "unknown" : "local" : "memory_bitmap" : "memory_encoded" : "disk" : "network";
    }
}
