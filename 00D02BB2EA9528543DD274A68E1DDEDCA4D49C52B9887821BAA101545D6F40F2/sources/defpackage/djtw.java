package defpackage;
/* compiled from: PG */
/* renamed from: djtw  reason: default package */
/* loaded from: classes6.dex */
public final class djtw extends dsqw<djtw, djtv> implements dssk {
    public static final djtw b;
    private static volatile dssr<djtw> d;
    public String a = "";
    private int c;

    static {
        djtw djtwVar = new djtw();
        b = djtwVar;
        dsqw.cc(djtw.class, djtwVar);
    }

    private djtw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djtw();
            }
            if (i2 == 4) {
                return new djtv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djtw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djtw.class) {
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
