package defpackage;
/* compiled from: PG */
/* renamed from: dprr  reason: default package */
/* loaded from: classes6.dex */
public final class dprr extends dsqw<dprr, dprp> implements dssk {
    public static final dprr c;
    private static volatile dssr<dprr> d;
    public int a;
    public int b;

    static {
        dprr dprrVar = new dprr();
        c = dprrVar;
        dsqw.cc(dprr.class, dprrVar);
    }

    private dprr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0002", new Object[]{"a", "b", dprq.a});
            }
            if (i2 == 3) {
                return new dprr();
            }
            if (i2 == 4) {
                return new dprp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dprr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dprr.class) {
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
