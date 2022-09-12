package defpackage;
/* compiled from: PG */
/* renamed from: dpno  reason: default package */
/* loaded from: classes6.dex */
public final class dpno extends dsqw<dpno, dpnh> implements dssk {
    public static final dpno b;
    private static volatile dssr<dpno> c;
    public dsrj<dpnn> a = dssu.b;

    static {
        dpno dpnoVar = new dpno();
        b = dpnoVar;
        dsqw.cc(dpno.class, dpnoVar);
    }

    private dpno() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpnn.class});
            }
            if (i2 == 3) {
                return new dpno();
            }
            if (i2 == 4) {
                return new dpnh();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpno> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpno.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
