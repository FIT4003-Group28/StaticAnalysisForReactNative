package defpackage;
/* compiled from: PG */
/* renamed from: drxs  reason: default package */
/* loaded from: classes6.dex */
public final class drxs extends dsqw<drxs, drxr> implements dssk {
    public static final drxs c;
    private static volatile dssr<drxs> d;
    public int a = 0;
    public Object b;

    static {
        drxs drxsVar = new drxs();
        c = drxsVar;
        dsqw.cc(drxs.class, drxsVar);
    }

    private drxs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", drxz.class, dryb.class, drxl.class, drxo.class, dsbe.class, dryd.class, drxu.class, dsaw.class});
            }
            if (i2 == 3) {
                return new drxs();
            }
            if (i2 == 4) {
                return new drxr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drxs.class) {
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
