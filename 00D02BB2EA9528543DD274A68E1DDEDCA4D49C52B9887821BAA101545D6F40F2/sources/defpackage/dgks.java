package defpackage;
/* compiled from: PG */
/* renamed from: dgks  reason: default package */
/* loaded from: classes6.dex */
public final class dgks extends dsqw<dgks, dgkr> implements dssk {
    public static final dgks c;
    private static volatile dssr<dgks> d;
    public int a;
    public String b = "";

    static {
        dgks dgksVar = new dgks();
        c = dgksVar;
        dsqw.cc(dgks.class, dgksVar);
    }

    private dgks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgks();
            }
            if (i2 == 4) {
                return new dgkr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgks> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgks.class) {
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
