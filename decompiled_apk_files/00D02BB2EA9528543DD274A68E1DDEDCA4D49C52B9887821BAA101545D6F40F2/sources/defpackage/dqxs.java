package defpackage;
/* compiled from: PG */
/* renamed from: dqxs  reason: default package */
/* loaded from: classes6.dex */
public final class dqxs extends dsqw<dqxs, dqxr> implements dssk {
    public static final dqxs g;
    private static volatile dssr<dqxs> h;
    public int a;
    public dnpq b;
    public dqxc c;
    public dqxo d;
    public String e = "";
    public String f = "";

    static {
        dqxs dqxsVar = new dqxs();
        g = dqxsVar;
        dsqw.cc(dqxs.class, dqxsVar);
    }

    private dqxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dqxs();
            }
            if (i2 == 4) {
                return new dqxr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqxs.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
