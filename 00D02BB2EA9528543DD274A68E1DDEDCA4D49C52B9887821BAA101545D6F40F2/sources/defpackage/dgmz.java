package defpackage;
/* compiled from: PG */
/* renamed from: dgmz  reason: default package */
/* loaded from: classes6.dex */
public final class dgmz extends dsqw<dgmz, dgmy> implements dssk {
    public static final dgmz f;
    private static volatile dssr<dgmz> g;
    public int a;
    public String b = "";
    public dnqe c;
    public boolean d;
    public int e;

    static {
        dgmz dgmzVar = new dgmz();
        f = dgmzVar;
        dsqw.cc(dgmz.class, dgmzVar);
    }

    private dgmz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဇ\u0002", new Object[]{"a", "b", "c", "e", dobl.a, "d"});
            }
            if (i2 == 3) {
                return new dgmz();
            }
            if (i2 == 4) {
                return new dgmy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgmz.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
