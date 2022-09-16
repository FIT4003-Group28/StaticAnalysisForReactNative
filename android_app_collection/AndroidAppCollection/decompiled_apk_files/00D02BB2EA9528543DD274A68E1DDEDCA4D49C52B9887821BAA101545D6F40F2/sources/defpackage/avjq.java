package defpackage;
/* compiled from: PG */
/* renamed from: avjq  reason: default package */
/* loaded from: classes3.dex */
public enum avjq implements dsrb {
    UNKNOWN_BATTERY_CHECK(0),
    REQUIRE_CHARGER(2),
    RELAXED_BATTERY_CHECK(3);
    
    public final int d;

    avjq(int i) {
        this.d = i;
    }

    public static avjq b(int i) {
        if (i != 0) {
            if (i == 2) {
                return REQUIRE_CHARGER;
            }
            if (i == 3) {
                return RELAXED_BATTERY_CHECK;
            }
            return null;
        }
        return UNKNOWN_BATTERY_CHECK;
    }

    public static dsrd c() {
        return avjp.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
