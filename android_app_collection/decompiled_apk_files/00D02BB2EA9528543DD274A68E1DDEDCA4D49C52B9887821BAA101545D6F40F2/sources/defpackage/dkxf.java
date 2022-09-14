package defpackage;
/* compiled from: PG */
/* renamed from: dkxf  reason: default package */
/* loaded from: classes.dex */
public final class dkxf extends dsqw<dkxf, dkxa> implements dssk {
    public static final dkxf f;
    private static volatile dssr<dkxf> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        dkxf dkxfVar = new dkxf();
        f = dkxfVar;
        dsqw.cc(dkxf.class, dkxfVar);
    }

    private dkxf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0004\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", dkxe.c(), "e", dkxc.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new dkxf();
            }
            if (i2 == 4) {
                return new dkxa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkxf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkxf.class) {
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
