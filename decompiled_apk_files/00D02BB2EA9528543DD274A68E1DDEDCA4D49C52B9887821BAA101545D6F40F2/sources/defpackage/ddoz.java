package defpackage;
/* compiled from: PG */
/* renamed from: ddoz  reason: default package */
/* loaded from: classes6.dex */
public enum ddoz implements dsrb {
    UNKNOWN(0),
    EXPERIMENT(1),
    PRODUCTION(2);
    
    public final int d;

    ddoz(int i) {
        this.d = i;
    }

    public static ddoz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXPERIMENT;
            }
            if (i == 2) {
                return PRODUCTION;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return ddoy.a;
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
