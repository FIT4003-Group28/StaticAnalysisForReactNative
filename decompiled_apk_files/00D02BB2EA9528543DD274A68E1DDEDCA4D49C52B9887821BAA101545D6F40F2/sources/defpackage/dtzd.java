package defpackage;
/* compiled from: PG */
/* renamed from: dtzd  reason: default package */
/* loaded from: classes6.dex */
public enum dtzd implements dsrb {
    CLIENT_CAPABILITY_UNKNOWN(0),
    CLIENT_CAPABILITY_PII(1),
    CLIENT_CAPABILITY_RATING_SCALE_10_11(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    dtzd(int i) {
        this.e = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
