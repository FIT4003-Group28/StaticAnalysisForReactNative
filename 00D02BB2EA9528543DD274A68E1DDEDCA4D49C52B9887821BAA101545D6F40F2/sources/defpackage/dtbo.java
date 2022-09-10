package defpackage;
/* compiled from: PG */
/* renamed from: dtbo  reason: default package */
/* loaded from: classes6.dex */
public final class dtbo extends dsqw<dtbo, dtbn> implements dssk {
    public static final dtbo d;
    private static volatile dssr<dtbo> e;
    public int a;
    public double b;
    public double c;

    static {
        dtbo dtboVar = new dtbo();
        d = dtboVar;
        dsqw.cc(dtbo.class, dtboVar);
    }

    private dtbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtbo();
            }
            if (i2 == 4) {
                return new dtbn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtbo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtbo.class) {
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
