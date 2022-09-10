package defpackage;
/* compiled from: PG */
/* renamed from: dnrw  reason: default package */
/* loaded from: classes6.dex */
public final class dnrw extends dsqw<dnrw, dnqr> implements dssk {
    public static final dnrw c;
    private static volatile dssr<dnrw> d;
    public int a = 0;
    public Object b;

    static {
        dnrw dnrwVar = new dnrw();
        c = dnrwVar;
        dsqw.cc(dnrw.class, dnrwVar);
    }

    private dnrw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000", new Object[]{"b", "a", dnrp.class, dnqx.class, dnrj.class, dnqz.class, dnrn.class, dnrb.class, dnqt.class, dnrf.class, dnqv.class, dnrh.class, dnrt.class, dnrl.class, dnrr.class});
            }
            if (i2 == 3) {
                return new dnrw();
            }
            if (i2 == 4) {
                return new dnqr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnrw.class) {
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
