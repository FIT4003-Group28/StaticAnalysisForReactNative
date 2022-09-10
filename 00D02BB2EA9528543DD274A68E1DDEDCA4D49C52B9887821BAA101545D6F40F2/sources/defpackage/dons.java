package defpackage;
/* compiled from: PG */
/* renamed from: dons  reason: default package */
/* loaded from: classes6.dex */
public final class dons extends dsqw<dons, donr> implements dssk {
    public static final dons g;
    private static volatile dssr<dons> h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;

    static {
        dons donsVar = new dons();
        g = donsVar;
        dsqw.cc(dons.class, donsVar);
    }

    private dons() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dons();
            }
            if (i2 == 4) {
                return new donr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dons> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dons.class) {
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
