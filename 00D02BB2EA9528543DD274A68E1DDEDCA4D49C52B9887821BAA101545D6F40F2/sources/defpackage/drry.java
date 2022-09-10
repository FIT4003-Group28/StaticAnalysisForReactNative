package defpackage;
/* compiled from: PG */
/* renamed from: drry  reason: default package */
/* loaded from: classes6.dex */
public final class drry extends dsqw<drry, drrt> implements dssk {
    public static final dsrg<Integer, drrx> b = new drrs();
    public static final drry d;
    private static volatile dssr<drry> e;
    public dsrf a = dsqz.b;
    public dsrj<drrv> c = dssu.b;

    static {
        drry drryVar = new drry();
        d = drryVar;
        dsqw.cc(drry.class, drryVar);
    }

    private drry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", drrx.c(), "c", drrv.class});
            }
            if (i2 == 3) {
                return new drry();
            }
            if (i2 == 4) {
                return new drrt();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drry> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drry.class) {
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
