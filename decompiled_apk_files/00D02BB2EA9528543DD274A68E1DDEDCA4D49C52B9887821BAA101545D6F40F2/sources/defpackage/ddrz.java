package defpackage;
/* compiled from: PG */
/* renamed from: ddrz  reason: default package */
/* loaded from: classes6.dex */
public enum ddrz implements dsrb {
    UNKNOWN_START_TYPE(0),
    EXPLICIT_START(1),
    RECENT_SEARCH(2),
    COMMUTE(3),
    DIRECTIONS_LIST(4),
    EXTERNAL_INVOCATION_INTENT(5);
    
    public final int g;

    ddrz(int i) {
        this.g = i;
    }

    public static ddrz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXPLICIT_START;
            }
            if (i == 2) {
                return RECENT_SEARCH;
            }
            if (i == 3) {
                return COMMUTE;
            }
            if (i == 4) {
                return DIRECTIONS_LIST;
            }
            if (i == 5) {
                return EXTERNAL_INVOCATION_INTENT;
            }
            return null;
        }
        return UNKNOWN_START_TYPE;
    }

    public static dsrd c() {
        return ddry.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
