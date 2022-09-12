package defpackage;
/* compiled from: PG */
/* renamed from: tmo  reason: default package */
/* loaded from: classes7.dex */
public enum tmo implements dsrb {
    UNKNOWN(0),
    SAME_TRAVEL_MODE(1);
    
    public final int c;

    tmo(int i) {
        this.c = i;
    }

    public static tmo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SAME_TRAVEL_MODE;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return tmn.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
