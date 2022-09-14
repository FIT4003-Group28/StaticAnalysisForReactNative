package defpackage;
/* compiled from: PG */
/* renamed from: dskp  reason: default package */
/* loaded from: classes6.dex */
public enum dskp implements dsrb {
    PROMOTABILITY_UNKNOWN(0),
    CAN_ASK_FOR_CONSENT(1),
    ALREADY_CONSENTED(2),
    CANNOT_CONSENT(3),
    CONSENT_DEPRECATED(4);
    
    public final int f;

    dskp(int i) {
        this.f = i;
    }

    public static dskp b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CAN_ASK_FOR_CONSENT;
            }
            if (i == 2) {
                return ALREADY_CONSENTED;
            }
            if (i == 3) {
                return CANNOT_CONSENT;
            }
            if (i == 4) {
                return CONSENT_DEPRECATED;
            }
            return null;
        }
        return PROMOTABILITY_UNKNOWN;
    }

    public static dsrd c() {
        return dsko.a;
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
