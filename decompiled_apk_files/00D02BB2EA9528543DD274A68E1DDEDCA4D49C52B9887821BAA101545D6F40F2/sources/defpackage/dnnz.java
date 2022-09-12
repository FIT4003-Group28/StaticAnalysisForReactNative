package defpackage;
/* compiled from: PG */
/* renamed from: dnnz  reason: default package */
/* loaded from: classes6.dex */
public final class dnnz extends dsqw<dnnz, dnny> implements dssk {
    public static final dnnz g;
    private static volatile dssr<dnnz> i;
    public dnjl a;
    public dnjl b;
    public String c = "";
    public int d;
    public dnpq e;
    public dnwd f;
    private int h;

    static {
        dnnz dnnzVar = new dnnz();
        g = dnnzVar;
        dsqw.cc(dnnz.class, dnnzVar);
    }

    private dnnz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0007င\u0004\bဈ\u0002\nဉ\u0006\fဉ\b", new Object[]{"h", "a", "b", "d", "c", "e", "f"});
            }
            if (i3 == 3) {
                return new dnnz();
            }
            if (i3 == 4) {
                return new dnny();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dnnz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dnnz.class) {
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
