package defpackage;
/* compiled from: PG */
/* renamed from: djct  reason: default package */
/* loaded from: classes6.dex */
public final class djct extends dsqw<djct, djcs> implements dssk {
    public static final djct d;
    private static volatile dssr<djct> f;
    public drdg a;
    public dqlg b;
    public dqdw c;
    private int e;

    static {
        djct djctVar = new djct();
        d = djctVar;
        dsqw.cc(djct.class, djctVar);
    }

    private djct() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new djct();
            }
            if (i2 == 4) {
                return new djcs();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djct> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djct.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
