package defpackage;
/* compiled from: PG */
/* renamed from: drkg  reason: default package */
/* loaded from: classes6.dex */
public final class drkg extends dsqw<drkg, drkf> implements dssk {
    public static final drkg b;
    private static volatile dssr<drkg> d;
    public boolean a;
    private int c;

    static {
        drkg drkgVar = new drkg();
        b = drkgVar;
        dsqw.cc(drkg.class, drkgVar);
    }

    private drkg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drkg();
            }
            if (i2 == 4) {
                return new drkf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drkg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
