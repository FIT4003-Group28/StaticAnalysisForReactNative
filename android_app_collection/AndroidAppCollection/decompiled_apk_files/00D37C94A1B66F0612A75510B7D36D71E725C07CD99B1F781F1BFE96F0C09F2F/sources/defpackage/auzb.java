package defpackage;
/* compiled from: PG */
/* renamed from: auzb  reason: default package */
/* loaded from: classes2.dex */
public enum auzb implements aopm {
    STARTUP_SIGNAL_UNKNOWN(0),
    STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED(1),
    STARTUP_SIGNAL_BROWSE_FEED_LOADED(2),
    STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED(3);
    
    private final int f;

    auzb(int i) {
        this.f = i;
    }

    public static aopo a() {
        return auwh.i;
    }

    public static auzb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED;
            }
            if (i == 2) {
                return STARTUP_SIGNAL_BROWSE_FEED_LOADED;
            }
            if (i == 3) {
                return STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED;
            }
            return null;
        }
        return STARTUP_SIGNAL_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
