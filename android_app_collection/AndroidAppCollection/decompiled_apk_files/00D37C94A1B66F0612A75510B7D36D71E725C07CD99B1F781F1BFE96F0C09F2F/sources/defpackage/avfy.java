package defpackage;
/* compiled from: PG */
/* renamed from: avfy  reason: default package */
/* loaded from: classes2.dex */
public enum avfy implements aopm {
    SCREEN_UNKNOWN(0),
    SCREEN_HOME_FEED(1);
    
    private final int d;

    avfy(int i) {
        this.d = i;
    }

    public static aopo a() {
        return avcd.u;
    }

    public static avfy b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SCREEN_HOME_FEED;
            }
            return null;
        }
        return SCREEN_UNKNOWN;
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
