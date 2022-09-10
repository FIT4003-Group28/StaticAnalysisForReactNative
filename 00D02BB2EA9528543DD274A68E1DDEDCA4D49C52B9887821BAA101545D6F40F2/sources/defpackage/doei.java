package defpackage;
/* compiled from: PG */
/* renamed from: doei  reason: default package */
/* loaded from: classes.dex */
public final class doei extends dsqw<doei, doeh> implements dssk {
    public static final doei d;
    private static volatile dssr<doei> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        doei doeiVar = new doei();
        d = doeiVar;
        dsqw.cc(doei.class, doeiVar);
    }

    private doei() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new doei();
            }
            if (i2 == 4) {
                return new doeh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doei> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doei.class) {
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
