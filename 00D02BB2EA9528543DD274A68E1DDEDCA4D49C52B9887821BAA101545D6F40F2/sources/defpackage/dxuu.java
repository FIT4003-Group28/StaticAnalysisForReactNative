package defpackage;
/* compiled from: PG */
/* renamed from: dxuu  reason: default package */
/* loaded from: classes6.dex */
public final class dxuu extends dsqw<dxuu, dxus> implements dssk {
    public static final dxuu g;
    private static volatile dssr<dxuu> h;
    public dxwi a;
    public dxvs b;
    public long c;
    public int d;
    public dspd e = dspd.b;
    public dxur f;

    static {
        dxuu dxuuVar = new dxuu();
        g = dxuuVar;
        dsqw.cc(dxuu.class, dxuuVar);
    }

    private dxuu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0002\u0004\n\r\t\u0010\f", new Object[]{"a", "b", "c", "e", "f", "d"});
            }
            if (i2 == 3) {
                return new dxuu();
            }
            if (i2 == 4) {
                return new dxus();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxuu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxuu.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
