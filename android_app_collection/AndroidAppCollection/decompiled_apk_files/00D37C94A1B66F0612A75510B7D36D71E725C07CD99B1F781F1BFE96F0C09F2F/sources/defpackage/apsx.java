package defpackage;
/* compiled from: PG */
/* renamed from: apsx  reason: default package */
/* loaded from: classes2.dex */
public enum apsx implements aopm {
    CHANNEL_STATUS_UNKNOWN(0),
    CHANNEL_STATUS_UNREAD(1),
    CHANNEL_STATUS_LIVE(2);
    
    public final int d;

    apsx(int i) {
        this.d = i;
    }

    public static aopo a() {
        return apog.r;
    }

    public static apsx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return CHANNEL_STATUS_UNREAD;
            }
            if (i == 2) {
                return CHANNEL_STATUS_LIVE;
            }
            return null;
        }
        return CHANNEL_STATUS_UNKNOWN;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
