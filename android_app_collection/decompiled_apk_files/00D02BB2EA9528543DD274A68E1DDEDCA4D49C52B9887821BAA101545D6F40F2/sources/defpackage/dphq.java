package defpackage;
/* compiled from: PG */
/* renamed from: dphq  reason: default package */
/* loaded from: classes.dex */
public final class dphq extends dsqw<dphq, dphm> implements dssk {
    public static final dphq m;
    private static volatile dssr<dphq> n;
    public int a;
    public dphl d;
    public boolean e;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public int b = 6;
    public int c = 1;
    public boolean f = true;

    static {
        dphq dphqVar = new dphq();
        m = dphqVar;
        dsqw.cc(dphq.class, dphqVar);
    }

    private dphq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0004\u0004ဇ\u0006\u0005ဌ\t\u0006ဇ\n\u0007ဇ\u0003\bဇ\u0007\nဇ\b\u000bဇ\u0005\fဉ\u0002", new Object[]{"a", "b", dqvj.d(), "c", dphn.a, "f", "h", "k", dphp.a, "l", "e", "i", "j", "g", "d"});
            }
            if (i2 == 3) {
                return new dphq();
            }
            if (i2 == 4) {
                return new dphm();
            }
            if (i2 == 5) {
                return m;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dphq> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dphq.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(m);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
