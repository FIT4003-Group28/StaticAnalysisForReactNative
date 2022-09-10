package defpackage;
/* compiled from: PG */
/* renamed from: dsdv  reason: default package */
/* loaded from: classes6.dex */
public final class dsdv extends dsqw<dsdv, dsdu> implements dssk {
    public static final dsdv c;
    private static volatile dssr<dsdv> e;
    public dsef a;
    public dsrj<dsbc> b = dssu.b;
    private int d;

    static {
        dsdv dsdvVar = new dsdv();
        c = dsdvVar;
        dsqw.cc(dsdv.class, dsdvVar);
    }

    private dsdv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"d", "a", "b", dsbc.class});
            }
            if (i2 == 3) {
                return new dsdv();
            }
            if (i2 == 4) {
                return new dsdu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsdv.class) {
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
