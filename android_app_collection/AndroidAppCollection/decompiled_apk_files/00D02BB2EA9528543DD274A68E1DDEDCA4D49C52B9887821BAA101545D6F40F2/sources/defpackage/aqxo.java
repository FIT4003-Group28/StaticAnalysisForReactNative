package defpackage;
/* compiled from: PG */
/* renamed from: aqxo  reason: default package */
/* loaded from: classes2.dex */
public enum aqxo implements dsrb {
    STAGE_UNSPECIFIED(0),
    UNSET(1),
    PENDING_ACTIVATION(2),
    IN_PROBATION(3),
    ENABLED(4),
    UNRECOGNIZED(-1);
    
    private final int g;

    aqxo(int i) {
        this.g = i;
    }

    public static aqxo b(int i) {
        if (i != 0) {
            if (i == 1) {
                return UNSET;
            }
            if (i == 2) {
                return PENDING_ACTIVATION;
            }
            if (i == 3) {
                return IN_PROBATION;
            }
            if (i == 4) {
                return ENABLED;
            }
            return null;
        }
        return STAGE_UNSPECIFIED;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
