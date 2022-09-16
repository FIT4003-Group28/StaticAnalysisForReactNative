package defpackage;
/* compiled from: PG */
/* renamed from: dlep  reason: default package */
/* loaded from: classes6.dex */
public enum dlep implements dsrb {
    UNKNOWN_TYPE(0),
    ENTER(1),
    EXIT(2),
    ON_EXIT(3);
    
    public final int e;

    dlep(int i) {
        this.e = i;
    }

    public static dlep b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ENTER;
            }
            if (i == 2) {
                return EXIT;
            }
            if (i == 3) {
                return ON_EXIT;
            }
            return null;
        }
        return UNKNOWN_TYPE;
    }

    public static dsrd c() {
        return dleo.a;
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
