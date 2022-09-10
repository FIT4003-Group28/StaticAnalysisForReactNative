package defpackage;
/* compiled from: PG */
/* renamed from: dgxx  reason: default package */
/* loaded from: classes6.dex */
public final class dgxx extends dsqw<dgxx, dgxw> implements dssk {
    public static final dgxx d;
    private static volatile dssr<dgxx> e;
    public int a;
    public long b;
    public long c;

    static {
        dgxx dgxxVar = new dgxx();
        d = dgxxVar;
        dsqw.cc(dgxx.class, dgxxVar);
    }

    private dgxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dgxx();
            }
            if (i2 == 4) {
                return new dgxw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgxx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgxx.class) {
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
