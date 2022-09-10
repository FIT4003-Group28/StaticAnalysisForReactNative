package defpackage;
/* compiled from: PG */
/* renamed from: dozq  reason: default package */
/* loaded from: classes6.dex */
public final class dozq extends dsqw<dozq, dozp> implements dssk {
    public static final dozq e;
    private static volatile dssr<dozq> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dozq dozqVar = new dozq();
        e = dozqVar;
        dsqw.cc(dozq.class, dozqVar);
    }

    private dozq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", dmqc.c(), "c", dmqc.c(), "d", dmqc.c()});
            }
            if (i2 == 3) {
                return new dozq();
            }
            if (i2 == 4) {
                return new dozp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dozq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
