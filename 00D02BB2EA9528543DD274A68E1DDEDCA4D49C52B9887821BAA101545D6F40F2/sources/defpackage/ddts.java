package defpackage;
/* compiled from: PG */
/* renamed from: ddts  reason: default package */
/* loaded from: classes6.dex */
public final class ddts extends dsqw<ddts, ddtr> implements dssk {
    public static final ddts d;
    private static volatile dssr<ddts> e;
    public int a;
    public ddxq b;
    public int c = 1;

    static {
        ddts ddtsVar = new ddts();
        d = ddtsVar;
        dsqw.cc(ddts.class, ddtsVar);
    }

    private ddts() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dqum.c()});
            }
            if (i2 == 3) {
                return new ddts();
            }
            if (i2 == 4) {
                return new ddtr();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddts> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddts.class) {
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
