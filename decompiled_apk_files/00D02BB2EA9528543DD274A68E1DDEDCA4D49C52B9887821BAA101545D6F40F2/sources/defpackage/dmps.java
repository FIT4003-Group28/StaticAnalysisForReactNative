package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dmps  reason: default package */
/* loaded from: classes.dex */
public enum dmps implements dsrb {
    UNKNOWN_PROJECTION_BEHAVIOR(0),
    PROJECTION_SCREEN_ALIGNED(1),
    PROJECTION_WORLD_ALIGNED(2);
    
    private final int d;

    dmps(int i) {
        this.d = i;
    }

    public static dmps b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PROJECTION_SCREEN_ALIGNED;
            }
            if (i == 2) {
                return PROJECTION_WORLD_ALIGNED;
            }
            return null;
        }
        return UNKNOWN_PROJECTION_BEHAVIOR;
    }

    public static dsrd c() {
        return dmpr.a;
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
