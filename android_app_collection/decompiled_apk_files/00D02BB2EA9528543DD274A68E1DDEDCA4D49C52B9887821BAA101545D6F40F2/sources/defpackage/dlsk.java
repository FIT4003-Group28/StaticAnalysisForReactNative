package defpackage;
/* compiled from: PG */
/* renamed from: dlsk  reason: default package */
/* loaded from: classes6.dex */
public final class dlsk extends dsqw<dlsk, dlsj> implements dssk {
    public static final dlsk b;
    private static volatile dssr<dlsk> d;
    public long a;
    private int c;

    static {
        dlsk dlskVar = new dlsk();
        b = dlskVar;
        dsqw.cc(dlsk.class, dlskVar);
    }

    private dlsk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlsk();
            }
            if (i2 == 4) {
                return new dlsj();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsk.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
