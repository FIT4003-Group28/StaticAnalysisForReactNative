package defpackage;
/* compiled from: PG */
/* renamed from: dqwx  reason: default package */
/* loaded from: classes6.dex */
public enum dqwx implements dsrb {
    UNKNOWN_TRIP_TYPE(0),
    SOLO(1),
    BUSINESS(2),
    FAMILY(3),
    COUPLE(4),
    FRIENDS(5),
    VACATION(7);
    
    public final int h;

    dqwx(int i2) {
        this.h = i2;
    }

    public static dqwx b(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return SOLO;
            }
            if (i2 == 2) {
                return BUSINESS;
            }
            if (i2 == 3) {
                return FAMILY;
            }
            if (i2 == 4) {
                return COUPLE;
            }
            if (i2 == 5) {
                return FRIENDS;
            }
            if (i2 == 7) {
                return VACATION;
            }
            return null;
        }
        return UNKNOWN_TRIP_TYPE;
    }

    public static dsrd c() {
        return dqww.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
