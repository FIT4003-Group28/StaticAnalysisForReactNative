package defpackage;
/* compiled from: PG */
/* renamed from: dpmf  reason: default package */
/* loaded from: classes.dex */
public final class dpmf extends dsqw<dpmf, dpme> implements dssk {
    public static final dpmf b;
    private static volatile dssr<dpmf> c;
    public dsrj<dpmd> a = dssu.b;

    static {
        dpmf dpmfVar = new dpmf();
        b = dpmfVar;
        dsqw.cc(dpmf.class, dpmfVar);
    }

    private dpmf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpmd.class});
            }
            if (i2 == 3) {
                return new dpmf();
            }
            if (i2 == 4) {
                return new dpme();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpmf.class) {
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
