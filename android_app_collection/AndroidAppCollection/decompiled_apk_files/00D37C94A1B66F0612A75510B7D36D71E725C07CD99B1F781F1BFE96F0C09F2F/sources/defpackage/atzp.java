package defpackage;
/* compiled from: PG */
/* renamed from: atzp  reason: default package */
/* loaded from: classes2.dex */
public enum atzp implements aopm {
    UNKNOWN(0),
    OFF(1),
    ON(2),
    FORCED_ON(3),
    ON_WEAK(4),
    OFF_WEAK(5);
    
    private final int h;

    atzp(int i) {
        this.h = i;
    }

    public static aopo a() {
        return auca.b;
    }

    public static atzp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFF;
            }
            if (i == 2) {
                return ON;
            }
            if (i == 3) {
                return FORCED_ON;
            }
            if (i == 4) {
                return ON_WEAK;
            }
            if (i == 5) {
                return OFF_WEAK;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
