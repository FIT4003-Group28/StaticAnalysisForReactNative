package defpackage;
/* compiled from: PG */
/* renamed from: drfl  reason: default package */
/* loaded from: classes6.dex */
public final class drfl extends dsqw<drfl, drfk> implements dssk {
    public static final drfl b;
    private static volatile dssr<drfl> c;
    public dsrj<drfj> a = dssu.b;

    static {
        drfl drflVar = new drfl();
        b = drflVar;
        dsqw.cc(drfl.class, drflVar);
    }

    private drfl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drfj.class});
            }
            if (i2 == 3) {
                return new drfl();
            }
            if (i2 == 4) {
                return new drfk();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drfl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drfl.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
