package defpackage;
/* compiled from: PG */
/* renamed from: dhst  reason: default package */
/* loaded from: classes6.dex */
public final class dhst extends dsqw<dhst, dhss> implements dssk {
    public static final dhst b;
    private static volatile dssr<dhst> c;
    public dsrj<dixg> a = dssu.b;

    static {
        dhst dhstVar = new dhst();
        b = dhstVar;
        dsqw.cc(dhst.class, dhstVar);
    }

    private dhst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dixg.class});
            }
            if (i2 == 3) {
                return new dhst();
            }
            if (i2 == 4) {
                return new dhss();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhst> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhst.class) {
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
