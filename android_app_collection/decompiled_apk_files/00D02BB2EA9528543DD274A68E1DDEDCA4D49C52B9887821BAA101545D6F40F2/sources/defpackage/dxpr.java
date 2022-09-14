package defpackage;
/* compiled from: PG */
/* renamed from: dxpr  reason: default package */
/* loaded from: classes6.dex */
public final class dxpr extends dsqw<dxpr, dxpm> implements dssk {
    public static final dxpr f;
    private static volatile dssr<dxpr> j;
    public dxnc a;
    public dxmu c;
    public dxnk d;
    public dxqi e;
    public dssd<String, dsok> b = dssd.b;
    private dssd<String, String> g = dssd.b;
    private dssd<String, Boolean> h = dssd.b;
    private dssd<String, String> i = dssd.b;

    static {
        dxpr dxprVar = new dxpr();
        f = dxprVar;
        dsqw.cc(dxpr.class, dxprVar);
    }

    private dxpr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0000\b\u0000\u0000\u0001\t\b\u0004\u0000\u0000\u0001\t\u00022\u0003\t\u0004\t\u0005\t\u00062\u00072\t2", new Object[]{"a", "b", dxpo.a, "c", "d", "e", "g", dxpn.a, "h", dxpp.a, "i", dxpq.a});
            }
            if (i2 == 3) {
                return new dxpr();
            }
            if (i2 == 4) {
                return new dxpm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxpr> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dxpr.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
