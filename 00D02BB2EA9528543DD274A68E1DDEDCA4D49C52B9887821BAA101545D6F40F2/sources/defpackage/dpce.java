package defpackage;
/* compiled from: PG */
/* renamed from: dpce  reason: default package */
/* loaded from: classes6.dex */
public final class dpce extends dsqw<dpce, dpcb> implements dssk {
    public static final dpce f;
    private static volatile dssr<dpce> h;
    public int a;
    public int b;
    public doul c;
    public douj d;
    public boolean e;
    private byte g = 2;

    static {
        dpce dpceVar = new dpce();
        f = dpceVar;
        dsqw.cc(dpce.class, dpceVar);
    }

    private dpce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", dpcc.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dpce();
            }
            if (i2 == 4) {
                return new dpcb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dpce> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dpce.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
