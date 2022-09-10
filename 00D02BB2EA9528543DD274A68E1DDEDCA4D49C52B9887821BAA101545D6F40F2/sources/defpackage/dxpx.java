package defpackage;
/* compiled from: PG */
/* renamed from: dxpx  reason: default package */
/* loaded from: classes6.dex */
public final class dxpx extends dsqw<dxpx, dxpw> implements dssk {
    public static final dxpx c;
    private static volatile dssr<dxpx> d;
    public String a = "";
    public String b = "";

    static {
        dxpx dxpxVar = new dxpx();
        c = dxpxVar;
        dsqw.cc(dxpx.class, dxpxVar);
    }

    private dxpx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxpx();
            }
            if (i2 == 4) {
                return new dxpw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxpx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxpx.class) {
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
