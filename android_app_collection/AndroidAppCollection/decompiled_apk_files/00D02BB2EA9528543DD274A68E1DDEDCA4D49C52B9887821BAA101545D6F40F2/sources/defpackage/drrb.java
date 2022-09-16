package defpackage;
/* compiled from: PG */
/* renamed from: drrb  reason: default package */
/* loaded from: classes6.dex */
public enum drrb implements dsrb {
    UNKNOWN_CONTENT(0),
    EXPLORE(1),
    LOCAL_STREAM(2),
    COMMUTE(3),
    CONTRIBUTE(4),
    SAVED_LISTS(5);
    
    private final int g;

    drrb(int i) {
        this.g = i;
    }

    public static drrb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EXPLORE;
            }
            if (i == 2) {
                return LOCAL_STREAM;
            }
            if (i == 3) {
                return COMMUTE;
            }
            if (i == 4) {
                return CONTRIBUTE;
            }
            if (i == 5) {
                return SAVED_LISTS;
            }
            return null;
        }
        return UNKNOWN_CONTENT;
    }

    public static dsrd c() {
        return drra.a;
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
