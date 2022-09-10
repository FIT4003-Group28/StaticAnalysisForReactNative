package defpackage;
/* compiled from: PG */
/* renamed from: djai  reason: default package */
/* loaded from: classes.dex */
public final class djai extends dsqw<djai, djah> implements dssk {
    public static final djai g;
    private static volatile dssr<djai> h;
    public int a;
    public int c;
    public dqcu f;
    public dsrj<djao> b = dssu.b;
    public String d = "";
    public dsrj<dqcq> e = dssu.b;

    static {
        djai djaiVar = new djai();
        g = djaiVar;
        dsqw.cc(djai.class, djaiVar);
    }

    private djai() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u001b\u0002င\u0000\u0003ဈ\u0001\u0004\u001b\u0007ဉ\u0004", new Object[]{"a", "b", djao.class, "c", "d", "e", dqcq.class, "f"});
            }
            if (i2 == 3) {
                return new djai();
            }
            if (i2 == 4) {
                return new djah();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djai> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djai.class) {
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
