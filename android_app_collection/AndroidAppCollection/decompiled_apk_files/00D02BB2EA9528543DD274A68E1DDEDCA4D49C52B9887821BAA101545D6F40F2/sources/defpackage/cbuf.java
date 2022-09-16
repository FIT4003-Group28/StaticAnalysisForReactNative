package defpackage;
/* compiled from: PG */
/* renamed from: cbuf  reason: default package */
/* loaded from: classes4.dex */
public enum cbuf implements dsrb {
    UNKNOWN(1),
    REVIEW(2),
    PLACE_TOPIC(3);
    
    public final int d;

    cbuf(int i) {
        this.d = i;
    }

    public static cbuf b(int i) {
        if (i != 1) {
            if (i == 2) {
                return REVIEW;
            }
            if (i == 3) {
                return PLACE_TOPIC;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return cbue.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
