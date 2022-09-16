package defpackage;
/* compiled from: PG */
/* renamed from: dghu  reason: default package */
/* loaded from: classes6.dex */
public final class dghu extends dsqw<dghu, dght> implements dssk {
    public static final dghu c;
    private static volatile dssr<dghu> e;
    public int a;
    public boolean b;
    private int d;

    static {
        dghu dghuVar = new dghu();
        c = dghuVar;
        dsqw.cc(dghu.class, dghuVar);
    }

    private dghu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", dghs.c(), "b"});
            }
            if (i2 == 3) {
                return new dghu();
            }
            if (i2 == 4) {
                return new dght();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dghu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
