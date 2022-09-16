package defpackage;
/* compiled from: PG */
/* renamed from: dfoq  reason: default package */
/* loaded from: classes6.dex */
public final class dfoq extends dsqw<dfoq, dfop> implements dssk {
    public static final dfoq a;
    public static final dsqv<dfok, dfoq> b;
    private static volatile dssr<dfoq> c;

    static {
        dfoq dfoqVar = new dfoq();
        a = dfoqVar;
        dsqw.cc(dfoq.class, dfoqVar);
        b = dsqw.newSingularGeneratedExtension(dfok.f, dfoqVar, dfoqVar, null, 326523520, dsur.MESSAGE, dfoq.class);
    }

    private dfoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfoq();
            }
            if (i2 == 4) {
                return new dfop();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfoq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dfoq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
