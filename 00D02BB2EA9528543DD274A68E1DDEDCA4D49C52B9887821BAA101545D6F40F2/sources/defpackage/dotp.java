package defpackage;
/* compiled from: PG */
/* renamed from: dotp  reason: default package */
/* loaded from: classes.dex */
public final class dotp extends dsqw<dotp, dotm> implements dssk {
    public static final dotp f;
    private static volatile dssr<dotp> g;
    public int a;
    public Object c;
    public doto d;
    public int b = 0;
    public String e = "";

    static {
        dotp dotpVar = new dotp();
        f = dotpVar;
        dsqw.cc(dotp.class, dotpVar);
    }

    private dotp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ျ\u0000\u0003ဈ\u0003\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", "e", dotl.class});
            }
            if (i2 == 3) {
                return new dotp();
            }
            if (i2 == 4) {
                return new dotm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dotp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dotp.class) {
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
