package defpackage;
/* compiled from: PG */
/* renamed from: dqtz  reason: default package */
/* loaded from: classes6.dex */
public enum dqtz implements dsrb {
    UNKNOWN_FARE(0),
    NORMAL_FARE(1),
    IC_FARE(2);
    
    public final int d;

    dqtz(int i) {
        this.d = i;
    }

    public static dqtz b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NORMAL_FARE;
            }
            if (i == 2) {
                return IC_FARE;
            }
            return null;
        }
        return UNKNOWN_FARE;
    }

    public static dsrd c() {
        return dqty.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
