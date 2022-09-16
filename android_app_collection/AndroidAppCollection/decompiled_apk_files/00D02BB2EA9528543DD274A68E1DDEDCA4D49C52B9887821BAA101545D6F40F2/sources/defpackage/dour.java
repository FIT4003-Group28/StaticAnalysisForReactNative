package defpackage;
/* compiled from: PG */
/* renamed from: dour  reason: default package */
/* loaded from: classes6.dex */
public enum dour implements dsrb {
    UNKNOWN_DIRECTION_OF_MOTION(0),
    LEFT_TO_RIGHT(1),
    RIGHT_TO_LEFT(2);
    
    private final int d;

    dour(int i) {
        this.d = i;
    }

    public static dour b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LEFT_TO_RIGHT;
            }
            if (i == 2) {
                return RIGHT_TO_LEFT;
            }
            return null;
        }
        return UNKNOWN_DIRECTION_OF_MOTION;
    }

    public static dsrd c() {
        return douq.a;
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
