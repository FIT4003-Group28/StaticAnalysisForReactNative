package defpackage;
/* compiled from: PG */
/* renamed from: dtwc  reason: default package */
/* loaded from: classes6.dex */
public final class dtwc extends dsqw<dtwc, dtwb> implements dssk {
    public static final dtwc c;
    private static volatile dssr<dtwc> d;
    public dttz a;
    public dtvy b;

    static {
        dtwc dtwcVar = new dtwc();
        c = dtwcVar;
        dsqw.cc(dtwc.class, dtwcVar);
    }

    private dtwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtwc();
            }
            if (i2 == 4) {
                return new dtwb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtwc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtwc.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
