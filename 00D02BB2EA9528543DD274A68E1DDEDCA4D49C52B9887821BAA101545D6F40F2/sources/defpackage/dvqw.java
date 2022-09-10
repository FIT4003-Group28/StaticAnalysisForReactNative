package defpackage;
/* compiled from: PG */
/* renamed from: dvqw  reason: default package */
/* loaded from: classes6.dex */
public final class dvqw extends dsqw<dvqw, dvqv> implements dssk {
    public static final dvqw c;
    private static volatile dssr<dvqw> d;
    public int a;
    public int b;

    static {
        dvqw dvqwVar = new dvqw();
        c = dvqwVar;
        dsqw.cc(dvqw.class, dvqwVar);
    }

    private dvqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dvqu.a});
            }
            if (i2 == 3) {
                return new dvqw();
            }
            if (i2 == 4) {
                return new dvqv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvqw.class) {
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
