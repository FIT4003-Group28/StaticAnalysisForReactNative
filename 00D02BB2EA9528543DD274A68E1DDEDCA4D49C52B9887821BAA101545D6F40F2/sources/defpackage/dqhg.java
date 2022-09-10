package defpackage;
/* compiled from: PG */
/* renamed from: dqhg  reason: default package */
/* loaded from: classes6.dex */
public final class dqhg extends dsqw<dqhg, dqhe> implements dssk {
    public static final dqhg g;
    private static volatile dssr<dqhg> h;
    public int a;
    public Object c;
    public boolean f;
    public int b = 0;
    public String d = "";
    public String e = "";

    static {
        dqhg dqhgVar = new dqhg();
        g = dqhgVar;
        dsqw.cc(dqhg.class, dqhgVar);
    }

    private dqhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ဈ\u0000\u0005ဇ\u0005\u0006ဈ\u0004", new Object[]{"c", "b", "a", drrp.class, "d", "f", "e"});
            }
            if (i2 == 3) {
                return new dqhg();
            }
            if (i2 == 4) {
                return new dqhe();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqhg.class) {
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
