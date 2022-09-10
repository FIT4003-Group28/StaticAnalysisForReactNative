package defpackage;
/* compiled from: PG */
/* renamed from: dnxz  reason: default package */
/* loaded from: classes6.dex */
public final class dnxz extends dsqw<dnxz, dnxy> implements dssk {
    public static final dnxz c;
    private static volatile dssr<dnxz> d;
    public int a;
    public boolean b;

    static {
        dnxz dnxzVar = new dnxz();
        c = dnxzVar;
        dsqw.cc(dnxz.class, dnxzVar);
    }

    private dnxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnxz();
            }
            if (i2 == 4) {
                return new dnxy();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnxz.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
