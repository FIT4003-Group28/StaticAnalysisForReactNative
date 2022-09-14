package defpackage;
/* compiled from: PG */
/* renamed from: ckwz  reason: default package */
/* loaded from: classes5.dex */
public final class ckwz extends dsqw<ckwz, ckwy> implements dssk {
    public static final ckwz e;
    private static volatile dssr<ckwz> f;
    public int a;
    public ckvz b;
    public double c;
    public long d;

    static {
        ckwz ckwzVar = new ckwz();
        e = ckwzVar;
        dsqw.cc(ckwz.class, ckwzVar);
    }

    private ckwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ckwz();
            }
            if (i2 == 4) {
                return new ckwy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckwz.class) {
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
