package defpackage;
/* compiled from: PG */
/* renamed from: dqam  reason: default package */
/* loaded from: classes6.dex */
public final class dqam extends dsqw<dqam, dqaf> implements dssk {
    public static final dqam g;
    private static volatile dssr<dqam> h;
    public int a;
    public int b = 0;
    public Object c;
    public dqah d;
    public boolean e;
    public dqas f;

    static {
        dqam dqamVar = new dqam();
        g = dqamVar;
        dsqw.cc(dqam.class, dqamVar);
    }

    private dqam() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဉ\u0005", new Object[]{"c", "b", "a", dqal.class, dqaj.class, "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dqam();
            }
            if (i2 == 4) {
                return new dqaf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqam> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqam.class) {
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
