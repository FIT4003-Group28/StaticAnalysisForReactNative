package defpackage;
/* compiled from: PG */
/* renamed from: ddvw  reason: default package */
/* loaded from: classes6.dex */
public final class ddvw extends dsqw<ddvw, ddvv> implements dssk {
    public static final ddvw b;
    private static volatile dssr<ddvw> c;
    public dsrj<dduq> a;

    static {
        ddvw ddvwVar = new ddvw();
        b = ddvwVar;
        dsqw.cc(ddvw.class, ddvwVar);
    }

    private ddvw() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dduq.class});
            }
            if (i2 == 3) {
                return new ddvw();
            }
            if (i2 == 4) {
                return new ddvv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddvw.class) {
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
