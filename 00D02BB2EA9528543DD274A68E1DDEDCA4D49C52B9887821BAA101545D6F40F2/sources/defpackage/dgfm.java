package defpackage;
/* compiled from: PG */
/* renamed from: dgfm  reason: default package */
/* loaded from: classes6.dex */
public final class dgfm extends dsqw<dgfm, dgfl> implements dssk {
    public static final dgfm f;
    private static volatile dssr<dgfm> g;
    public int a;
    public duha b;
    public dsrj<dgfq> c = dssu.b;
    public boolean d;
    public dgfu e;

    static {
        dgfm dgfmVar = new dgfm();
        f = dgfmVar;
        dsqw.cc(dgfm.class, dgfmVar);
    }

    private dgfm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0001\u0000\u0003ဉ\u0002\u0004\u001b\u0005ဇ\u0003\u0007ဉ\u0005", new Object[]{"a", "b", "c", dgfq.class, "d", "e"});
            }
            if (i2 == 3) {
                return new dgfm();
            }
            if (i2 == 4) {
                return new dgfl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfm> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgfm.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
