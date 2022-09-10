package defpackage;
/* compiled from: PG */
/* renamed from: dufd  reason: default package */
/* loaded from: classes6.dex */
public final class dufd extends dsqw<dufd, dufa> implements dssk {
    public static final dufd e;
    private static volatile dssr<dufd> f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        dufd dufdVar = new dufd();
        e = dufdVar;
        dsqw.cc(dufd.class, dufdVar);
    }

    private dufd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dufb.a, "c", "d"});
            }
            if (i2 == 3) {
                return new dufd();
            }
            if (i2 == 4) {
                return new dufa();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dufd.class) {
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
