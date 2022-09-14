package defpackage;
/* compiled from: PG */
/* renamed from: dufi  reason: default package */
/* loaded from: classes6.dex */
public final class dufi extends dsqw<dufi, dufh> implements dssk {
    public static final dufi e;
    private static volatile dssr<dufi> g;
    public dufm a;
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        dufi dufiVar = new dufi();
        e = dufiVar;
        dsqw.cc(dufi.class, dufiVar);
    }

    private dufi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဈ\u0004\u0005ဈ\u0005", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dufi();
            }
            if (i2 == 4) {
                return new dufh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dufi.class) {
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
