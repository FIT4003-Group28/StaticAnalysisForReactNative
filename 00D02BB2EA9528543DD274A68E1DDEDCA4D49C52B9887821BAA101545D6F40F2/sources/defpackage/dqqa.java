package defpackage;
/* compiled from: PG */
/* renamed from: dqqa  reason: default package */
/* loaded from: classes.dex */
public final class dqqa extends dsqw<dqqa, dqpk> implements dssk {
    public static final dqqa g;
    private static volatile dssr<dqqa> h;
    public int a;
    public dssd<String, dqpy> d = dssd.b;
    public dsrj<dqpm> b = dssu.b;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        dqqa dqqaVar = new dqqa();
        g = dqqaVar;
        dsqw.cc(dqqa.class, dqqaVar);
    }

    private dqqa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u00032\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{"a", "b", dqpm.class, "c", "d", dqpz.a, "e", "f"});
            }
            if (i2 == 3) {
                return new dqqa();
            }
            if (i2 == 4) {
                return new dqpk();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqa> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqqa.class) {
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
