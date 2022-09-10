package defpackage;
/* compiled from: PG */
/* renamed from: drcg  reason: default package */
/* loaded from: classes.dex */
public final class drcg extends dsqw<drcg, drcf> implements dssk {
    public static final drcg e;
    private static volatile dssr<drcg> f;
    public int a;
    public int b;
    public boolean c;
    public int d;

    static {
        drcg drcgVar = new drcg();
        e = drcgVar;
        dsqw.cc(drcg.class, drcgVar);
    }

    private drcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", dgge.c(), "c", "d", dggc.c()});
            }
            if (i2 == 3) {
                return new drcg();
            }
            if (i2 == 4) {
                return new drcf();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drcg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drcg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
