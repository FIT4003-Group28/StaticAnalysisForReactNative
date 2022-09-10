package defpackage;
/* compiled from: PG */
/* renamed from: ddsb  reason: default package */
/* loaded from: classes6.dex */
public final class ddsb extends dsqw<ddsb, ddsa> implements dssk {
    public static final ddsb f;
    private static volatile dssr<ddsb> g;
    public int a;
    public int b;
    public String c = "";
    public long d;
    public long e;

    static {
        ddsb ddsbVar = new ddsb();
        f = ddsbVar;
        dsqw.cc(ddsb.class, ddsbVar);
    }

    private ddsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", ddsc.a, "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ddsb();
            }
            if (i2 == 4) {
                return new ddsa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddsb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddsb.class) {
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
