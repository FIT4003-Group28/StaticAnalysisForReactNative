package defpackage;
/* compiled from: PG */
/* renamed from: ddlc  reason: default package */
/* loaded from: classes5.dex */
public final class ddlc extends dsqw<ddlc, ddlb> implements dssk {
    public static final ddlc e;
    private static volatile dssr<ddlc> f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        ddlc ddlcVar = new ddlc();
        e = ddlcVar;
        dsqw.cc(ddlc.class, ddlcVar);
    }

    private ddlc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddlc();
            }
            if (i2 == 4) {
                return new ddlb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddlc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ddlc.class) {
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
