package defpackage;
/* compiled from: PG */
/* renamed from: dgbu  reason: default package */
/* loaded from: classes6.dex */
public final class dgbu extends dsqw<dgbu, dgbr> implements dssk {
    public static final dgbu d;
    private static volatile dssr<dgbu> f;
    public int a;
    public long b;
    public String c = "";
    private int e;

    static {
        dgbu dgbuVar = new dgbu();
        d = dgbuVar;
        dsqw.cc(dgbu.class, dgbuVar);
    }

    private dgbu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", dgbs.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dgbu();
            }
            if (i2 == 4) {
                return new dgbr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dgbu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
