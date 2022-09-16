package defpackage;
/* compiled from: PG */
/* renamed from: dhnv  reason: default package */
/* loaded from: classes6.dex */
public final class dhnv extends dsqw<dhnv, dhnu> implements dssk {
    public static final dhnv c;
    private static volatile dssr<dhnv> d;
    public int a;
    public int b;

    static {
        dhnv dhnvVar = new dhnv();
        c = dhnvVar;
        dsqw.cc(dhnv.class, dhnvVar);
    }

    private dhnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dpvf.c()});
            }
            if (i2 == 3) {
                return new dhnv();
            }
            if (i2 == 4) {
                return new dhnu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhnv.class) {
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
