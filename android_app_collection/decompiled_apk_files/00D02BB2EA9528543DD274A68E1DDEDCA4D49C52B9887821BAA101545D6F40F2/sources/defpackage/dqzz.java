package defpackage;
/* compiled from: PG */
/* renamed from: dqzz  reason: default package */
/* loaded from: classes6.dex */
public final class dqzz extends dsqw<dqzz, dqzy> implements dssk {
    public static final dqzz e;
    private static volatile dssr<dqzz> f;
    public int a;
    public dqyj b;
    public boolean c;
    public boolean d;

    static {
        dqzz dqzzVar = new dqzz();
        e = dqzzVar;
        dsqw.cc(dqzz.class, dqzzVar);
    }

    private dqzz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqzz();
            }
            if (i2 == 4) {
                return new dqzy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqzz.class) {
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
