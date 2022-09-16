package defpackage;
/* compiled from: PG */
/* renamed from: dgyl  reason: default package */
/* loaded from: classes6.dex */
public final class dgyl extends dsqw<dgyl, dgyk> implements dssk {
    public static final dgyl c;
    private static volatile dssr<dgyl> d;
    public int a;
    public int b;

    static {
        dgyl dgylVar = new dgyl();
        c = dgylVar;
        dsqw.cc(dgyl.class, dgylVar);
    }

    private dgyl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dgyh.a});
            }
            if (i2 == 3) {
                return new dgyl();
            }
            if (i2 == 4) {
                return new dgyk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgyl.class) {
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
