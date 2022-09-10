package defpackage;
/* compiled from: PG */
/* renamed from: dqbi  reason: default package */
/* loaded from: classes.dex */
public final class dqbi extends dsqw<dqbi, dqbf> implements dssk {
    public static final dqbi g;
    private static volatile dssr<dqbi> h;
    public int a;
    public float b;
    public int d;
    public dsrj<dqbq> c = dssu.b;
    public dsrj<dqbv> e = dssu.b;
    public String f = "";

    static {
        dqbi dqbiVar = new dqbi();
        g = dqbiVar;
        dsqw.cc(dqbi.class, dqbiVar);
    }

    private dqbi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001ခ\u0000\u0003\u001b\u0004ဌ\u0001\u0005ဈ\u0002\u0006\u001b", new Object[]{"a", "b", "c", dqbq.class, "d", dqbg.a, "f", "e", dqbv.class});
            }
            if (i2 == 3) {
                return new dqbi();
            }
            if (i2 == 4) {
                return new dqbf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqbi> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqbi.class) {
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
