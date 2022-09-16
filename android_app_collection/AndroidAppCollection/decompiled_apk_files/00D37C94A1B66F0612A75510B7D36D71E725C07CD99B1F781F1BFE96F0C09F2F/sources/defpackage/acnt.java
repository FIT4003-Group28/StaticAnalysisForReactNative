package defpackage;
/* compiled from: PG */
/* renamed from: acnt  reason: default package */
/* loaded from: classes.dex */
public final class acnt {
    public final String a;
    public final int b;
    public final axgq c;

    public acnt(String str, int i, axgq axgqVar) {
        this.a = str;
        this.b = i;
        this.c = axgqVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static axgq a(String str) {
        char c;
        switch (str.hashCode()) {
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c == 1) {
                return axgq.VP9;
            }
            if (c == 2) {
                return axgq.H264;
            }
            if (c == 3) {
                return axgq.H265X;
            }
            String valueOf = String.valueOf(str);
            zep.m("EncoderSupportUtil", valueOf.length() != 0 ? "Unexpected codec type: ".concat(valueOf) : new String("Unexpected codec type: "));
            return null;
        }
        return axgq.VP8;
    }
}
