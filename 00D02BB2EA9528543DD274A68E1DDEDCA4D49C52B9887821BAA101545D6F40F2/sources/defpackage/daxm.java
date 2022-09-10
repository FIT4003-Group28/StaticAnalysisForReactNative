package defpackage;
/* compiled from: PG */
/* renamed from: daxm  reason: default package */
/* loaded from: classes5.dex */
public final class daxm extends dsqw<daxm, daxl> implements dssk {
    public static final daxm e;
    private static volatile dssr<daxm> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        daxm daxmVar = new daxm();
        e = daxmVar;
        dsqw.cc(daxm.class, daxmVar);
    }

    private daxm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new daxm();
            }
            if (i2 == 4) {
                return new daxl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<daxm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (daxm.class) {
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
