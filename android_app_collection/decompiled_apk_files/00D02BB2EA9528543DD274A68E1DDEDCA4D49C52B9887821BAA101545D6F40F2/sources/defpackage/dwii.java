package defpackage;
/* compiled from: PG */
/* renamed from: dwii  reason: default package */
/* loaded from: classes6.dex */
public enum dwii implements dsrb {
    UNKNOWN(0),
    CONTACT(1),
    FLIGHT(2),
    RESERVATION(3);
    
    private final int e;

    dwii(int i) {
        this.e = i;
    }

    public static dwii b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CONTACT;
            }
            if (i == 2) {
                return FLIGHT;
            }
            if (i == 3) {
                return RESERVATION;
            }
            return null;
        }
        return UNKNOWN;
    }

    public static dsrd c() {
        return dwih.a;
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
