package defpackage;
/* compiled from: PG */
/* renamed from: dvvw  reason: default package */
/* loaded from: classes6.dex */
public final class dvvw extends dsqw<dvvw, dvvv> implements dssk {
    public static final dvvw b;
    private static volatile dssr<dvvw> c;
    public dsrj<dnfw> a = dssu.b;

    static {
        dvvw dvvwVar = new dvvw();
        b = dvvwVar;
        dsqw.cc(dvvw.class, dvvwVar);
    }

    private dvvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dnfw.class});
            }
            if (i2 == 3) {
                return new dvvw();
            }
            if (i2 == 4) {
                return new dvvv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvvw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvvw.class) {
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