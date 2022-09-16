package defpackage;
/* compiled from: PG */
/* renamed from: apgc  reason: default package */
/* loaded from: classes.dex */
public enum apgc implements aopm {
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN(0),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_USE_VIDEO_ID_IN_DATA_SOURCE(2),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_HANDLE_RESPONSE_STALENESS(3),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_PREWARM_FROM_PLAYERLIB(4),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER(5),
    ANDROID_ONESIE_HOT_CONFIG_FEATURES_ENCRYPT_FROM_PREPARER(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    apgc(int i) {
        this.i = i;
    }

    public static aopo a() {
        return apfa.j;
    }

    public static apgc b(int i) {
        if (i != 0) {
            if (i == 2) {
                return ANDROID_ONESIE_HOT_CONFIG_FEATURES_USE_VIDEO_ID_IN_DATA_SOURCE;
            }
            if (i == 3) {
                return ANDROID_ONESIE_HOT_CONFIG_FEATURES_HANDLE_RESPONSE_STALENESS;
            }
            if (i == 4) {
                return ANDROID_ONESIE_HOT_CONFIG_FEATURES_PREWARM_FROM_PLAYERLIB;
            }
            if (i == 5) {
                return ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER;
            }
            if (i == 6) {
                return ANDROID_ONESIE_HOT_CONFIG_FEATURES_ENCRYPT_FROM_PREPARER;
            }
            return null;
        }
        return ANDROID_ONESIE_HOT_CONFIG_FEATURES_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
