package defpackage;
/* compiled from: PG */
/* renamed from: dpyt  reason: default package */
/* loaded from: classes6.dex */
public final class dpyt extends dsqw<dpyt, dpys> implements dssk {
    public static final dpyt c;
    private static volatile dssr<dpyt> d;
    public int a;
    public String b = "";

    static {
        dpyt dpytVar = new dpyt();
        c = dpytVar;
        dsqw.cc(dpyt.class, dpytVar);
    }

    private dpyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dpyt();
            }
            if (i2 == 4) {
                return new dpys();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpyt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpyt.class) {
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
