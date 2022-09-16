package defpackage;
/* compiled from: PG */
/* renamed from: baau  reason: default package */
/* loaded from: classes2.dex */
public enum baau implements aopm {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    
    private static final aopn f = new anfn(6);
    private final int h;

    baau(int i) {
        this.h = i;
    }

    public static aopo a() {
        return baat.a;
    }

    public static baau b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PRIMES_INITIALIZED;
            }
            if (i == 2) {
                return PRIMES_CRASH_MONITORING_INITIALIZED;
            }
            if (i == 3) {
                return PRIMES_FIRST_ACTIVITY_LAUNCHED;
            }
            if (i == 4) {
                return PRIMES_CUSTOM_LAUNCHED;
            }
            return null;
        }
        return UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
