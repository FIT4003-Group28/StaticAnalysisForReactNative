package defpackage;
/* compiled from: PG */
/* renamed from: drff  reason: default package */
/* loaded from: classes6.dex */
public final class drff extends dsqw<drff, drfe> implements dssk {
    public static final drff b;
    private static volatile dssr<drff> c;
    public dsrj<drfj> a = dssu.b;

    static {
        drff drffVar = new drff();
        b = drffVar;
        dsqw.cc(drff.class, drffVar);
    }

    private drff() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drfj.class});
            }
            if (i2 == 3) {
                return new drff();
            }
            if (i2 == 4) {
                return new drfe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drff> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drff.class) {
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
