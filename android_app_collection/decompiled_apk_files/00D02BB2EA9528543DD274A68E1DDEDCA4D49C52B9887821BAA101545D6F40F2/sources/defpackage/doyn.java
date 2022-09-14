package defpackage;
/* compiled from: PG */
/* renamed from: doyn  reason: default package */
/* loaded from: classes6.dex */
public final class doyn extends dsqw<doyn, doyk> implements dssk {
    public static final doyn d;
    private static volatile dssr<doyn> e;
    public int a;
    public int b;
    public boolean c;

    static {
        doyn doynVar = new doyn();
        d = doynVar;
        dsqw.cc(doyn.class, doynVar);
    }

    private doyn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", doym.c(), "c"});
            }
            if (i2 == 3) {
                return new doyn();
            }
            if (i2 == 4) {
                return new doyk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doyn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doyn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
