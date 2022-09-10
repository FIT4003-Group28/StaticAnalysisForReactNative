package defpackage;
/* compiled from: PG */
/* renamed from: dear  reason: default package */
/* loaded from: classes.dex */
public final class dear extends dsqw<dear, deaq> implements dssk {
    public static final dear c;
    private static volatile dssr<dear> d;
    public int a;
    public int b;

    static {
        dear dearVar = new dear();
        c = dearVar;
        dsqw.cc(dear.class, dearVar);
    }

    private dear() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqfx.a});
            }
            if (i2 == 3) {
                return new dear();
            }
            if (i2 == 4) {
                return new deaq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dear> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dear.class) {
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
