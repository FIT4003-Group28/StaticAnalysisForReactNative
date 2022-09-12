package defpackage;
/* compiled from: PG */
/* renamed from: dmhr  reason: default package */
/* loaded from: classes6.dex */
public final class dmhr extends dsqw<dmhr, dmhq> implements dssk {
    public static final dmhr b;
    public static final dsqv<dmfs, dmhr> c;
    private static volatile dssr<dmhr> e;
    public drdg a;
    private int d;

    static {
        dmhr dmhrVar = new dmhr();
        b = dmhrVar;
        dsqw.cc(dmhr.class, dmhrVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmhrVar, dmhrVar, null, 1015, dsur.MESSAGE, dmhr.class);
    }

    private dmhr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmhr();
            }
            if (i2 == 4) {
                return new dmhq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmhr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
