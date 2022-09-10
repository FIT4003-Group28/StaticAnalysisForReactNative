package defpackage;
/* compiled from: PG */
/* renamed from: ddvc  reason: default package */
/* loaded from: classes6.dex */
public final class ddvc extends dsqw<ddvc, ddvb> implements dssk {
    public static final ddvc d;
    private static volatile dssr<ddvc> e;
    public int a;
    public int b;
    public dspt c;

    static {
        ddvc ddvcVar = new ddvc();
        d = ddvcVar;
        dsqw.cc(ddvc.class, ddvcVar);
    }

    private ddvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddvc();
            }
            if (i2 == 4) {
                return new ddvb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddvc.class) {
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
