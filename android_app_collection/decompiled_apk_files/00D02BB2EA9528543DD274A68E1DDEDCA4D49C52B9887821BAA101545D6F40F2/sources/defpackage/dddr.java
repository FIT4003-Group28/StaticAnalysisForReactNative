package defpackage;
/* compiled from: PG */
/* renamed from: dddr  reason: default package */
/* loaded from: classes5.dex */
public final class dddr extends dsqw<dddr, dddp> implements dssk {
    public static final dddr e;
    private static volatile dssr<dddr> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dddr dddrVar = new dddr();
        e = dddrVar;
        dsqw.cc(dddr.class, dddrVar);
    }

    private dddr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", dddq.a, "c", dwyd.c(), "d"});
            }
            if (i2 == 3) {
                return new dddr();
            }
            if (i2 == 4) {
                return new dddp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dddr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dddr.class) {
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
