package defpackage;
/* compiled from: PG */
/* renamed from: bzjc  reason: default package */
/* loaded from: classes4.dex */
public enum bzjc implements dsrb {
    UNKNOWN(0),
    ALERT(1),
    WARNING(2),
    INFORMATION(3);
    
    public final int e;

    bzjc(int i) {
        this.e = i;
    }

    public static bzjc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ALERT;
            }
            if (i == 2) {
                return WARNING;
            }
            if (i == 3) {
                return INFORMATION;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return bzjb.a;
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
