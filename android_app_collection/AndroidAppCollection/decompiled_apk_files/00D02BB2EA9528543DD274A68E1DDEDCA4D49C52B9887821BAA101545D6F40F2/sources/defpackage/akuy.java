package defpackage;
/* compiled from: PG */
/* renamed from: akuy  reason: default package */
/* loaded from: classes.dex */
public final class akuy extends dsqw<akuy, akux> implements dssk {
    public static final akuy e;
    private static volatile dssr<akuy> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        akuy akuyVar = new akuy();
        e = akuyVar;
        dsqw.cc(akuy.class, akuyVar);
    }

    private akuy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new akuy();
            }
            if (i2 == 4) {
                return new akux();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akuy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (akuy.class) {
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
