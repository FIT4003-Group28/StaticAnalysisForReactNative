package defpackage;
/* compiled from: PG */
/* renamed from: djyx  reason: default package */
/* loaded from: classes6.dex */
public final class djyx extends dsqw<djyx, djyw> implements dssk {
    public static final djyx c;
    private static volatile dssr<djyx> d;
    public int a;
    public dquf b;

    static {
        djyx djyxVar = new djyx();
        c = djyxVar;
        dsqw.cc(djyx.class, djyxVar);
    }

    private djyx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new djyx();
            }
            if (i2 == 4) {
                return new djyw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djyx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djyx.class) {
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
