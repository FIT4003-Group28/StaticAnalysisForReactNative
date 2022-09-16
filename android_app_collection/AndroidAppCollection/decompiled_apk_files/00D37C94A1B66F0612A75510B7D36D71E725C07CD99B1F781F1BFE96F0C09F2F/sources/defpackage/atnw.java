package defpackage;
/* compiled from: PG */
/* renamed from: atnw  reason: default package */
/* loaded from: classes2.dex */
public enum atnw implements aopm {
    EFFECTIVE_CONNECTION_TYPE_UNKNOWN(0),
    EFFECTIVE_CONNECTION_TYPE_OFFLINE(1),
    EFFECTIVE_CONNECTION_TYPE_SLOW_2G(2),
    EFFECTIVE_CONNECTION_TYPE_2G(3),
    EFFECTIVE_CONNECTION_TYPE_3G(4),
    EFFECTIVE_CONNECTION_TYPE_4G(5);
    
    public final int g;

    atnw(int i) {
        this.g = i;
    }

    public static aopo a() {
        return atdq.p;
    }

    public static atnw b(int i) {
        if (i != 0) {
            if (i == 1) {
                return EFFECTIVE_CONNECTION_TYPE_OFFLINE;
            }
            if (i == 2) {
                return EFFECTIVE_CONNECTION_TYPE_SLOW_2G;
            }
            if (i == 3) {
                return EFFECTIVE_CONNECTION_TYPE_2G;
            }
            if (i == 4) {
                return EFFECTIVE_CONNECTION_TYPE_3G;
            }
            if (i == 5) {
                return EFFECTIVE_CONNECTION_TYPE_4G;
            }
            return null;
        }
        return EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
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
