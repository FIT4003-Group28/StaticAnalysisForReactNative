package defpackage;
/* compiled from: PG */
/* renamed from: dtcr  reason: default package */
/* loaded from: classes6.dex */
public final class dtcr extends dsqw<dtcr, dtcq> implements dssk {
    public static final dtcr d;
    private static volatile dssr<dtcr> e;
    public int a;
    public dsrj<dtcp> b = dssu.b;
    public dtcx c;

    static {
        dtcr dtcrVar = new dtcr();
        d = dtcrVar;
        dsqw.cc(dtcr.class, dtcrVar);
    }

    private dtcr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dtcp.class, "c"});
            }
            if (i2 == 3) {
                return new dtcr();
            }
            if (i2 == 4) {
                return new dtcq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtcr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtcr.class) {
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
