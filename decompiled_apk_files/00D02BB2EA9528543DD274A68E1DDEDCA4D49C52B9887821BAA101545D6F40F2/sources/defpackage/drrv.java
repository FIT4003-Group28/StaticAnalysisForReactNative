package defpackage;
/* compiled from: PG */
/* renamed from: drrv  reason: default package */
/* loaded from: classes6.dex */
public final class drrv extends dsqw<drrv, drru> implements dssk {
    public static final drrv c;
    private static volatile dssr<drrv> d;
    public int a;
    public String b = "";

    static {
        drrv drrvVar = new drrv();
        c = drrvVar;
        dsqw.cc(drrv.class, drrvVar);
    }

    private drrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drrv();
            }
            if (i2 == 4) {
                return new drru();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drrv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drrv.class) {
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
