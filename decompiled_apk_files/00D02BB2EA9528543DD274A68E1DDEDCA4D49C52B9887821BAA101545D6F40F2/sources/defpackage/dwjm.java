package defpackage;
/* compiled from: PG */
/* renamed from: dwjm  reason: default package */
/* loaded from: classes6.dex */
public enum dwjm implements dsrb {
    DEFAULT_SEARCH(0),
    LOCAL_GUIDE_LOCATION(1),
    STREET_NUMBER(2);
    
    public final int d;

    dwjm(int i) {
        this.d = i;
    }

    public static dwjm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LOCAL_GUIDE_LOCATION;
            }
            if (i == 2) {
                return STREET_NUMBER;
            }
            return null;
        }
        return DEFAULT_SEARCH;
    }

    public static dsrd c() {
        return dwjl.a;
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
