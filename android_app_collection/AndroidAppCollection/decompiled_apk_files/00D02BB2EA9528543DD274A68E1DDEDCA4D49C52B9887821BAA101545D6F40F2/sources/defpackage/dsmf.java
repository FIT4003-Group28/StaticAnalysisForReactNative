package defpackage;
/* compiled from: PG */
/* renamed from: dsmf  reason: default package */
/* loaded from: classes6.dex */
public enum dsmf implements dsrb {
    UNKNOWN_REQUEST_REASON(0),
    PERIODIC_SYNC(1),
    FLAG_CHANGE(2),
    ACCOUNT_CHANGE(3),
    DEVICE_BOOT(4),
    APP_UPDATE(5),
    PUSH_MESSAGE(6),
    PUSH_REGISTRATION(7),
    FORCED_SYNC(8),
    EMPTY_CACHE(9),
    INITIALIZATION_SYNC(10);
    
    public final int l;

    dsmf(int i) {
        this.l = i;
    }

    public static dsmf b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_REASON;
            case 1:
                return PERIODIC_SYNC;
            case 2:
                return FLAG_CHANGE;
            case 3:
                return ACCOUNT_CHANGE;
            case 4:
                return DEVICE_BOOT;
            case 5:
                return APP_UPDATE;
            case 6:
                return PUSH_MESSAGE;
            case 7:
                return PUSH_REGISTRATION;
            case 8:
                return FORCED_SYNC;
            case 9:
                return EMPTY_CACHE;
            case 10:
                return INITIALIZATION_SYNC;
            default:
                return null;
        }
    }

    public static dsrd c() {
        return dsme.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
