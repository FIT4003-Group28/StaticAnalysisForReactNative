package defpackage;
/* compiled from: PG */
/* renamed from: dzyq  reason: default package */
/* loaded from: classes6.dex */
public final class dzyq extends dsqw<dzyq, dzyp> implements dssk {
    public static final dzyq e;
    private static volatile dssr<dzyq> f;
    public int a;
    public int b;
    public int c;
    public dzyi d;

    static {
        dzyq dzyqVar = new dzyq();
        e = dzyqVar;
        dsqw.cc(dzyq.class, dzyqVar);
    }

    private dzyq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dzyq();
            }
            if (i2 == 4) {
                return new dzyp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzyq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dzyq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
