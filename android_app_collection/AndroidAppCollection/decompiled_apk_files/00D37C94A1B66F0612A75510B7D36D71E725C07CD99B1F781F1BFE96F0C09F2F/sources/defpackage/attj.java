package defpackage;
/* compiled from: PG */
/* renamed from: attj  reason: default package */
/* loaded from: classes2.dex */
public enum attj implements aopm {
    OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN(0),
    OFFLINEABILITY_AVAILABILITY_TYPE_FREE(1),
    OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED(2),
    OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_UNLOCKED(3);
    
    public final int e;

    attj(int i) {
        this.e = i;
    }

    public static aopo a() {
        return atti.a;
    }

    public static attj b(int i) {
        if (i != 0) {
            if (i == 1) {
                return OFFLINEABILITY_AVAILABILITY_TYPE_FREE;
            }
            if (i == 2) {
                return OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED;
            }
            if (i == 3) {
                return OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_UNLOCKED;
            }
            return null;
        }
        return OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
