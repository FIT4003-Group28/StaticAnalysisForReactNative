package defpackage;
/* compiled from: PG */
/* renamed from: dqwa  reason: default package */
/* loaded from: classes.dex */
public final class dqwa extends dsqw<dqwa, dqvz> implements dssk {
    public static final dqwa g;
    private static volatile dssr<dqwa> h;
    public int a;
    public dqvy c;
    public dqwe d;
    public dsrj<dqvu> b = dssu.b;
    public String e = "";
    public String f = "";

    static {
        dqwa dqwaVar = new dqwa();
        g = dqwaVar;
        dsqw.cc(dqwa.class, dqwaVar);
    }

    private dqwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဈ\u0002\u0006ဈ\u0003", new Object[]{"a", "b", dqvu.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dqwa();
            }
            if (i2 == 4) {
                return new dqvz();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqwa.class) {
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
