package defpackage;
/* compiled from: PG */
/* renamed from: chvu  reason: default package */
/* loaded from: classes4.dex */
public final class chvu extends dsqw<chvu, chvt> implements dssk {
    public static final chvu e;
    private static volatile dssr<chvu> f;
    public int a;
    public dppt b;
    public drdg c;
    public dpvc d;

    static {
        chvu chvuVar = new chvu();
        e = chvuVar;
        dsqw.cc(chvu.class, chvuVar);
    }

    private chvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new chvu();
            }
            if (i2 == 4) {
                return new chvt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chvu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chvu.class) {
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
