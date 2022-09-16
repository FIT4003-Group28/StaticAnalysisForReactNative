package defpackage;
/* compiled from: PG */
/* renamed from: aouw  reason: default package */
/* loaded from: classes.dex */
public enum aouw implements aopm {
    ONESIE_REQUEST_TARGET_UNKNOWN(0),
    ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE(1),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE(2),
    ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO(3);
    
    public final int e;

    aouw(int i) {
        this.e = i;
    }

    public static aopo a() {
        return aotr.k;
    }

    public static aouw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE;
            }
            if (i == 2) {
                return ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE;
            }
            if (i == 3) {
                return ONESIE_REQUEST_TARGET_ENCRYPTED_WATCH_SERVICE_PHASE_TWO;
            }
            return null;
        }
        return ONESIE_REQUEST_TARGET_UNKNOWN;
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
