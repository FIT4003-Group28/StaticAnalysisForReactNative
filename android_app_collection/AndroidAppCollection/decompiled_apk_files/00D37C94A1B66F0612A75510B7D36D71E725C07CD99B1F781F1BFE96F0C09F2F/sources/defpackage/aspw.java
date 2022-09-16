package defpackage;
/* compiled from: PG */
/* renamed from: aspw  reason: default package */
/* loaded from: classes2.dex */
public enum aspw implements aopm {
    STARTUP_SIGNAL_TYPE_UNKNOWN(0),
    STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED(1),
    STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED(2),
    STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED(3),
    STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED(4),
    STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED(5);
    
    public final int g;

    aspw(int i) {
        this.g = i;
    }

    public static aopo a() {
        return asnz.h;
    }

    public static aspw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_CREATED;
            }
            if (i == 2) {
                return STARTUP_SIGNAL_TYPE_SIGNAL_STREAM_STOPPED;
            }
            if (i == 3) {
                return STARTUP_SIGNAL_TYPE_FIRST_THUMBNAIL_LOADED;
            }
            if (i == 4) {
                return STARTUP_SIGNAL_TYPE_BROWSE_FEED_LOADED;
            }
            if (i == 5) {
                return STARTUP_SIGNAL_TYPE_AFTER_ONRESUME_LOADED;
            }
            return null;
        }
        return STARTUP_SIGNAL_TYPE_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
