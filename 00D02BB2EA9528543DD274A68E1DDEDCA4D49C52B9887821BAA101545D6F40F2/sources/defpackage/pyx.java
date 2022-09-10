package defpackage;
/* compiled from: PG */
/* renamed from: pyx  reason: default package */
/* loaded from: classes7.dex */
public final class pyx extends dsqw<pyx, pyw> implements dssk {
    public static final pyx c;
    private static volatile dssr<pyx> d;
    public int a = 0;
    public Object b;

    static {
        pyx pyxVar = new pyx();
        c = pyxVar;
        dsqw.cc(pyx.class, pyxVar);
    }

    private pyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dpgh.class, dqtp.class});
            }
            if (i2 == 3) {
                return new pyx();
            }
            if (i2 == 4) {
                return new pyw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<pyx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (pyx.class) {
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
