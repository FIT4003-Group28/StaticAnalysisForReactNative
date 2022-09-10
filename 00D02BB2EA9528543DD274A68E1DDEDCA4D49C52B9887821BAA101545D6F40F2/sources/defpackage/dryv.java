package defpackage;
/* compiled from: PG */
/* renamed from: dryv  reason: default package */
/* loaded from: classes6.dex */
public final class dryv extends dsqw<dryv, dryu> implements dssk {
    public static final dryv g;
    private static volatile dssr<dryv> h;
    public int a;
    public String b = "";
    public dsba c;
    public long d;
    public dsau e;
    public int f;

    static {
        dryv dryvVar = new dryv();
        g = dryvVar;
        dsqw.cc(dryv.class, dryvVar);
    }

    private dryv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဂ\u0002\u0007ဉ\u0001\bဉ\u0004\tဌ\u0005", new Object[]{"a", "b", "d", "c", "e", "f", dscm.a});
            }
            if (i2 == 3) {
                return new dryv();
            }
            if (i2 == 4) {
                return new dryu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dryv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dryv.class) {
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
