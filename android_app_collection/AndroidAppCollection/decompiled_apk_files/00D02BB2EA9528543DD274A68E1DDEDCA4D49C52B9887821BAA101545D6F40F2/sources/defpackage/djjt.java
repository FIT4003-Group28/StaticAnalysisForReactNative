package defpackage;
/* compiled from: PG */
/* renamed from: djjt  reason: default package */
/* loaded from: classes6.dex */
public final class djjt extends dsqw<djjt, djjs> implements dssk {
    public static final djjt c;
    private static volatile dssr<djjt> d;
    public int a;
    public String b = "";

    static {
        djjt djjtVar = new djjt();
        c = djjtVar;
        dsqw.cc(djjt.class, djjtVar);
    }

    private djjt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djjt();
            }
            if (i2 == 4) {
                return new djjs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djjt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djjt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
