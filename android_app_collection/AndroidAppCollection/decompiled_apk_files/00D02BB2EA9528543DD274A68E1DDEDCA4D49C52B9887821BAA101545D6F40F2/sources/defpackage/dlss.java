package defpackage;
/* compiled from: PG */
/* renamed from: dlss  reason: default package */
/* loaded from: classes6.dex */
public final class dlss extends dsqw<dlss, dlsl> implements dssk {
    public static final dlss g;
    private static volatile dssr<dlss> h;
    public int a;
    public dlsp b;
    public dlsr c;
    public dlsn d;
    public dlsk e;
    public dlto f;

    static {
        dlss dlssVar = new dlss();
        g = dlssVar;
        dsqw.cc(dlss.class, dlssVar);
    }

    private dlss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dlss();
            }
            if (i2 == 4) {
                return new dlsl();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlss> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlss.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
