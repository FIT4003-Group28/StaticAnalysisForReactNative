package defpackage;
/* compiled from: PG */
/* renamed from: dldw  reason: default package */
/* loaded from: classes6.dex */
public final class dldw extends dsqw<dldw, dldv> implements dssk {
    public static final dldw g;
    private static volatile dssr<dldw> i;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    private int h;

    static {
        dldw dldwVar = new dldw();
        g = dldwVar;
        dsqw.cc(dldw.class, dldwVar);
    }

    private dldw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဈ\u0001\u0006ဈ\u0003", new Object[]{"h", "a", "c", "e", "f", "b", "d"});
            }
            if (i3 == 3) {
                return new dldw();
            }
            if (i3 == 4) {
                return new dldv();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dldw> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dldw.class) {
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
