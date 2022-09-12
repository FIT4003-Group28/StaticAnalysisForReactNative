package defpackage;
/* compiled from: PG */
/* renamed from: djwq  reason: default package */
/* loaded from: classes6.dex */
public final class djwq extends dsqw<djwq, djwp> implements dssk {
    public static final djwq c;
    private static volatile dssr<djwq> e;
    public String a = "";
    public drhh b;
    private int d;

    static {
        djwq djwqVar = new djwq();
        c = djwqVar;
        dsqw.cc(djwq.class, djwqVar);
    }

    private djwq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djwq();
            }
            if (i2 == 4) {
                return new djwp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djwq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djwq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
