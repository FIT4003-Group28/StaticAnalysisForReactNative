package defpackage;
/* compiled from: PG */
/* renamed from: dmyp  reason: default package */
/* loaded from: classes.dex */
public final class dmyp extends dsqw<dmyp, dmym> implements dssk {
    public static final dmyp d;
    private static volatile dssr<dmyp> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dmyp dmypVar = new dmyp();
        d = dmypVar;
        dsqw.cc(dmyp.class, dmypVar);
    }

    private dmyp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dmyo.c(), "c"});
            }
            if (i2 == 3) {
                return new dmyp();
            }
            if (i2 == 4) {
                return new dmym();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmyp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmyp.class) {
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
