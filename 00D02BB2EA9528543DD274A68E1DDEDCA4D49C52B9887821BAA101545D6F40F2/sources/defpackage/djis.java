package defpackage;
/* compiled from: PG */
/* renamed from: djis  reason: default package */
/* loaded from: classes6.dex */
public final class djis extends dsqw<djis, djir> implements dssk {
    public static final djis d;
    private static volatile dssr<djis> f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        djis djisVar = new djis();
        d = djisVar;
        dsqw.cc(djis.class, djisVar);
    }

    private djis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djis();
            }
            if (i2 == 4) {
                return new djir();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djis> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djis.class) {
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
