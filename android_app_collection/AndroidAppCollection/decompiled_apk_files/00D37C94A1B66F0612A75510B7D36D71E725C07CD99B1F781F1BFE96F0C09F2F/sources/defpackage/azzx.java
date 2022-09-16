package defpackage;
/* compiled from: PG */
/* renamed from: azzx  reason: default package */
/* loaded from: classes2.dex */
public enum azzx implements aopm {
    PEER_DISTANCE_UNKNOWN(0),
    PEER_DISTANCE_IN_PROCESS(1),
    PEER_DISTANCE_INTER_PROCESS(2);
    
    public final int d;

    azzx(int i) {
        this.d = i;
    }

    public static aopo a() {
        return axce.o;
    }

    public static azzx b(int i) {
        if (i != 0) {
            if (i == 1) {
                return PEER_DISTANCE_IN_PROCESS;
            }
            if (i == 2) {
                return PEER_DISTANCE_INTER_PROCESS;
            }
            return null;
        }
        return PEER_DISTANCE_UNKNOWN;
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
