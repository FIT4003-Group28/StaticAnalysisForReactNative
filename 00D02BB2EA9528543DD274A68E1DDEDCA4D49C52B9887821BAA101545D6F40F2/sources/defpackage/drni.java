package defpackage;
/* compiled from: PG */
/* renamed from: drni  reason: default package */
/* loaded from: classes6.dex */
public final class drni extends dsqw<drni, drnh> implements dssk {
    public static final drni c;
    private static volatile dssr<drni> d;
    public int a = 0;
    public Object b;

    static {
        drni drniVar = new drni();
        c = drniVar;
        dsqw.cc(drni.class, drniVar);
    }

    private drni() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", drmb.class});
            }
            if (i2 == 3) {
                return new drni();
            }
            if (i2 == 4) {
                return new drnh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drni> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drni.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
