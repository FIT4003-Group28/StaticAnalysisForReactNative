package defpackage;
/* compiled from: PG */
/* renamed from: dpxf  reason: default package */
/* loaded from: classes.dex */
public final class dpxf extends dsqw<dpxf, dpxc> implements dssk {
    public static final dpxf f;
    private static volatile dssr<dpxf> g;
    public int a;
    public String b = "";
    public String c = "";
    public dpxe d;
    public dpxe e;

    static {
        dpxf dpxfVar = new dpxf();
        f = dpxfVar;
        dsqw.cc(dpxf.class, dpxfVar);
    }

    private dpxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0001\u0003ဉ\u0004\u0004ဈ\u0000\u0005ဉ\u0003", new Object[]{"a", "c", "e", "b", "d"});
            }
            if (i2 == 3) {
                return new dpxf();
            }
            if (i2 == 4) {
                return new dpxc();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpxf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dpxf.class) {
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
