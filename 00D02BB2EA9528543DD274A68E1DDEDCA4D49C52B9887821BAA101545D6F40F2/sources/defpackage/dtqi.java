package defpackage;
/* compiled from: PG */
/* renamed from: dtqi  reason: default package */
/* loaded from: classes6.dex */
public final class dtqi extends dsqw<dtqi, dtqh> implements dssk {
    public static final dtqi d;
    private static volatile dssr<dtqi> e;
    public int a;
    public long b;
    public int c;

    static {
        dtqi dtqiVar = new dtqi();
        d = dtqiVar;
        dsqw.cc(dtqi.class, dtqiVar);
    }

    private dtqi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtqi();
            }
            if (i2 == 4) {
                return new dtqh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtqi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtqi.class) {
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
