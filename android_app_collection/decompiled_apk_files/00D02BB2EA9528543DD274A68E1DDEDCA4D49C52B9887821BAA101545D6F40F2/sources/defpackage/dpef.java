package defpackage;
/* compiled from: PG */
/* renamed from: dpef  reason: default package */
/* loaded from: classes6.dex */
public final class dpef extends dsqw<dpef, dpee> implements dssk {
    public static final dpef e;
    private static volatile dssr<dpef> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        dpef dpefVar = new dpef();
        e = dpefVar;
        dsqw.cc(dpef.class, dpefVar);
    }

    private dpef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpef();
            }
            if (i2 == 4) {
                return new dpee();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpef> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpef.class) {
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
