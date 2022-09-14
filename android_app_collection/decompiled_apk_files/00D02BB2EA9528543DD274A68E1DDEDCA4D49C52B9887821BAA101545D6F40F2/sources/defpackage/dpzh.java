package defpackage;
/* compiled from: PG */
/* renamed from: dpzh  reason: default package */
/* loaded from: classes6.dex */
public enum dpzh implements dsrb {
    UNKNOWN_PARKING_PRESENCE(0),
    NONE(1),
    HAS_PARKING(2);
    
    private final int d;

    dpzh(int i) {
        this.d = i;
    }

    public static dpzh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NONE;
            }
            if (i == 2) {
                return HAS_PARKING;
            }
            return null;
        }
        return UNKNOWN_PARKING_PRESENCE;
    }

    public static dsrd c() {
        return dpzg.a;
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
