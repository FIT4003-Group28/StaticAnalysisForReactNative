package defpackage;
/* compiled from: PG */
/* renamed from: dgah  reason: default package */
/* loaded from: classes6.dex */
public enum dgah implements dsrb {
    UNKNOWN_MESSAGING_APP(0),
    GMM(1),
    GMB(2);
    
    public final int d;

    dgah(int i) {
        this.d = i;
    }

    public static dgah b(int i) {
        if (i != 0) {
            if (i == 1) {
                return GMM;
            }
            if (i == 2) {
                return GMB;
            }
            return null;
        }
        return UNKNOWN_MESSAGING_APP;
    }

    public static dsrd c() {
        return dgag.a;
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
