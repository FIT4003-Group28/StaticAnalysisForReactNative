package defpackage;
/* compiled from: PG */
/* renamed from: dmfq  reason: default package */
/* loaded from: classes6.dex */
public final class dmfq extends dsqw<dmfq, dmfp> implements dssk {
    public static final dmfq d;
    public static final dsqv<dmfu, dmfq> e;
    private static volatile dssr<dmfq> f;
    public int a;
    public dmhp b;
    public boolean c;

    static {
        dmfq dmfqVar = new dmfq();
        d = dmfqVar;
        dsqw.cc(dmfq.class, dmfqVar);
        e = dsqw.newSingularGeneratedExtension(dmfu.e, dmfqVar, dmfqVar, null, 1007, dsur.MESSAGE, dmfq.class);
    }

    private dmfq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmfq();
            }
            if (i2 == 4) {
                return new dmfp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmfq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
