package defpackage;
/* compiled from: PG */
/* renamed from: dwvy  reason: default package */
/* loaded from: classes6.dex */
public enum dwvy implements dsrb {
    UNKNOWN_SORT_ORDER(0),
    NEWEST(1),
    OLDEST(2),
    MOST_LIKED(3),
    MOST_VIEWED(4);
    
    public final int f;

    dwvy(int i) {
        this.f = i;
    }

    public static dwvy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NEWEST;
            }
            if (i == 2) {
                return OLDEST;
            }
            if (i == 3) {
                return MOST_LIKED;
            }
            if (i == 4) {
                return MOST_VIEWED;
            }
            return null;
        }
        return UNKNOWN_SORT_ORDER;
    }

    public static dsrd c() {
        return dwvx.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
