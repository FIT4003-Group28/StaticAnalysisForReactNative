package defpackage;
/* compiled from: PG */
/* renamed from: ddcf  reason: default package */
/* loaded from: classes.dex */
public final class ddcf extends dsqw<ddcf, ddbz> implements dssk {
    public static final ddcf k;
    private static volatile dssr<ddcf> l;
    public int a;
    public int c;
    public int d;
    public ddcc h;
    public int j;
    public String b = "";
    public dsrj<String> e = dssu.b;
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        ddcf ddcfVar = new ddcf();
        k = ddcfVar;
        dsqw.cc(ddcf.class, ddcfVar);
    }

    private ddcf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u0011\t\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0007\u001a\u000bဈ\t\fဉ\u000b\u000eဈ\f\u0010ဈ\n\u0011ဌ\u000e", new Object[]{"a", "b", "c", ddca.a, "d", "e", "f", "h", "i", "g", "j", ddce.c()});
            }
            if (i2 == 3) {
                return new ddcf();
            }
            if (i2 == 4) {
                return new ddbz();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddcf> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ddcf.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
