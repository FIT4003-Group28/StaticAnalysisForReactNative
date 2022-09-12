package defpackage;
/* compiled from: PG */
/* renamed from: dczt  reason: default package */
/* loaded from: classes5.dex */
public final class dczt extends dsqw<dczt, dczs> implements dssk {
    public static final dczt b;
    private static volatile dssr<dczt> d;
    public String a = "";
    private int c;

    static {
        dczt dcztVar = new dczt();
        b = dcztVar;
        dsqw.cc(dczt.class, dcztVar);
    }

    private dczt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dczt();
            }
            if (i2 == 4) {
                return new dczs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dczt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dczt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
