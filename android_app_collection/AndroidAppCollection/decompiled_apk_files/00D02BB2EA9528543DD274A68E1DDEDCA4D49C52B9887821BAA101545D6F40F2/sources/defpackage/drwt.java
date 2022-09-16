package defpackage;
/* compiled from: PG */
/* renamed from: drwt  reason: default package */
/* loaded from: classes6.dex */
public enum drwt implements dsrb {
    EXTENSION_VIEW_UNSPECIFIED(0),
    IHNR(1),
    INSAT(2);
    
    public final int d;

    drwt(int i) {
        this.d = i;
    }

    public static drwt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return IHNR;
            }
            if (i == 2) {
                return INSAT;
            }
            return null;
        }
        return EXTENSION_VIEW_UNSPECIFIED;
    }

    public static dsrd c() {
        return drws.a;
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
