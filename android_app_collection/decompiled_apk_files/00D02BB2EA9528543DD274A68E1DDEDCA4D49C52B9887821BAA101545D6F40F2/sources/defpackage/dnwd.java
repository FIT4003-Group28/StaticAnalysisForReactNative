package defpackage;
/* compiled from: PG */
/* renamed from: dnwd  reason: default package */
/* loaded from: classes6.dex */
public final class dnwd extends dsqw<dnwd, dnwc> implements dssk {
    public static final dnwd b;
    private static volatile dssr<dnwd> d;
    public String a = "";
    private int c;

    static {
        dnwd dnwdVar = new dnwd();
        b = dnwdVar;
        dsqw.cc(dnwd.class, dnwdVar);
    }

    private dnwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnwd();
            }
            if (i2 == 4) {
                return new dnwc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnwd.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
