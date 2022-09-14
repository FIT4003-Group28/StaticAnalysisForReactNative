package defpackage;
/* compiled from: PG */
/* renamed from: dqfz  reason: default package */
/* loaded from: classes6.dex */
public final class dqfz extends dsqw<dqfz, dqfy> implements dssk {
    public static final dqfz g;
    private static volatile dssr<dqfz> h;
    public int a;
    public String b = "";
    public dqgf c;
    public long d;
    public int e;
    public boolean f;

    static {
        dqfz dqfzVar = new dqfz();
        g = dqfzVar;
        dsqw.cc(dqfz.class, dqfzVar);
    }

    private dqfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u001a\u0005\u0000\u0000\u0000\u0001ဈ\u0000\tဂ\u0003\u0016ဉ\u0002\u0017ဌ\b\u001aဇ\n", new Object[]{"a", "b", "d", "c", "e", dqga.a, "f"});
            }
            if (i2 == 3) {
                return new dqfz();
            }
            if (i2 == 4) {
                return new dqfy();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqfz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dqfz.class) {
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
