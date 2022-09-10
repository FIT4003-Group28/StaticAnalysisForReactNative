package defpackage;
/* compiled from: PG */
/* renamed from: dhsf  reason: default package */
/* loaded from: classes6.dex */
public final class dhsf extends dsqw<dhsf, dhse> implements dssk {
    public static final dhsf e;
    private static volatile dssr<dhsf> f;
    public int a;
    public dmcc b;
    public int c;
    public drfu d;

    static {
        dhsf dhsfVar = new dhsf();
        e = dhsfVar;
        dsqw.cc(dhsf.class, dhsfVar);
    }

    private dhsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dhsf();
            }
            if (i2 == 4) {
                return new dhse();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhsf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dhsf.class) {
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
