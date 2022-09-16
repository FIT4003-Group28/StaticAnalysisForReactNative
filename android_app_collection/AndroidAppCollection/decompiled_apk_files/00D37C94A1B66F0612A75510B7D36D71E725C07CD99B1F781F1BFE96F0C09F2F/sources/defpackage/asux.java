package defpackage;
/* compiled from: PG */
/* renamed from: asux  reason: default package */
/* loaded from: classes2.dex */
public enum asux implements aopm {
    LIVESTREAM_CONNECTION_STATE_UNKNOWN(0),
    LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED(1),
    LIVESTREAM_CONNECTION_STATE_DISCONNECTED(2),
    LIVESTREAM_CONNECTION_STATE_RECONNECTING(3),
    LIVESTREAM_CONNECTION_STATE_ACTIVE(4);
    
    public final int f;

    asux(int i) {
        this.f = i;
    }

    public static aopo a() {
        return asut.d;
    }

    public static asux b(int i) {
        if (i != 0) {
            if (i == 1) {
                return LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED;
            }
            if (i == 2) {
                return LIVESTREAM_CONNECTION_STATE_DISCONNECTED;
            }
            if (i == 3) {
                return LIVESTREAM_CONNECTION_STATE_RECONNECTING;
            }
            if (i == 4) {
                return LIVESTREAM_CONNECTION_STATE_ACTIVE;
            }
            return null;
        }
        return LIVESTREAM_CONNECTION_STATE_UNKNOWN;
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
