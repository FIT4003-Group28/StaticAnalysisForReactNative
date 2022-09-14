package defpackage;
/* compiled from: PG */
/* renamed from: drir  reason: default package */
/* loaded from: classes6.dex */
public final class drir extends dsqw<drir, driq> implements dssk {
    public static final drir d;
    private static volatile dssr<drir> f;
    public drdg b;
    private int e;
    public String a = "";
    public String c = "";

    static {
        drir drirVar = new drir();
        d = drirVar;
        dsqw.cc(drir.class, drirVar);
    }

    private drir() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new drir();
            }
            if (i2 == 4) {
                return new driq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drir> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drir.class) {
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
