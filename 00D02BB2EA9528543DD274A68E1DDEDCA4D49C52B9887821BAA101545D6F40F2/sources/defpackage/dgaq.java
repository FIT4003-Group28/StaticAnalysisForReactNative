package defpackage;
/* compiled from: PG */
/* renamed from: dgaq  reason: default package */
/* loaded from: classes6.dex */
public final class dgaq extends dsqw<dgaq, dgap> implements dssk {
    public static final dgaq d;
    private static volatile dssr<dgaq> e;
    public int a;
    public int b;
    public int c;

    static {
        dgaq dgaqVar = new dgaq();
        d = dgaqVar;
        dsqw.cc(dgaq.class, dgaqVar);
    }

    private dgaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgaq();
            }
            if (i2 == 4) {
                return new dgap();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgaq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgaq.class) {
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
