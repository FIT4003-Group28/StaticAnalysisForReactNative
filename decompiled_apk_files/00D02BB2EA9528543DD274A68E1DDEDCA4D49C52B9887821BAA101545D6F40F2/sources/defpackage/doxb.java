package defpackage;
/* compiled from: PG */
/* renamed from: doxb  reason: default package */
/* loaded from: classes6.dex */
public enum doxb implements dsrb {
    TYPE_UNKNOWN(0),
    TYPE_TOLLS_YES(1),
    TYPE_TOLLS_NO(2),
    TYPE_TRAFFIC_CONGESTION_MORE(3),
    TYPE_TRAFFIC_CONGESTION_LESS(4);
    
    private final int f;

    doxb(int i) {
        this.f = i;
    }

    public static doxb b(int i) {
        if (i != 0) {
            if (i == 1) {
                return TYPE_TOLLS_YES;
            }
            if (i == 2) {
                return TYPE_TOLLS_NO;
            }
            if (i == 3) {
                return TYPE_TRAFFIC_CONGESTION_MORE;
            }
            if (i == 4) {
                return TYPE_TRAFFIC_CONGESTION_LESS;
            }
            return null;
        }
        return TYPE_UNKNOWN;
    }

    public static dsrd c() {
        return doxa.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
