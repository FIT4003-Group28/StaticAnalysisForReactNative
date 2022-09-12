package defpackage;
/* compiled from: PG */
/* renamed from: doym  reason: default package */
/* loaded from: classes6.dex */
public enum doym implements dsrb {
    STRAIGHT(0),
    SLIGHT(1),
    NORMAL(2),
    SHARP(3),
    U_TURN(4),
    MERGE(5);
    
    public final int g;

    doym(int i) {
        this.g = i;
    }

    public static doym b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SLIGHT;
            }
            if (i == 2) {
                return NORMAL;
            }
            if (i == 3) {
                return SHARP;
            }
            if (i == 4) {
                return U_TURN;
            }
            if (i == 5) {
                return MERGE;
            }
            return null;
        }
        return STRAIGHT;
    }

    public static dsrd c() {
        return doyl.a;
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
