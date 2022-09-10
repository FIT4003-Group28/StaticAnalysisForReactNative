package defpackage;
/* compiled from: PG */
/* renamed from: cxfr  reason: default package */
/* loaded from: classes5.dex */
public final class cxfr extends dsqw<cxfr, cxfq> implements dssk {
    public static final cxfr g;
    public static final dsqv<cxfl, cxfr> h;
    private static volatile dssr<cxfr> i;
    public int a;
    public boolean d;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        cxfr cxfrVar = new cxfr();
        g = cxfrVar;
        dsqw.cc(cxfr.class, cxfrVar);
        h = dsqw.newSingularGeneratedExtension(cxfl.c, cxfrVar, cxfrVar, null, 334728578, dsur.MESSAGE, cxfr.class);
    }

    private cxfr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new cxfr();
            }
            if (i3 == 4) {
                return new cxfq();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<cxfr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (cxfr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
