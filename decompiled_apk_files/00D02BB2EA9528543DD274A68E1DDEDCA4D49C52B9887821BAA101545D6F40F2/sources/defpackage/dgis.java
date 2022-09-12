package defpackage;
/* compiled from: PG */
/* renamed from: dgis  reason: default package */
/* loaded from: classes6.dex */
public final class dgis extends dsqw<dgis, dgip> implements dssk {
    public static final dgis d;
    private static volatile dssr<dgis> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dgis dgisVar = new dgis();
        d = dgisVar;
        dsqw.cc(dgis.class, dgisVar);
    }

    private dgis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dgiq.a, "c"});
            }
            if (i2 == 3) {
                return new dgis();
            }
            if (i2 == 4) {
                return new dgip();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgis> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgis.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
