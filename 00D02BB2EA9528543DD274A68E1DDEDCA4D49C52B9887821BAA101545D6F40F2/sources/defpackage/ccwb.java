package defpackage;
/* compiled from: PG */
/* renamed from: ccwb  reason: default package */
/* loaded from: classes4.dex */
public final class ccwb extends dsqw<ccwb, ccwa> implements dssk {
    public static final ccwb f;
    private static volatile dssr<ccwb> g;
    public int a;
    public dsrj<ccwi> b = dssu.b;
    public int c;
    public int d;
    public ccwk e;

    static {
        ccwb ccwbVar = new ccwb();
        f = ccwbVar;
        dsqw.cc(ccwb.class, ccwbVar);
    }

    private ccwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဉ\u0002", new Object[]{"a", "b", ccwi.class, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ccwb();
            }
            if (i2 == 4) {
                return new ccwa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccwb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ccwb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
