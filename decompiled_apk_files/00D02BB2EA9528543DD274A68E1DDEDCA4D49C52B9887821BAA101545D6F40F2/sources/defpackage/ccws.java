package defpackage;
/* compiled from: PG */
/* renamed from: ccws  reason: default package */
/* loaded from: classes4.dex */
public final class ccws extends dsqw<ccws, ccwr> implements dssk {
    public static final ccws f;
    private static volatile dssr<ccws> g;
    public int a;
    public ccln b;
    public String c = "";
    public ccxa d;
    public dgfg e;

    static {
        ccws ccwsVar = new ccws();
        f = ccwsVar;
        dsqw.cc(ccws.class, ccwsVar);
    }

    private ccws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\nဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ccws();
            }
            if (i2 == 4) {
                return new ccwr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ccws> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ccws.class) {
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
