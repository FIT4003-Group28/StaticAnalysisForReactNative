package defpackage;
/* compiled from: PG */
/* renamed from: dogh  reason: default package */
/* loaded from: classes6.dex */
public final class dogh extends dsqw<dogh, dogg> implements dssk {
    public static final dogh c;
    private static volatile dssr<dogh> e;
    public int a;
    public dogc b;
    private int d;

    static {
        dogh doghVar = new dogh();
        c = doghVar;
        dsqw.cc(dogh.class, doghVar);
    }

    private dogh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", doge.a, "b"});
            }
            if (i2 == 3) {
                return new dogh();
            }
            if (i2 == 4) {
                return new dogg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dogh.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
