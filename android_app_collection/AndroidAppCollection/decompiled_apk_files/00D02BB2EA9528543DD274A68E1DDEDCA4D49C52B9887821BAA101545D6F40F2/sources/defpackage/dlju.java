package defpackage;
/* compiled from: PG */
/* renamed from: dlju  reason: default package */
/* loaded from: classes6.dex */
public enum dlju implements dsrb {
    SEVERITY_UNKNOWN(0),
    SEVERITY_CRITICAL(1),
    SEVERITY_WARNING(2),
    SEVERITY_INFORMATION(3);
    
    public final int e;

    dlju(int i) {
        this.e = i;
    }

    public static dlju b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SEVERITY_CRITICAL;
            }
            if (i == 2) {
                return SEVERITY_WARNING;
            }
            if (i == 3) {
                return SEVERITY_INFORMATION;
            }
            return null;
        }
        return SEVERITY_UNKNOWN;
    }

    public static dsrd c() {
        return dljt.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
