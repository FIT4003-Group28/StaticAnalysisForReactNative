package defpackage;
/* compiled from: PG */
/* renamed from: dowu  reason: default package */
/* loaded from: classes6.dex */
public final class dowu extends dsqw<dowu, dowt> implements dssk {
    public static final dowu d;
    private static volatile dssr<dowu> f;
    public int a;
    public int b;
    public String c = "";
    private int e;

    static {
        dowu dowuVar = new dowu();
        d = dowuVar;
        dsqw.cc(dowu.class, dowuVar);
    }

    private dowu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dowu();
            }
            if (i2 == 4) {
                return new dowt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dowu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dowu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
