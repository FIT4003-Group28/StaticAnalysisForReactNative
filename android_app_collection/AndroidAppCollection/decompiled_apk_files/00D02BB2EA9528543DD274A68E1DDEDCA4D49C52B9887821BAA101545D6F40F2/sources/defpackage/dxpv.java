package defpackage;
/* compiled from: PG */
/* renamed from: dxpv  reason: default package */
/* loaded from: classes6.dex */
public final class dxpv extends dsqw<dxpv, dxpu> implements dssk {
    public static final dxpv f;
    private static volatile dssr<dxpv> g;
    public dxvy a;
    public String b = "";
    public dspd c = dspd.b;
    public String d = "";
    public int e;

    static {
        dxpv dxpvVar = new dxpv();
        f = dxpvVar;
        dsqw.cc(dxpv.class, dxpvVar);
    }

    private dxpv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\n\u0004Ȉ\u0005\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dxpv();
            }
            if (i2 == 4) {
                return new dxpu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxpv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dxpv.class) {
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
