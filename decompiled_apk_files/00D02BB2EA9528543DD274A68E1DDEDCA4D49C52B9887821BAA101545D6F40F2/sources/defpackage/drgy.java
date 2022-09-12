package defpackage;
/* compiled from: PG */
/* renamed from: drgy  reason: default package */
/* loaded from: classes6.dex */
public final class drgy extends dsqw<drgy, drgx> implements dssk {
    public static final drgy b;
    private static volatile dssr<drgy> c;
    public dsrj<doxp> a = dssu.b;

    static {
        drgy drgyVar = new drgy();
        b = drgyVar;
        dsqw.cc(drgy.class, drgyVar);
    }

    private drgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doxp.class});
            }
            if (i2 == 3) {
                return new drgy();
            }
            if (i2 == 4) {
                return new drgx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drgy.class) {
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
