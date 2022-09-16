package defpackage;
/* compiled from: PG */
/* renamed from: dvll  reason: default package */
/* loaded from: classes.dex */
public enum dvll implements dsrb {
    UNKNOWN_NOTIFICATION_TYPE(0),
    SERVER_TRIGGERED_SLF(3),
    CLIENT_TRIGGERED_REGULAR(1),
    CLIENT_TRIGGERED_DELAYED(2);
    
    private final int e;

    dvll(int i) {
        this.e = i;
    }

    public static dvll b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CLIENT_TRIGGERED_REGULAR;
            }
            if (i == 2) {
                return CLIENT_TRIGGERED_DELAYED;
            }
            if (i == 3) {
                return SERVER_TRIGGERED_SLF;
            }
            return null;
        }
        return UNKNOWN_NOTIFICATION_TYPE;
    }

    public static dsrd c() {
        return dvlk.a;
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
