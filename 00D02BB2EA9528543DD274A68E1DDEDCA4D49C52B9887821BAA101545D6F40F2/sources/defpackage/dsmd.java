package defpackage;
/* compiled from: PG */
/* renamed from: dsmd  reason: default package */
/* loaded from: classes6.dex */
public final class dsmd extends dsqw<dsmd, dsma> implements dssk {
    public static final dsmd f;
    private static volatile dssr<dsmd> g;
    public int a;
    public Object c;
    public dsmc e;
    public int b = 0;
    public int d = 1;

    static {
        dsmd dsmdVar = new dsmd();
        f = dsmdVar;
        dsqw.cc(dsmd.class, dsmdVar);
    }

    private dsmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0000\u0001ြ\u0000\u0002င\u0006\u0003ြ\u0000\u0004ဉ\u0007\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000", new Object[]{"c", "b", "a", dsks.class, "d", dslg.class, "e", dsky.class, dsle.class, dsln.class, dskw.class});
            }
            if (i2 == 3) {
                return new dsmd();
            }
            if (i2 == 4) {
                return new dsma();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsmd> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dsmd.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
