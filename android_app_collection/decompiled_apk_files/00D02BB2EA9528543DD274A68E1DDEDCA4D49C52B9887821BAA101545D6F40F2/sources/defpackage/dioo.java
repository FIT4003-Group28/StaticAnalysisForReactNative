package defpackage;
/* compiled from: PG */
/* renamed from: dioo  reason: default package */
/* loaded from: classes6.dex */
public enum dioo implements dsrb {
    UNKNOWN_INTENT(0),
    URL_ACTION(1),
    CALL_ACTION(2);
    
    private final int d;

    dioo(int i) {
        this.d = i;
    }

    public static dioo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return URL_ACTION;
            }
            if (i == 2) {
                return CALL_ACTION;
            }
            return null;
        }
        return UNKNOWN_INTENT;
    }

    public static dsrd c() {
        return dion.a;
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
