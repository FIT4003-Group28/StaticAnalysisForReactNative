package defpackage;
/* compiled from: PG */
/* renamed from: drbo  reason: default package */
/* loaded from: classes.dex */
public final class drbo extends dsqw<drbo, drbn> implements dssk {
    public static final drbo b;
    private static volatile dssr<drbo> c;
    public dsrj<drbm> a = dssu.b;

    static {
        drbo drboVar = new drbo();
        b = drboVar;
        dsqw.cc(drbo.class, drboVar);
    }

    private drbo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drbm.class});
            }
            if (i2 == 3) {
                return new drbo();
            }
            if (i2 == 4) {
                return new drbn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drbo.class) {
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
