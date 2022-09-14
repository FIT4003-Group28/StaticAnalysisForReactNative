package defpackage;
/* compiled from: PG */
/* renamed from: ddhv  reason: default package */
/* loaded from: classes5.dex */
public enum ddhv implements dsrb {
    UNKNOWN(0),
    INTENT_URL(1),
    VANITY_URL(2);
    
    public final int d;

    ddhv(int i) {
        this.d = i;
    }

    public static ddhv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return INTENT_URL;
            }
            if (i == 2) {
                return VANITY_URL;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return ddhu.a;
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
