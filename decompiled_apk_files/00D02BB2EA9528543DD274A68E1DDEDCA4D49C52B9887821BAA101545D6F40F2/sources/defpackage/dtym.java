package defpackage;
/* compiled from: PG */
/* renamed from: dtym  reason: default package */
/* loaded from: classes.dex */
public final class dtym extends dsqw<dtym, dtyl> implements dssk {
    public static final dtym f;
    private static volatile dssr<dtym> g;
    public int a;
    public long b;
    public String c = "";
    public String d;
    public boolean e;

    static {
        dtym dtymVar = new dtym();
        f = dtymVar;
        dsqw.cc(dtym.class, dtymVar);
    }

    private dtym() {
        dssu<Object> dssuVar = dssu.b;
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001\u0005ဈ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dtym();
            }
            if (i2 == 4) {
                return new dtyl();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtym> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtym.class) {
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
