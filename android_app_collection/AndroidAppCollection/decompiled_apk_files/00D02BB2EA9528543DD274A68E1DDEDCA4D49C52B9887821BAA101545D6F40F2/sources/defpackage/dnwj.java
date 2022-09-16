package defpackage;
/* compiled from: PG */
/* renamed from: dnwj  reason: default package */
/* loaded from: classes.dex */
public final class dnwj extends dsqw<dnwj, dnwg> implements dssk {
    public static final dnwj b;
    private static volatile dssr<dnwj> c;
    public dsrj<dnwi> a = dssu.b;

    static {
        dnwj dnwjVar = new dnwj();
        b = dnwjVar;
        dsqw.cc(dnwj.class, dnwjVar);
    }

    private dnwj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dnwi.class});
            }
            if (i2 == 3) {
                return new dnwj();
            }
            if (i2 == 4) {
                return new dnwg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnwj.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
