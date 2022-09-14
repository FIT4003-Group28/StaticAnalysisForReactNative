package defpackage;
/* compiled from: PG */
/* renamed from: drlf  reason: default package */
/* loaded from: classes6.dex */
public enum drlf implements dsrb {
    UNKNOWN_TRAFFIC_ACCESS(0),
    ONE_WAY_FORWARD(1),
    ONE_WAY_REVERSE(3),
    TWO_WAY(2);
    
    public final int e;

    drlf(int i) {
        this.e = i;
    }

    public static drlf b(int i) {
        if (i != 0) {
            if (i == 1) {
                return ONE_WAY_FORWARD;
            }
            if (i == 2) {
                return TWO_WAY;
            }
            if (i == 3) {
                return ONE_WAY_REVERSE;
            }
            return null;
        }
        return UNKNOWN_TRAFFIC_ACCESS;
    }

    public static dsrd c() {
        return drle.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
