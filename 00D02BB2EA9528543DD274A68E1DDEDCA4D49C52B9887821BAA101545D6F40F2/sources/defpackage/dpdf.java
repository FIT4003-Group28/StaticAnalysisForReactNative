package defpackage;
/* compiled from: PG */
/* renamed from: dpdf  reason: default package */
/* loaded from: classes6.dex */
public final class dpdf extends dsqw<dpdf, dpcy> implements dssk {
    public static final dpdf i;
    private static volatile dssr<dpdf> j;
    public int a;
    public Object c;
    public int d;
    public int g;
    public dpdc h;
    public int b = 0;
    public String e = "";
    public dsrj<dotj> f = dssu.b;

    static {
        dpdf dpdfVar = new dpdf();
        i = dpdfVar;
        dsqw.cc(dpdf.class, dpdfVar);
    }

    private dpdf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004င\u0002\u0005ဉ\u0003\u0006ြ\u0000", new Object[]{"c", "b", "a", "d", dpdd.a, "e", "f", dotj.class, "g", "h", dpda.class});
            }
            if (i3 == 3) {
                return new dpdf();
            }
            if (i3 == 4) {
                return new dpcy();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dpdf> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dpdf.class) {
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
