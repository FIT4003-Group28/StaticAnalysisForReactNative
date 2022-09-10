package defpackage;
/* compiled from: PG */
/* renamed from: dnoj  reason: default package */
/* loaded from: classes.dex */
public final class dnoj extends dsqw<dnoj, dnoi> implements dssk {
    public static final dnoj d;
    private static volatile dssr<dnoj> f;
    public dnpq b;
    private int e;
    public String a = "";
    public String c = "";

    static {
        dnoj dnojVar = new dnoj();
        d = dnojVar;
        dsqw.cc(dnoj.class, dnojVar);
    }

    private dnoj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnoj();
            }
            if (i2 == 4) {
                return new dnoi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnoj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dnoj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
