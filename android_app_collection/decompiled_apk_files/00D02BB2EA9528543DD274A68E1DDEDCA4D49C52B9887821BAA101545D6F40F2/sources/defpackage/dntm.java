package defpackage;
/* compiled from: PG */
/* renamed from: dntm  reason: default package */
/* loaded from: classes6.dex */
public enum dntm implements dsrb {
    UNKNOWN_PARKING_DIFFICULTY(0),
    EASY(1),
    MEDIUM(2),
    HARD(3);
    
    private final int e;

    dntm(int i) {
        this.e = i;
    }

    public static dntm b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EASY;
            }
            if (i == 2) {
                return MEDIUM;
            }
            if (i == 3) {
                return HARD;
            }
            return null;
        }
        return UNKNOWN_PARKING_DIFFICULTY;
    }

    public static dsrd c() {
        return dntl.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
