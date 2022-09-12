package defpackage;
/* compiled from: PG */
/* renamed from: dpkw  reason: default package */
/* loaded from: classes6.dex */
public enum dpkw implements dsrb {
    UNKNOWN_REASON(0),
    TRUMPED(1);
    
    public final int c;

    dpkw(int i) {
        this.c = i;
    }

    public static dpkw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TRUMPED;
            }
            return null;
        }
        return UNKNOWN_REASON;
    }

    public static dsrd c() {
        return dpkv.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
