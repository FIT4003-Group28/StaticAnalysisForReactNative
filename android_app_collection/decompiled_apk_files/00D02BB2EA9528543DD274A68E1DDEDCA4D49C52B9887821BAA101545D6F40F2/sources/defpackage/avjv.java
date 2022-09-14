package defpackage;
/* compiled from: PG */
/* renamed from: avjv  reason: default package */
/* loaded from: classes3.dex */
public enum avjv implements dsrb {
    UNKNOWN_SCREEN_CHECK(0),
    NO_SCREEN_CHECK(1),
    REQUIRE_SCREEN_OFF(2);
    
    public final int d;

    avjv(int i) {
        this.d = i;
    }

    public static avjv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NO_SCREEN_CHECK;
            }
            if (i == 2) {
                return REQUIRE_SCREEN_OFF;
            }
            return null;
        }
        return UNKNOWN_SCREEN_CHECK;
    }

    public static dsrd c() {
        return avju.a;
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
