package defpackage;
/* compiled from: PG */
/* renamed from: dujg  reason: default package */
/* loaded from: classes6.dex */
public final class dujg extends dsqw<dujg, dujf> implements dssk {
    public static final dujg d;
    private static volatile dssr<dujg> f;
    public boolean a;
    public int b;
    public String c = "";
    private int e;

    static {
        dujg dujgVar = new dujg();
        d = dujgVar;
        dsqw.cc(dujg.class, dujgVar);
    }

    private dujg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dujg();
            }
            if (i2 == 4) {
                return new dujf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dujg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dujg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
