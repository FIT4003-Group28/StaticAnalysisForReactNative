package defpackage;
/* compiled from: PG */
/* renamed from: dppi  reason: default package */
/* loaded from: classes6.dex */
public final class dppi extends dsqw<dppi, dppf> implements dssk {
    public static final dppi h;
    private static volatile dssr<dppi> i;
    public int a;
    public int c;
    public dppv d;
    public dpph g;
    public String b = "";
    public String e = "";
    public String f = "";

    static {
        dppi dppiVar = new dppi();
        h = dppiVar;
        dsqw.cc(dppi.class, dppiVar);
    }

    private dppi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", dpuk.c(), "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dppi();
            }
            if (i3 == 4) {
                return new dppf();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dppi> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dppi.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
