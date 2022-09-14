package defpackage;
/* compiled from: PG */
/* renamed from: dfsv  reason: default package */
/* loaded from: classes6.dex */
public final class dfsv extends dsqw<dfsv, dfsu> implements dssk {
    public static final dfsv d;
    private static volatile dssr<dfsv> e;
    public int a;
    public dhjz b;
    public dhjz c;

    static {
        dfsv dfsvVar = new dfsv();
        d = dfsvVar;
        dsqw.cc(dfsv.class, dfsvVar);
    }

    private dfsv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfsv();
            }
            if (i2 == 4) {
                return new dfsu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfsv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfsv.class) {
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
