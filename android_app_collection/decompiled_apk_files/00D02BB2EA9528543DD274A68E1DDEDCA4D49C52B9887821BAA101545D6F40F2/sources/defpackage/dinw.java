package defpackage;
/* compiled from: PG */
/* renamed from: dinw  reason: default package */
/* loaded from: classes6.dex */
public final class dinw extends dsqw<dinw, dinv> implements dssk {
    public static final dinw b;
    private static volatile dssr<dinw> c;
    public dsrj<dioc> a = dssu.b;

    static {
        dinw dinwVar = new dinw();
        b = dinwVar;
        dsqw.cc(dinw.class, dinwVar);
    }

    private dinw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dioc.class});
            }
            if (i2 == 3) {
                return new dinw();
            }
            if (i2 == 4) {
                return new dinv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dinw.class) {
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
