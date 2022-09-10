package defpackage;
/* compiled from: PG */
/* renamed from: dgos  reason: default package */
/* loaded from: classes6.dex */
public final class dgos extends dsqw<dgos, dgor> implements dssk {
    public static final dgos a;
    private static volatile dssr<dgos> b;

    static {
        dgos dgosVar = new dgos();
        a = dgosVar;
        dsqw.cc(dgos.class, dgosVar);
    }

    private dgos() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dgos();
            }
            if (i2 == 4) {
                return new dgor();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgos> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dgos.class) {
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
