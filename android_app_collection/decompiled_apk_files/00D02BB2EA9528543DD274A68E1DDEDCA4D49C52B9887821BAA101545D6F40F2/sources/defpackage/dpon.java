package defpackage;
/* compiled from: PG */
/* renamed from: dpon  reason: default package */
/* loaded from: classes6.dex */
public final class dpon extends dsqw<dpon, dpom> implements dssk {
    public static final dpon d;
    private static volatile dssr<dpon> e;
    public int a;
    public long b;
    public long c;

    static {
        dpon dponVar = new dpon();
        d = dponVar;
        dsqw.cc(dpon.class, dponVar);
    }

    private dpon() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dpon();
            }
            if (i2 == 4) {
                return new dpom();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpon> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpon.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
