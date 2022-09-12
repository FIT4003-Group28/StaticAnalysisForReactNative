package defpackage;
/* compiled from: PG */
/* renamed from: dxwc  reason: default package */
/* loaded from: classes6.dex */
public final class dxwc extends dsqw<dxwc, dxwb> implements dssk {
    public static final dxwc e;
    private static volatile dssr<dxwc> f;
    public String a = "";
    public String b = "";
    public dspd c = dspd.b;
    public dspd d = dspd.b;

    static {
        dxwc dxwcVar = new dxwc();
        e = dxwcVar;
        dsqw.cc(dxwc.class, dxwcVar);
    }

    private dxwc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0005\n\b\n", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dxwc();
            }
            if (i2 == 4) {
                return new dxwb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxwc.class) {
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
