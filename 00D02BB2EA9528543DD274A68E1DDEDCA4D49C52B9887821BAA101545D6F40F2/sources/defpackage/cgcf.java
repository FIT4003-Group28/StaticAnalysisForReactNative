package defpackage;
/* compiled from: PG */
/* renamed from: cgcf  reason: default package */
/* loaded from: classes4.dex */
public final class cgcf extends dsqw<cgcf, cgce> implements dssk {
    public static final cgcf d;
    private static volatile dssr<cgcf> e;
    public int a;
    public int b;
    public String c = "";

    static {
        cgcf cgcfVar = new cgcf();
        d = cgcfVar;
        dsqw.cc(cgcf.class, cgcfVar);
    }

    private cgcf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", cgbo.a, "c"});
            }
            if (i2 == 3) {
                return new cgcf();
            }
            if (i2 == 4) {
                return new cgce();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgcf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cgcf.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
