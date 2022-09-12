package defpackage;
/* compiled from: PG */
/* renamed from: dhry  reason: default package */
/* loaded from: classes6.dex */
public final class dhry extends dsqw<dhry, dhrv> implements dssk {
    public static final dhry c;
    private static volatile dssr<dhry> e;
    public int a;
    public String b = "";
    private int d;

    static {
        dhry dhryVar = new dhry();
        c = dhryVar;
        dsqw.cc(dhry.class, dhryVar);
    }

    private dhry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", dhrw.a, "b"});
            }
            if (i2 == 3) {
                return new dhry();
            }
            if (i2 == 4) {
                return new dhrv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhry> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dhry.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
