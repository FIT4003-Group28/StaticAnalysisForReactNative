package defpackage;
/* compiled from: PG */
/* renamed from: ddoc  reason: default package */
/* loaded from: classes6.dex */
public enum ddoc implements dsrb {
    OKAY(0),
    NO_ENDPOINTS_FOUND(1),
    NO_PATH_FOUND(2);
    
    public final int d;

    ddoc(int i) {
        this.d = i;
    }

    public static ddoc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NO_ENDPOINTS_FOUND;
            }
            if (i == 2) {
                return NO_PATH_FOUND;
            }
            return null;
        }
        return OKAY;
    }

    public static dsrd c() {
        return ddob.a;
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
