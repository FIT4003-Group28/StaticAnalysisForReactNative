package defpackage;
/* compiled from: PG */
/* renamed from: bwda  reason: default package */
/* loaded from: classes4.dex */
public final class bwda {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int a(String str) {
        char c;
        switch (str.hashCode()) {
            case -997441601:
                if (str.equals("pa.nbp")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -997439198:
                if (str.equals("pa.pra")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -997434540:
                if (str.equals("pa.umi")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1791077329:
                if (str.equals("place.ups")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1858891446:
                if (str.equals("place.cr")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1858891944:
                if (str.equals("place.st")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2117740898:
                if (str.equals("rmi.wvor")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            default:
                return 1;
        }
    }
}
