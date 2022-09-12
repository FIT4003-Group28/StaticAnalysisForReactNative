package defpackage;
/* compiled from: PG */
/* renamed from: dxva  reason: default package */
/* loaded from: classes6.dex */
public final class dxva extends dsqw<dxva, dxuz> implements dssk {
    public static final dxva d;
    private static volatile dssr<dxva> e;
    public boolean a;
    public dxvm b;
    public dspd c = dspd.b;

    static {
        dxva dxvaVar = new dxva();
        d = dxvaVar;
        dsqw.cc(dxva.class, dxvaVar);
    }

    private dxva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0002\r\u0003\u0000\u0000\u0000\u0002\u0007\u0005\t\r\n", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxva();
            }
            if (i2 == 4) {
                return new dxuz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxva> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxva.class) {
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
