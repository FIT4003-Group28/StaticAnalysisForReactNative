package defpackage;
/* compiled from: PG */
/* renamed from: axgq  reason: default package */
/* loaded from: classes2.dex */
public enum axgq implements aopm {
    UNKNOWN(0),
    VP8(1),
    VP9(2),
    H264(3),
    H265X(4),
    AV1X(5);
    
    public final int g;

    axgq(int i) {
        this.g = i;
    }

    public static aopo a() {
        return axce.g;
    }

    public static axgq b(int i) {
        if (i != 0) {
            if (i == 1) {
                return VP8;
            }
            if (i == 2) {
                return VP9;
            }
            if (i == 3) {
                return H264;
            }
            if (i == 4) {
                return H265X;
            }
            if (i == 5) {
                return AV1X;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
