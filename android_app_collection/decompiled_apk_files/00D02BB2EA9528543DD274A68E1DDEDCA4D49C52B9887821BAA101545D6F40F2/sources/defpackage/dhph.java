package defpackage;
/* compiled from: PG */
/* renamed from: dhph  reason: default package */
/* loaded from: classes6.dex */
public final class dhph extends dsqw<dhph, dhpg> implements dssk {
    public static final dhph e;
    private static volatile dssr<dhph> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dhph dhphVar = new dhph();
        e = dhphVar;
        dsqw.cc(dhph.class, dhphVar);
    }

    private dhph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhph();
            }
            if (i2 == 4) {
                return new dhpg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhph> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhph.class) {
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
