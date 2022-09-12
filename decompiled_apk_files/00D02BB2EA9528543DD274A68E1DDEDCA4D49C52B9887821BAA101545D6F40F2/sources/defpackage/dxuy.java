package defpackage;
/* compiled from: PG */
/* renamed from: dxuy  reason: default package */
/* loaded from: classes6.dex */
public final class dxuy extends dsqw<dxuy, dxux> implements dssk {
    public static final dxuy d;
    private static volatile dssr<dxuy> e;
    public dxwi a;
    public dxvs b;
    public dxur c;

    static {
        dxuy dxuyVar = new dxuy();
        d = dxuyVar;
        dsqw.cc(dxuy.class, dxuyVar);
    }

    private dxuy() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0006\u0012\u0003\u0000\u0000\u0000\u0006\t\n\t\u0012\t", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dxuy();
            }
            if (i2 == 4) {
                return new dxux();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxuy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxuy.class) {
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
