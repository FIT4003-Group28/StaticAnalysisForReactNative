package defpackage;
/* compiled from: PG */
/* renamed from: dhwy  reason: default package */
/* loaded from: classes6.dex */
public final class dhwy extends dsqw<dhwy, dhwv> implements dssk {
    public static final dhwy d;
    private static volatile dssr<dhwy> f;
    public dhwx a;
    public String b = "";
    public String c = "";
    private int e;

    static {
        dhwy dhwyVar = new dhwy();
        d = dhwyVar;
        dsqw.cc(dhwy.class, dhwyVar);
    }

    private dhwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dhwy();
            }
            if (i2 == 4) {
                return new dhwv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhwy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhwy.class) {
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
