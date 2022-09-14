package defpackage;
/* compiled from: PG */
/* renamed from: becp  reason: default package */
/* loaded from: classes3.dex */
public final class becp extends dsqw<becp, beco> implements dssk {
    public static final becp c;
    private static volatile dssr<becp> d;
    public int a;
    public String b = "";

    static {
        becp becpVar = new becp();
        c = becpVar;
        dsqw.cc(becp.class, becpVar);
    }

    private becp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new becp();
            }
            if (i2 == 4) {
                return new beco();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<becp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (becp.class) {
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
