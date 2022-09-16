package defpackage;
/* compiled from: PG */
/* renamed from: dlse  reason: default package */
/* loaded from: classes6.dex */
public final class dlse extends dsqw<dlse, dlsd> implements dssk {
    public static final dlse c;
    private static volatile dssr<dlse> e;
    public long a;
    public int b;
    private int d;

    static {
        dlse dlseVar = new dlse();
        c = dlseVar;
        dsqw.cc(dlse.class, dlseVar);
    }

    private dlse() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဌ\u0002\u0004ဂ\u0001", new Object[]{"d", "b", dluv.a, "a"});
            }
            if (i2 == 3) {
                return new dlse();
            }
            if (i2 == 4) {
                return new dlsd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlse> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlse.class) {
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
