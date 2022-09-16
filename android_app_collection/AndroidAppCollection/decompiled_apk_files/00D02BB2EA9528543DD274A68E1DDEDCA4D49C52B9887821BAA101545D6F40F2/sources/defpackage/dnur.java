package defpackage;
/* compiled from: PG */
/* renamed from: dnur  reason: default package */
/* loaded from: classes6.dex */
public final class dnur extends dsqw<dnur, dnum> implements dssk {
    public static final dnur b;
    private static volatile dssr<dnur> d;
    private byte c = 2;
    public dsrj<dnuq> a = dssu.b;

    static {
        dnur dnurVar = new dnur();
        b = dnurVar;
        dsqw.cc(dnur.class, dnurVar);
    }

    private dnur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", dnuq.class});
            }
            if (i2 == 3) {
                return new dnur();
            }
            if (i2 == 4) {
                return new dnum();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dnur> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnur.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
