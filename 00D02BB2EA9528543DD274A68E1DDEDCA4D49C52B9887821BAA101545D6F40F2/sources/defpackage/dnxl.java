package defpackage;
/* compiled from: PG */
/* renamed from: dnxl  reason: default package */
/* loaded from: classes.dex */
public final class dnxl extends dsqw<dnxl, dnxk> implements dssk {
    public static final dnxl i;
    private static volatile dssr<dnxl> j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public dnpq f;
    public int g;
    public boolean h;

    static {
        dnxl dnxlVar = new dnxl();
        i = dnxlVar;
        dsqw.cc(dnxl.class, dnxlVar);
    }

    private dnxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဈ\u0003\u0002ဈ\u0004\u0003ဉ\u0005\u0005ဈ\u0001\u0006ဈ\u0002\u0007ဌ\u0006\tဇ\b", new Object[]{"a", "d", "e", "f", "b", "c", "g", dpwt.c(), "h"});
            }
            if (i3 == 3) {
                return new dnxl();
            }
            if (i3 == 4) {
                return new dnxk();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnxl> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dnxl.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
