package defpackage;
/* compiled from: PG */
/* renamed from: dppz  reason: default package */
/* loaded from: classes6.dex */
public final class dppz extends dsqw<dppz, dppw> implements dssk {
    public static final dppz c;
    private static volatile dssr<dppz> d;
    public int a;
    public int b;

    static {
        dppz dppzVar = new dppz();
        c = dppzVar;
        dsqw.cc(dppz.class, dppzVar);
    }

    private dppz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dppy.c()});
            }
            if (i2 == 3) {
                return new dppz();
            }
            if (i2 == 4) {
                return new dppw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dppz.class) {
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
