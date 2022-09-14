package defpackage;
/* compiled from: PG */
/* renamed from: dwwj  reason: default package */
/* loaded from: classes.dex */
public enum dwwj implements dsrb {
    UNKNOWN_BUILDING3D_LAYER_SETTING(0),
    NORMAL_DRIVING_NAVIGATION(1),
    PROJECTED_DRIVING_NAVIGATION(2);
    
    private final int d;

    dwwj(int i) {
        this.d = i;
    }

    public static dwwj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NORMAL_DRIVING_NAVIGATION;
            }
            if (i == 2) {
                return PROJECTED_DRIVING_NAVIGATION;
            }
            return null;
        }
        return UNKNOWN_BUILDING3D_LAYER_SETTING;
    }

    public static dsrd c() {
        return dwwi.a;
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
