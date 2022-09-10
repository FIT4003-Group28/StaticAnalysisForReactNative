package defpackage;
/* compiled from: PG */
/* renamed from: byqj  reason: default package */
/* loaded from: classes4.dex */
public final class byqj extends dsqw<byqj, byqi> implements dssk {
    public static final byqj f;
    private static volatile dssr<byqj> g;
    public int a;
    public long b;
    public dspd c = dspd.b;
    public String d = "";
    public long e;

    static {
        byqj byqjVar = new byqj();
        f = byqjVar;
        dsqw.cc(byqj.class, byqjVar);
    }

    private byqj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new byqj();
            }
            if (i2 == 4) {
                return new byqi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<byqj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (byqj.class) {
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
