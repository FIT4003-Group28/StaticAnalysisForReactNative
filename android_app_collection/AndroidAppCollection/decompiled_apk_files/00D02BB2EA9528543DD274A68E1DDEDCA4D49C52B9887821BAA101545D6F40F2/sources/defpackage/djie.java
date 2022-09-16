package defpackage;
/* compiled from: PG */
/* renamed from: djie  reason: default package */
/* loaded from: classes6.dex */
public final class djie extends dsqw<djie, djib> implements dssk {
    public static final djie k;
    private static volatile dssr<djie> l;
    public int a;
    public String b = "";
    public String c = "";
    public djja d;
    public djiu e;
    public dhph f;
    public dqmr g;
    public dhwg h;
    public int i;
    public int j;

    static {
        djie djieVar = new djie();
        k = djieVar;
        dsqw.cc(djie.class, djieVar);
    }

    private djie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bင\u0007\tဌ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", djic.a});
            }
            if (i2 == 3) {
                return new djie();
            }
            if (i2 == 4) {
                return new djib();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djie> dssrVar = l;
            if (dssrVar == null) {
                synchronized (djie.class) {
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
