package defpackage;
/* compiled from: PG */
/* renamed from: chtu  reason: default package */
/* loaded from: classes4.dex */
public final class chtu extends dsqw<chtu, chtt> implements dssk {
    public static final chtu e;
    private static volatile dssr<chtu> f;
    public int a;
    public int b;
    public dpvw c;
    public dqkh d;

    static {
        chtu chtuVar = new chtu();
        e = chtuVar;
        dsqw.cc(chtu.class, chtuVar);
    }

    private chtu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001င\u0000\u0005ဉ\u0001\u0006ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new chtu();
            }
            if (i2 == 4) {
                return new chtt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chtu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (chtu.class) {
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
