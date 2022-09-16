package defpackage;
/* compiled from: PG */
/* renamed from: dgzy  reason: default package */
/* loaded from: classes6.dex */
public enum dgzy implements dsrb {
    MSG_UNSPECIFIED(0),
    MSG_VALID(1),
    MSG_INFERRED(2),
    MSG_CORRECTIONS(3),
    MSG_INCOMPLETE(4),
    MSG_INCONSISTENT_LOCATION(5),
    UNRECOGNIZED(-1);
    
    private final int h;

    dgzy(int i2) {
        this.h = i2;
    }

    public static dgzy b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return MSG_VALID;
            }
            if (i2 == 2) {
                return MSG_INFERRED;
            }
            if (i2 == 3) {
                return MSG_CORRECTIONS;
            }
            if (i2 == 4) {
                return MSG_INCOMPLETE;
            }
            if (i2 == 5) {
                return MSG_INCONSISTENT_LOCATION;
            }
            return null;
        }
        return MSG_UNSPECIFIED;
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
