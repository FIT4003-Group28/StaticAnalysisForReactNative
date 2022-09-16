package defpackage;
/* compiled from: PG */
/* renamed from: aspv  reason: default package */
/* loaded from: classes2.dex */
public enum aspv implements aopm {
    STARTUP_SIGNAL_ERROR_UNKNOWN(0),
    STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT(1),
    STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT(2),
    STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT(3);
    
    public final int e;

    aspv(int i) {
        this.e = i;
    }

    public static aopo a() {
        return asnz.g;
    }

    public static aspv b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STARTUP_SIGNAL_ERROR_FIRST_THUMBNAIL_TIMEOUT;
            }
            if (i == 2) {
                return STARTUP_SIGNAL_ERROR_BROWSE_FEED_TIMEOUT;
            }
            if (i == 3) {
                return STARTUP_SIGNAL_ERROR_AFTER_ONRESUME_TIMEOUT;
            }
            return null;
        }
        return STARTUP_SIGNAL_ERROR_UNKNOWN;
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
