package defpackage;
/* compiled from: PG */
/* renamed from: dnpj  reason: default package */
/* loaded from: classes.dex */
public enum dnpj implements dsrb {
    UNKNOWN_PERSONAL_FEATURE_PROVIDER(0),
    KANSAS(1),
    HAPPYHOUR(2);
    
    private final int d;

    dnpj(int i) {
        this.d = i;
    }

    public static dnpj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return KANSAS;
            }
            if (i == 2) {
                return HAPPYHOUR;
            }
            return null;
        }
        return UNKNOWN_PERSONAL_FEATURE_PROVIDER;
    }

    public static dsrd c() {
        return dnpi.a;
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
