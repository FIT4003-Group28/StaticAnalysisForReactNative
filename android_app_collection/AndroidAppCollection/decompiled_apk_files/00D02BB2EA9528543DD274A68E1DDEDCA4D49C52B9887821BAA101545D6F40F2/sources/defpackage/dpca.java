package defpackage;
/* compiled from: PG */
/* renamed from: dpca  reason: default package */
/* loaded from: classes6.dex */
public final class dpca extends dsqw<dpca, dpbx> implements dssk {
    public static final dpca e;
    private static volatile dssr<dpca> f;
    public int a;
    public int b;
    public dpjx c;
    public String d = "";

    static {
        dpca dpcaVar = new dpca();
        e = dpcaVar;
        dsqw.cc(dpca.class, dpcaVar);
    }

    private dpca() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dpby.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dpca();
            }
            if (i2 == 4) {
                return new dpbx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpca> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpca.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
