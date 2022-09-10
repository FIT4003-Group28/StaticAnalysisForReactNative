package defpackage;
/* compiled from: PG */
/* renamed from: djhq  reason: default package */
/* loaded from: classes6.dex */
public final class djhq extends dsqw<djhq, djgx> implements dssk {
    public static final djhq j;
    private static volatile dssr<djhq> k;
    public int a;
    public djgw b;
    public int c;
    public djhh d;
    public djhj e;
    public djhp f;
    public dqec g;
    public djgz h;
    public djhn i;

    static {
        djhq djhqVar = new djhq();
        j = djhqVar;
        dsqw.cc(djhq.class, djhqVar);
    }

    private djhq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0005ဉ\u0005\u0007ဉ\b\bဉ\t\tဌ\u0001\u000bဉ\u0007", new Object[]{"a", "b", "d", "e", "f", "h", "i", "c", dhpj.c(), "g"});
            }
            if (i2 == 3) {
                return new djhq();
            }
            if (i2 == 4) {
                return new djgx();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhq> dssrVar = k;
            if (dssrVar == null) {
                synchronized (djhq.class) {
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
