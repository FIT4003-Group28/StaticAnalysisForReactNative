package defpackage;
/* compiled from: PG */
/* renamed from: dool  reason: default package */
/* loaded from: classes6.dex */
public enum dool implements dsrb {
    SHORT(0),
    MEDIUM(1),
    LONG(2);
    
    private final int d;

    dool(int i) {
        this.d = i;
    }

    public static dool b(int i) {
        if (i != 0) {
            if (i == 1) {
                return MEDIUM;
            }
            if (i == 2) {
                return LONG;
            }
            return null;
        }
        return SHORT;
    }

    public static dsrd c() {
        return dook.a;
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
