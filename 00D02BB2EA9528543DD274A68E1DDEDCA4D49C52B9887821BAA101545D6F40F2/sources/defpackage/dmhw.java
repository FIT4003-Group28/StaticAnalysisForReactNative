package defpackage;
/* compiled from: PG */
/* renamed from: dmhw  reason: default package */
/* loaded from: classes6.dex */
public final class dmhw extends dsqw<dmhw, dmhv> implements dssk {
    public static final dmhw b;
    public static final dsqv<dmfs, dmhw> c;
    private static volatile dssr<dmhw> e;
    public long a;
    private int d;

    static {
        dmhw dmhwVar = new dmhw();
        b = dmhwVar;
        dsqw.cc(dmhw.class, dmhwVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmhwVar, dmhwVar, null, 1023, dsur.MESSAGE, dmhw.class);
    }

    private dmhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmhw();
            }
            if (i2 == 4) {
                return new dmhv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmhw.class) {
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
