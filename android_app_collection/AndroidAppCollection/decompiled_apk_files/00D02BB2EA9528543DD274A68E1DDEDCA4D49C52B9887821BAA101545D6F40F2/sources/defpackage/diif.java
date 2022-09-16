package defpackage;
/* compiled from: PG */
/* renamed from: diif  reason: default package */
/* loaded from: classes6.dex */
public final class diif extends dsqw<diif, diie> implements dssk {
    public static final diif g;
    private static volatile dssr<diif> i;
    public dihv a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    private int h;

    static {
        diif diifVar = new diif();
        g = diifVar;
        dsqw.cc(diif.class, diifVar);
    }

    private diif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new diif();
            }
            if (i3 == 4) {
                return new diie();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<diif> dssrVar = i;
            if (dssrVar == null) {
                synchronized (diif.class) {
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
