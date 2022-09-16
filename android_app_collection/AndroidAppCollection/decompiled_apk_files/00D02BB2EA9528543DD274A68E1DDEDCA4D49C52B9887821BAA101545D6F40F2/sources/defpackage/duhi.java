package defpackage;
/* compiled from: PG */
/* renamed from: duhi  reason: default package */
/* loaded from: classes6.dex */
public final class duhi extends dsqw<duhi, duhh> implements dssk {
    public static final duhi e;
    private static volatile dssr<duhi> f;
    public double a;
    public double b;
    public double c;
    public double d;

    static {
        duhi duhiVar = new duhi();
        e = duhiVar;
        dsqw.cc(duhi.class, duhiVar);
    }

    private duhi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000\u0004\u0000", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duhi();
            }
            if (i2 == 4) {
                return new duhh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duhi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duhi.class) {
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
