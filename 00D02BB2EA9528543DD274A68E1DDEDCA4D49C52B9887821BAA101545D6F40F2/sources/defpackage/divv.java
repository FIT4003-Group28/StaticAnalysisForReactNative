package defpackage;
/* compiled from: PG */
/* renamed from: divv  reason: default package */
/* loaded from: classes6.dex */
public final class divv extends dsqw<divv, divu> implements dssk {
    public static final divv g;
    private static volatile dssr<divv> h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        divv divvVar = new divv();
        g = divvVar;
        dsqw.cc(divv.class, divvVar);
    }

    private divv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new divv();
            }
            if (i2 == 4) {
                return new divu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<divv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (divv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
