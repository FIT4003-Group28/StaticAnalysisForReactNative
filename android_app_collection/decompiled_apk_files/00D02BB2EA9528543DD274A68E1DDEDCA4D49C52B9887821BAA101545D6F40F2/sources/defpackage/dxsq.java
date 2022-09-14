package defpackage;
/* compiled from: PG */
/* renamed from: dxsq  reason: default package */
/* loaded from: classes6.dex */
public final class dxsq extends dsqw<dxsq, dxsp> implements dssk {
    public static final dxsq b;
    private static volatile dssr<dxsq> c;
    public int a;

    static {
        dxsq dxsqVar = new dxsq();
        b = dxsqVar;
        dsqw.cc(dxsq.class, dxsqVar);
    }

    private dxsq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxsq();
            }
            if (i2 == 4) {
                return new dxsp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
