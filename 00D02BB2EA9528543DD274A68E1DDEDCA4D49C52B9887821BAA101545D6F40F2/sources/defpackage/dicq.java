package defpackage;
/* compiled from: PG */
/* renamed from: dicq  reason: default package */
/* loaded from: classes6.dex */
public final class dicq extends dsqw<dicq, dicp> implements dssk {
    public static final dicq c;
    private static volatile dssr<dicq> d;
    public int a;
    public djul b;

    static {
        dicq dicqVar = new dicq();
        c = dicqVar;
        dsqw.cc(dicq.class, dicqVar);
    }

    private dicq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dicq();
            }
            if (i2 == 4) {
                return new dicp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dicq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dicq.class) {
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