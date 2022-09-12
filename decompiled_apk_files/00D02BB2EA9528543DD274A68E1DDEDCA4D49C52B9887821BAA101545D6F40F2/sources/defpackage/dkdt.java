package defpackage;
/* compiled from: PG */
/* renamed from: dkdt  reason: default package */
/* loaded from: classes6.dex */
public enum dkdt implements dsrb {
    UNKNOWN_REASON(0),
    RECOMMENDED(1),
    PAST_BOOKINGS(2),
    NEWLY_BOOKABLE(3),
    DEAL(4);
    
    private final int f;

    dkdt(int i) {
        this.f = i;
    }

    public static dkdt b(int i) {
        if (i != 0) {
            if (i == 1) {
                return RECOMMENDED;
            }
            if (i == 2) {
                return PAST_BOOKINGS;
            }
            if (i == 3) {
                return NEWLY_BOOKABLE;
            }
            if (i == 4) {
                return DEAL;
            }
            return null;
        }
        return UNKNOWN_REASON;
    }

    public static dsrd c() {
        return dkds.a;
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
