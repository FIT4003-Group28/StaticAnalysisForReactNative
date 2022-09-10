package defpackage;
/* compiled from: PG */
/* renamed from: dvcl  reason: default package */
/* loaded from: classes6.dex */
public final class dvcl extends dsqw<dvcl, dvck> implements dssk {
    public static final dvcl g;
    private static volatile dssr<dvcl> h;
    public int a;
    public dxdm b;
    public long c;
    public boolean d = true;
    public String e = "";
    public dsrj<dvcn> f = dssu.b;

    static {
        dvcl dvclVar = new dvcl();
        g = dvclVar;
        dsqw.cc(dvcl.class, dvclVar);
    }

    private dvcl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", dvcn.class});
            }
            if (i2 == 3) {
                return new dvcl();
            }
            if (i2 == 4) {
                return new dvck();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvcl.class) {
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
