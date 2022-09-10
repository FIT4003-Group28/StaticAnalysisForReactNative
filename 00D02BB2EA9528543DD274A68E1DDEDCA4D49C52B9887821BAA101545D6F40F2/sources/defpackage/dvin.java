package defpackage;
/* compiled from: PG */
/* renamed from: dvin  reason: default package */
/* loaded from: classes.dex */
public final class dvin extends dsqw<dvin, dvim> implements dssk {
    public static final dvin e;
    private static volatile dssr<dvin> f;
    public int a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        dvin dvinVar = new dvin();
        e = dvinVar;
        dsqw.cc(dvin.class, dvinVar);
    }

    private dvin() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvin();
            }
            if (i2 == 4) {
                return new dvim();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvin> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvin.class) {
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
