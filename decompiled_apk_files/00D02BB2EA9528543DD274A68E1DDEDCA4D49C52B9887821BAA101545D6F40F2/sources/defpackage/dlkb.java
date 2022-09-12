package defpackage;
/* compiled from: PG */
/* renamed from: dlkb  reason: default package */
/* loaded from: classes6.dex */
public enum dlkb implements dsrb {
    UNKNOWN_KNOWN_PLACE_NAME(0),
    HOME(1),
    WORK(2);
    
    public final int d;

    dlkb(int i) {
        this.d = i;
    }

    public static dlkb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HOME;
            }
            if (i == 2) {
                return WORK;
            }
            return null;
        }
        return UNKNOWN_KNOWN_PLACE_NAME;
    }

    public static dsrd c() {
        return dlka.a;
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
