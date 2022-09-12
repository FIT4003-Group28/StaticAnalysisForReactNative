package defpackage;
/* compiled from: PG */
/* renamed from: dwzu  reason: default package */
/* loaded from: classes.dex */
public final class dwzu extends dsqw<dwzu, dwzt> implements dssk {
    public static final dwzu e;
    private static volatile dssr<dwzu> f;
    public int a;
    public int c;
    public String b = "";
    public String d = "";

    static {
        dwzu dwzuVar = new dwzu();
        e = dwzuVar;
        dsqw.cc(dwzu.class, dwzuVar);
    }

    private dwzu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဏ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwzu();
            }
            if (i2 == 4) {
                return new dwzt();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwzu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwzu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
