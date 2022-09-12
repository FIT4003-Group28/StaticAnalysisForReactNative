package defpackage;
/* compiled from: PG */
/* renamed from: aqxj  reason: default package */
/* loaded from: classes2.dex */
public enum aqxj implements dsrb {
    STATE_UNSPECIFIED(0),
    UNREGISTERED(1),
    ENABLED(2),
    DISABLED(3),
    UNSUPPORTED(4),
    TEMPORARILY_UNAVAILABLE(5),
    UNRECOGNIZED(-1);
    
    private final int h;

    aqxj(int i2) {
        this.h = i2;
    }

    public static aqxj b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return UNREGISTERED;
            }
            if (i2 == 2) {
                return ENABLED;
            }
            if (i2 == 3) {
                return DISABLED;
            }
            if (i2 == 4) {
                return UNSUPPORTED;
            }
            if (i2 == 5) {
                return TEMPORARILY_UNAVAILABLE;
            }
            return null;
        }
        return STATE_UNSPECIFIED;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
