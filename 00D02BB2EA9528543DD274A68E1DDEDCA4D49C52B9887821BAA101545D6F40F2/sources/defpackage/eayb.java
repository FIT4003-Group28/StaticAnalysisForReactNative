package defpackage;
/* compiled from: PG */
/* renamed from: eayb  reason: default package */
/* loaded from: classes6.dex */
public final class eayb extends dsqw<eayb, eaya> implements dssk {
    public static final eayb g;
    private static volatile dssr<eayb> h;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public long f;

    static {
        eayb eaybVar = new eayb();
        g = eaybVar;
        dsqw.cc(eayb.class, eaybVar);
    }

    private eayb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဂ\u0004\u0005ဌ\u0000", new Object[]{"a", "c", "d", "e", "f", "b", eayk.a});
            }
            if (i2 == 3) {
                return new eayb();
            }
            if (i2 == 4) {
                return new eaya();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eayb.class) {
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
