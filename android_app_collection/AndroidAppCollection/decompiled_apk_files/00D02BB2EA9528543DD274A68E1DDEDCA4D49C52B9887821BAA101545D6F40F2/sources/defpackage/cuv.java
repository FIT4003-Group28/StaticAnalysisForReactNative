package defpackage;
/* compiled from: PG */
/* renamed from: cuv  reason: default package */
/* loaded from: classes5.dex */
public final class cuv extends dsqw<cuv, cuu> implements dssk {
    public static final cuv j;
    private static volatile dssr<cuv> k;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        cuv cuvVar = new cuv();
        j = cuvVar;
        dsqw.cc(cuv.class, cuvVar);
    }

    private cuv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new cuv();
            }
            if (i2 == 4) {
                return new cuu();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cuv> dssrVar = k;
            if (dssrVar == null) {
                synchronized (cuv.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
