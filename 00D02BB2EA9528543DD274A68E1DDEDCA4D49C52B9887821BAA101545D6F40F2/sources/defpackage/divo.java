package defpackage;
/* compiled from: PG */
/* renamed from: divo  reason: default package */
/* loaded from: classes6.dex */
public final class divo extends dsqw<divo, divn> implements dssk {
    public static final divo d;
    private static volatile dssr<divo> f;
    public dnpq a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        divo divoVar = new divo();
        d = divoVar;
        dsqw.cc(divo.class, divoVar);
    }

    private divo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new divo();
            }
            if (i2 == 4) {
                return new divn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (divo.class) {
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
