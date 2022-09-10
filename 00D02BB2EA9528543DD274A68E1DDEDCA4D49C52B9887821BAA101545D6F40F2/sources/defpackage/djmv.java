package defpackage;
/* compiled from: PG */
/* renamed from: djmv  reason: default package */
/* loaded from: classes6.dex */
public final class djmv extends dsqw<djmv, djmu> implements dssk {
    public static final djmv c;
    private static volatile dssr<djmv> d;
    public int a = 0;
    public Object b;

    static {
        djmv djmvVar = new djmv();
        c = djmvVar;
        dsqw.cc(djmv.class, djmvVar);
    }

    private djmv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001 \u0001\u0000\u0001$ \u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ြ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000\u0016ြ\u0000\u0017ြ\u0000\u0018ြ\u0000\u0019ြ\u0000\u001aြ\u0000\u001bြ\u0000\u001cြ\u0000\u001dြ\u0000\u001eြ\u0000#ြ\u0000$ြ\u0000", new Object[]{"b", "a", djmr.class, djny.class, djmf.class, djle.class, djjt.class, djlu.class, djoi.class, djmt.class, djlj.class, djnr.class, djno.class, djoe.class, djkn.class, djki.class, djkc.class, djkg.class, djog.class, djjl.class, djkk.class, djkp.class, djnm.class, djll.class, djlp.class, djky.class, djlh.class, djln.class, djjp.class, djjr.class, djkv.class, djke.class, djjz.class, djla.class});
            }
            if (i2 == 3) {
                return new djmv();
            }
            if (i2 == 4) {
                return new djmu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djmv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djmv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
