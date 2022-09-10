package defpackage;
/* compiled from: PG */
/* renamed from: dglq  reason: default package */
/* loaded from: classes.dex */
public final class dglq extends dsqw<dglq, dglp> implements dssk {
    public static final dglq d;
    private static volatile dssr<dglq> e;
    public dsrj<dglo> a = dssu.b;
    public dsrj<dglo> b = dssu.b;
    public dsrj<dgls> c = dssu.b;

    static {
        dglq dglqVar = new dglq();
        d = dglqVar;
        dsqw.cc(dglq.class, dglqVar);
    }

    private dglq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0004\u001b", new Object[]{"b", dglo.class, "c", dgls.class, "a", dglo.class});
            }
            if (i2 == 3) {
                return new dglq();
            }
            if (i2 == 4) {
                return new dglp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dglq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dglq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
