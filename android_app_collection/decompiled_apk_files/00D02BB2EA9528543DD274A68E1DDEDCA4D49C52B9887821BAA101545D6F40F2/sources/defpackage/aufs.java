package defpackage;
/* compiled from: PG */
/* renamed from: aufs  reason: default package */
/* loaded from: classes.dex */
public enum aufs implements dsrb {
    UNKNOWN_STATE(0),
    ENABLED(1),
    INBOX_ONLY(2),
    DISABLED(3);
    
    public final int e;

    aufs(int i) {
        this.e = i;
    }

    public static aufs b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENABLED;
            }
            if (i == 2) {
                return INBOX_ONLY;
            }
            if (i == 3) {
                return DISABLED;
            }
            return null;
        }
        return UNKNOWN_STATE;
    }

    public static dsrd c() {
        return aufr.a;
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
