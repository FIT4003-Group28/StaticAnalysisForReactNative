package defpackage;
/* compiled from: PG */
/* renamed from: ddnd  reason: default package */
/* loaded from: classes.dex */
public final class ddnd extends dsqw<ddnd, ddnb> implements dssk {
    public static final ddnd c;
    private static volatile dssr<ddnd> d;
    public int a;
    public int b;

    static {
        ddnd ddndVar = new ddnd();
        c = ddndVar;
        dsqw.cc(ddnd.class, ddndVar);
    }

    private ddnd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ddnc.a});
            }
            if (i2 == 3) {
                return new ddnd();
            }
            if (i2 == 4) {
                return new ddnb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddnd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (ddnd.class) {
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
