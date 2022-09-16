package defpackage;
/* compiled from: PG */
/* renamed from: dnxw  reason: default package */
/* loaded from: classes6.dex */
public final class dnxw extends dsqw<dnxw, dnxt> implements dssk {
    public static final dnxw d;
    private static volatile dssr<dnxw> e;
    public int a;
    public int b;
    public dnxv c;

    static {
        dnxw dnxwVar = new dnxw();
        d = dnxwVar;
        dsqw.cc(dnxw.class, dnxwVar);
    }

    private dnxw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnxw();
            }
            if (i2 == 4) {
                return new dnxt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnxw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnxw.class) {
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
