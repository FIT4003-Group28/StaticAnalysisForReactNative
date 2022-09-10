package defpackage;
/* compiled from: PG */
/* renamed from: dxwi  reason: default package */
/* loaded from: classes6.dex */
public final class dxwi extends dsqw<dxwi, dxwh> implements dssk {
    public static final dxwi e;
    private static volatile dssr<dxwi> f;
    public dspd a = dspd.b;
    public dspd b = dspd.b;
    public dxvo c;
    public dxvs d;

    static {
        dxwi dxwiVar = new dxwi();
        e = dxwiVar;
        dsqw.cc(dxwi.class, dxwiVar);
    }

    private dxwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0006\n\u0004\u0000\u0000\u0000\u0006\n\u0007\t\t\n\n\t", new Object[]{"b", "c", "a", "d"});
            }
            if (i2 == 3) {
                return new dxwi();
            }
            if (i2 == 4) {
                return new dxwh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxwi.class) {
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
