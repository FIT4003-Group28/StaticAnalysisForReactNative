package defpackage;
/* compiled from: PG */
/* renamed from: dkde  reason: default package */
/* loaded from: classes6.dex */
public enum dkde implements dsrb {
    UNKNOWN_KEY(0),
    CAPTURE_TIMESTAMP(1),
    VIEWCOUNT(2);
    
    public final int d;

    dkde(int i) {
        this.d = i;
    }

    public static dkde b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CAPTURE_TIMESTAMP;
            }
            if (i == 2) {
                return VIEWCOUNT;
            }
            return null;
        }
        return UNKNOWN_KEY;
    }

    public static dsrd c() {
        return dkdd.a;
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
