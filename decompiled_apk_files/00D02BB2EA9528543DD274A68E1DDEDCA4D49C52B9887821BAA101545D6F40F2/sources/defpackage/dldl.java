package defpackage;
/* compiled from: PG */
/* renamed from: dldl  reason: default package */
/* loaded from: classes6.dex */
public final class dldl extends dsqw<dldl, dldk> implements dssk {
    public static final dldl c;
    private static volatile dssr<dldl> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dldl dldlVar = new dldl();
        c = dldlVar;
        dsqw.cc(dldl.class, dldlVar);
    }

    private dldl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dldl();
            }
            if (i2 == 4) {
                return new dldk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dldl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dldl.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
