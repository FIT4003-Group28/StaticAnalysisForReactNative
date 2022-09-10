package defpackage;
/* compiled from: PG */
/* renamed from: ddvs  reason: default package */
/* loaded from: classes6.dex */
public final class ddvs extends dsqw<ddvs, ddvr> implements dssk {
    public static final ddvs g;
    private static volatile dssr<ddvs> h;
    public int a;
    public int b = 0;
    public Object c;
    public boolean d;
    public dstv e;
    public ddxc f;

    static {
        ddvs ddvsVar = new ddvs();
        g = ddvsVar;
        dsqw.cc(ddvs.class, ddvsVar);
    }

    private ddvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001$\u0001\u0001\u0001%$\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0004ဉ\u0002\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000\u0016ြ\u0000\u0017ြ\u0000\u0018ြ\u0000\u0019ြ\u0000\u001aြ\u0000\u001bြ\u0000\u001cြ\u0000\u001dြ\u0000\u001eြ\u0000\u001fြ\u0000 ြ\u0000!ြ\u0000\"ြ\u0000#ြ\u0000$ြ\u0000%ြ\u0000", new Object[]{"c", "b", "a", "d", "e", "f", ddvj.class, ddvc.class, ddvf.class, ddwy.class, ddtn.class, ddxg.class, ddts.class, ddtq.class, ddtu.class, ddwn.class, dduu.class, ddwk.class, ddua.class, ddum.class, ddva.class, dduy.class, ddwp.class, ddww.class, ddxe.class, dduw.class, ddwf.class, ddus.class, ddty.class, ddxo.class, ddue.class, dduc.class, ddxi.class, ddvh.class, ddvp.class, ddtk.class, ddxs.class, ddxk.class, ddwh.class});
            }
            if (i2 == 3) {
                return new ddvs();
            }
            if (i2 == 4) {
                return new ddvr();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddvs> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddvs.class) {
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
