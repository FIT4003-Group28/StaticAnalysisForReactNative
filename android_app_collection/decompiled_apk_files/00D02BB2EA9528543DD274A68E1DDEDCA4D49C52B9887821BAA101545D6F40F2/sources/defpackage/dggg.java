package defpackage;
/* compiled from: PG */
/* renamed from: dggg  reason: default package */
/* loaded from: classes.dex */
public final class dggg extends dsqw<dggg, dggf> implements dssk {
    public static final dggg d;
    private static volatile dssr<dggg> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dggg dgggVar = new dggg();
        d = dgggVar;
        dsqw.cc(dggg.class, dgggVar);
    }

    private dggg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dgge.c(), "c"});
            }
            if (i2 == 3) {
                return new dggg();
            }
            if (i2 == 4) {
                return new dggf();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dggg.class) {
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
