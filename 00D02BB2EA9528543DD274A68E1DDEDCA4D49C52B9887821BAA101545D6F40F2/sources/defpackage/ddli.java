package defpackage;
/* compiled from: PG */
/* renamed from: ddli  reason: default package */
/* loaded from: classes5.dex */
public final class ddli extends dsqw<ddli, ddlh> implements dssk {
    public static final ddli c;
    private static volatile dssr<ddli> d;
    public int a;
    public boolean b;

    static {
        ddli ddliVar = new ddli();
        c = ddliVar;
        dsqw.cc(ddli.class, ddliVar);
    }

    private ddli() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new ddli();
            }
            if (i2 == 4) {
                return new ddlh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddli> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddli.class) {
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