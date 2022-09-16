package defpackage;
/* compiled from: PG */
/* renamed from: dxpi  reason: default package */
/* loaded from: classes6.dex */
public enum dxpi implements dsrb {
    UNKNOWN(0),
    READ_RECEIPT_OPT_IN(1),
    UNRECOGNIZED(-1);
    
    private final int d;

    dxpi(int i) {
        this.d = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
