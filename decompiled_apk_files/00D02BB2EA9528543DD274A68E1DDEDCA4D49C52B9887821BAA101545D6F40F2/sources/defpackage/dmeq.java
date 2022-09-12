package defpackage;
/* compiled from: PG */
/* renamed from: dmeq  reason: default package */
/* loaded from: classes6.dex */
public final class dmeq extends dsqw<dmeq, dmep> implements dssk {
    public static final dmeq c;
    public static final dsqv<dmfu, dmeq> d;
    private static volatile dssr<dmeq> e;
    public int a;
    public dmdx b;

    static {
        dmeq dmeqVar = new dmeq();
        c = dmeqVar;
        dsqw.cc(dmeq.class, dmeqVar);
        d = dsqw.newSingularGeneratedExtension(dmfu.e, dmeqVar, dmeqVar, null, 1008, dsur.MESSAGE, dmeq.class);
    }

    private dmeq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmeq();
            }
            if (i2 == 4) {
                return new dmep();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmeq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmeq.class) {
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
