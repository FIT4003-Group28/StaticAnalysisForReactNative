package defpackage;
/* compiled from: PG */
/* renamed from: cgbs  reason: default package */
/* loaded from: classes4.dex */
public final class cgbs extends dsqw<cgbs, cgbr> implements dssk {
    public static final cgbs e;
    private static volatile dssr<cgbs> f;
    public int a;
    public int b;
    public String c = "";
    public String d = "";

    static {
        cgbs cgbsVar = new cgbs();
        e = cgbsVar;
        dsqw.cc(cgbs.class, cgbsVar);
    }

    private cgbs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", cgbo.a, "c", "d"});
            }
            if (i2 == 3) {
                return new cgbs();
            }
            if (i2 == 4) {
                return new cgbr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgbs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cgbs.class) {
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
