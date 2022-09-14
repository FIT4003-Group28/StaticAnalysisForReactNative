package defpackage;
/* compiled from: PG */
/* renamed from: akwd  reason: default package */
/* loaded from: classes.dex */
public enum akwd implements dsrb {
    UNSPECIFIED(0),
    WORLD_RELATIVE(1),
    SCREEN_RELATIVE(2);
    
    public final int d;

    akwd(int i) {
        this.d = i;
    }

    public static akwd b(int i) {
        if (i != 0) {
            if (i == 1) {
                return WORLD_RELATIVE;
            }
            if (i == 2) {
                return SCREEN_RELATIVE;
            }
            return null;
        }
        return UNSPECIFIED;
    }

    public static dsrd c() {
        return akwc.a;
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
