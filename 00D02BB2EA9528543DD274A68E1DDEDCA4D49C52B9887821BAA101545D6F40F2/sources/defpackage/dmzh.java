package defpackage;
/* compiled from: PG */
/* renamed from: dmzh  reason: default package */
/* loaded from: classes6.dex */
public final class dmzh extends dsqw<dmzh, dmzb> implements dssk {
    public static final dmzh e;
    private static volatile dssr<dmzh> f;
    public int a;
    public int b;
    public dmzf c;
    public dmzf d;

    static {
        dmzh dmzhVar = new dmzh();
        e = dmzhVar;
        dsqw.cc(dmzh.class, dmzhVar);
    }

    private dmzh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0000\u0000\u0001ဌ\u0000\rဉ\u0002\u000fဉ\u0001", new Object[]{"a", "b", dmzg.a, "d", "c"});
            }
            if (i2 == 3) {
                return new dmzh();
            }
            if (i2 == 4) {
                return new dmzb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmzh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
