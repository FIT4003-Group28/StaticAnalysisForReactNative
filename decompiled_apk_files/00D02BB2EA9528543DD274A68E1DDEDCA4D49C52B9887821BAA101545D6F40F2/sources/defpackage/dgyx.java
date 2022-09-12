package defpackage;
/* compiled from: PG */
/* renamed from: dgyx  reason: default package */
/* loaded from: classes6.dex */
public final class dgyx extends dsqw<dgyx, dgyw> implements dssk {
    public static final dgyx a;
    private static volatile dssr<dgyx> b;

    static {
        dgyx dgyxVar = new dgyx();
        a = dgyxVar;
        dsqw.cc(dgyx.class, dgyxVar);
    }

    private dgyx() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgyx();
            }
            if (i2 == 4) {
                return new dgyw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgyx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgyx.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
