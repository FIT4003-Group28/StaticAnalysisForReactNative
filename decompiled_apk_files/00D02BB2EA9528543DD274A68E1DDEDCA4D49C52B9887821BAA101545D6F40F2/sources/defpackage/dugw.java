package defpackage;
/* compiled from: PG */
/* renamed from: dugw  reason: default package */
/* loaded from: classes6.dex */
public final class dugw extends dsqw<dugw, dugv> implements dssk {
    public static final dugw c;
    public static final dsqv<dmlk, dugw> d;
    private static volatile dssr<dugw> e;
    public int a;
    public drkg b;

    static {
        dugw dugwVar = new dugw();
        c = dugwVar;
        dsqw.cc(dugw.class, dugwVar);
        d = dsqw.newSingularGeneratedExtension(dmlk.a, dugwVar, dugwVar, null, 303205372, dsur.MESSAGE, dugw.class);
    }

    private dugw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dugw();
            }
            if (i2 == 4) {
                return new dugv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dugw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dugw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
