package defpackage;
/* compiled from: PG */
/* renamed from: dhef  reason: default package */
/* loaded from: classes6.dex */
public final class dhef extends dsqw<dhef, dhee> implements dssk {
    public static final dhef e;
    private static volatile dssr<dhef> f;
    public String a = "";
    public dhfv b;
    public int c;
    public dhdc d;

    static {
        dhef dhefVar = new dhef();
        e = dhefVar;
        dsqw.cc(dhef.class, dhefVar);
    }

    private dhef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001Ȉ\u0004\t\u0005\u0004\t\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhef();
            }
            if (i2 == 4) {
                return new dhee();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhef> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhef.class) {
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
