package defpackage;
/* compiled from: PG */
/* renamed from: dxve  reason: default package */
/* loaded from: classes6.dex */
public final class dxve extends dsqw<dxve, dxvd> implements dssk {
    public static final dxve c;
    private static volatile dssr<dxve> d;
    public dspd a = dspd.b;
    public dxvm b;

    static {
        dxve dxveVar = new dxve();
        c = dxveVar;
        dsqw.cc(dxve.class, dxveVar);
    }

    private dxve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\n\u0004\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxve();
            }
            if (i2 == 4) {
                return new dxvd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxve> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxve.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
