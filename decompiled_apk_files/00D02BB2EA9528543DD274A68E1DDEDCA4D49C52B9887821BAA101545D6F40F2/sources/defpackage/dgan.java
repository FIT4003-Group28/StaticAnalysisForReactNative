package defpackage;
/* compiled from: PG */
/* renamed from: dgan  reason: default package */
/* loaded from: classes6.dex */
public enum dgan implements dsrb {
    STAGE_UNSPECIFIED(0),
    UNSET(1),
    PENDING_ACTIVATION(2),
    IN_PROBATION(3),
    ENABLED(4);
    
    public final int f;

    dgan(int i) {
        this.f = i;
    }

    public static dgan b(int i) {
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

    public static dsrd c() {
        return dgam.a;
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
