package defpackage;
/* compiled from: PG */
/* renamed from: dead  reason: default package */
/* loaded from: classes6.dex */
public enum dead implements dsrb {
    UNASSIGNED_DIRECTIONAL_MOVEMENT_ID(0),
    LEFT(1),
    RIGHT(2),
    UP(3),
    DOWN(4);
    
    public final int f;

    dead(int i) {
        this.f = i;
    }

    public static dead b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LEFT;
            }
            if (i == 2) {
                return RIGHT;
            }
            if (i == 3) {
                return UP;
            }
            if (i == 4) {
                return DOWN;
            }
            return null;
        }
        return UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
    }

    public static dsrd c() {
        return deac.a;
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
