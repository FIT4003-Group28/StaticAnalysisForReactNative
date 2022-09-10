package defpackage;
/* compiled from: PG */
/* renamed from: dnwn  reason: default package */
/* loaded from: classes6.dex */
public final class dnwn extends dsqw<dnwn, dnwm> implements dssk {
    public static final dnwn c;
    private static volatile dssr<dnwn> d;
    public int a;
    public int b = 10;

    static {
        dnwn dnwnVar = new dnwn();
        c = dnwnVar;
        dsqw.cc(dnwn.class, dnwnVar);
    }

    private dnwn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002င\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnwn();
            }
            if (i2 == 4) {
                return new dnwm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnwn.class) {
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
