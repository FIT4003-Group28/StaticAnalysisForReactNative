package defpackage;
/* compiled from: PG */
/* renamed from: dgbw  reason: default package */
/* loaded from: classes6.dex */
public final class dgbw extends dsqw<dgbw, dgbv> implements dssk {
    public static final dgbw b;
    private static volatile dssr<dgbw> c;
    public dsrj<dgbu> a = dssu.b;

    static {
        dgbw dgbwVar = new dgbw();
        b = dgbwVar;
        dsqw.cc(dgbw.class, dgbwVar);
    }

    private dgbw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dgbu.class});
            }
            if (i2 == 3) {
                return new dgbw();
            }
            if (i2 == 4) {
                return new dgbv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgbw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dgbw.class) {
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
