package defpackage;
/* compiled from: PG */
/* renamed from: dnjy  reason: default package */
/* loaded from: classes6.dex */
public final class dnjy extends dsqw<dnjy, dnjt> implements dssk {
    public static final dnjy j;
    private static volatile dssr<dnjy> k;
    public int a;
    public dnjv b;
    public dnjv c;
    public int d;
    public String e = "";
    public String f = "";
    public dnpq g;
    public dnpq h;
    public dnwd i;

    static {
        dnjy dnjyVar = new dnjy();
        j = dnjyVar;
        dsqw.cc(dnjy.class, dnjyVar);
    }

    private dnjy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0004\u0010\b\u0000\u0000\u0000\u0004ဈ\u0004\u0007ဈ\u0005\nဉ\t\u000bဉ\u0000\fဉ\u0001\rဌ\u0002\u000eဉ\u0007\u0010ဉ\u000b", new Object[]{"a", "e", "f", "h", "b", "c", "d", dnjw.a, "g", "i"});
            }
            if (i2 == 3) {
                return new dnjy();
            }
            if (i2 == 4) {
                return new dnjt();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnjy> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dnjy.class) {
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
