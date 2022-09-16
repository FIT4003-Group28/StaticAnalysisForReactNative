package defpackage;
/* compiled from: PG */
/* renamed from: aqwt  reason: default package */
/* loaded from: classes2.dex */
public enum aqwt implements aopm {
    MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN(0),
    MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD(1),
    UNRECOGNIZED(-1);
    
    private final int e;

    aqwt(int i) {
        this.e = i;
    }

    public static aopo a() {
        return aqvj.q;
    }

    public static aqwt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MANIFESTLESS_SEQUENCE_METHOD_LIVE_HEAD;
            }
            return null;
        }
        return MANIFESTLESS_SEQUENCE_METHOD_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
