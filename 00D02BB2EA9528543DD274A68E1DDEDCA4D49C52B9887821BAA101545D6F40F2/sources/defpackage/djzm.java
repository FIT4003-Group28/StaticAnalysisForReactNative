package defpackage;
/* compiled from: PG */
/* renamed from: djzm  reason: default package */
/* loaded from: classes6.dex */
public final class djzm extends dsqw<djzm, djzl> implements dssk {
    public static final djzm c;
    private static volatile dssr<djzm> d;
    public int a;
    public dwpk b;

    static {
        djzm djzmVar = new djzm();
        c = djzmVar;
        dsqw.cc(djzm.class, djzmVar);
    }

    private djzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djzm();
            }
            if (i2 == 4) {
                return new djzl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djzm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djzm.class) {
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
