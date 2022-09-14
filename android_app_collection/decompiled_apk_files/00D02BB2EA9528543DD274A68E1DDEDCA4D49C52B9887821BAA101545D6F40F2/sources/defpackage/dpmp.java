package defpackage;
/* compiled from: PG */
/* renamed from: dpmp  reason: default package */
/* loaded from: classes6.dex */
public final class dpmp extends dsqw<dpmp, dpmo> implements dssk {
    public static final dpmp d;
    private static volatile dssr<dpmp> e;
    public int a;
    public dsrj<dpmn> b = dssu.b;
    public dpon c;

    static {
        dpmp dpmpVar = new dpmp();
        d = dpmpVar;
        dsqw.cc(dpmp.class, dpmpVar);
    }

    private dpmp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dpmn.class, "c"});
            }
            if (i2 == 3) {
                return new dpmp();
            }
            if (i2 == 4) {
                return new dpmo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpmp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpmp.class) {
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
