package defpackage;
/* compiled from: PG */
/* renamed from: dptb  reason: default package */
/* loaded from: classes.dex */
public final class dptb extends dsqw<dptb, dpta> implements dssk {
    public static final dptb e;
    private static volatile dssr<dptb> g;
    public int b;
    private int f;
    public String a = "";
    public String c = "";
    public String d = "";

    static {
        dptb dptbVar = new dptb();
        e = dptbVar;
        dsqw.cc(dptb.class, dptbVar);
    }

    private dptb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", dpuk.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dptb();
            }
            if (i2 == 4) {
                return new dpta();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dptb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dptb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
