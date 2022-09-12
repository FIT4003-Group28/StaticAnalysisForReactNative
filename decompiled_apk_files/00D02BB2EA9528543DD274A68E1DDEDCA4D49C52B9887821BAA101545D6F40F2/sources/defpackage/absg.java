package defpackage;
/* compiled from: PG */
/* renamed from: absg  reason: default package */
/* loaded from: classes.dex */
public enum absg implements dsrb {
    UNKNOWN_EXPLORE_SURFACE(0),
    HOME_SCREEN_EXPLORE_TAB(1),
    AREA_EXPLORE(2);
    
    public final int d;

    absg(int i) {
        this.d = i;
    }

    public static absg b(int i) {
        if (i != 0) {
            if (i == 1) {
                return HOME_SCREEN_EXPLORE_TAB;
            }
            if (i == 2) {
                return AREA_EXPLORE;
            }
            return null;
        }
        return UNKNOWN_EXPLORE_SURFACE;
    }

    public static dsrd c() {
        return absf.a;
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
