package defpackage;
/* compiled from: PG */
/* renamed from: dnkh  reason: default package */
/* loaded from: classes6.dex */
public enum dnkh implements dsrb {
    UNKNOWN_SEMANTIC_TYPE(0),
    HOME(1),
    WORK(2);
    
    public final int d;

    dnkh(int i) {
        this.d = i;
    }

    public static dnkh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HOME;
            }
            if (i == 2) {
                return WORK;
            }
            return null;
        }
        return UNKNOWN_SEMANTIC_TYPE;
    }

    public static dsrd c() {
        return dnkg.a;
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
