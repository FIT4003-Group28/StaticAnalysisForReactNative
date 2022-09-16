package defpackage;
/* compiled from: PG */
/* renamed from: dryz  reason: default package */
/* loaded from: classes6.dex */
public final class dryz extends dsqw<dryz, dryy> implements dssk {
    public static final dryz g;
    private static volatile dssr<dryz> h;
    public int a;
    public String b = "";
    public dsrj<String> c = dssu.b;
    public dsba d;
    public dsau e;
    public int f;

    static {
        dryz dryzVar = new dryz();
        g = dryzVar;
        dsqw.cc(dryz.class, dryzVar);
    }

    private dryz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0005\u001a\u0006ဉ\u0001\u0007ဉ\u0002\tဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", dscm.a});
            }
            if (i2 == 3) {
                return new dryz();
            }
            if (i2 == 4) {
                return new dryy();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryz> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dryz.class) {
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
