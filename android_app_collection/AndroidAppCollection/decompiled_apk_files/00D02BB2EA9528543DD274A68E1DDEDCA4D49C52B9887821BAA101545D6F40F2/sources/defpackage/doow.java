package defpackage;
/* compiled from: PG */
/* renamed from: doow  reason: default package */
/* loaded from: classes6.dex */
public final class doow extends dsqw<doow, doov> implements dssk {
    public static final doow e;
    private static volatile dssr<doow> f;
    public int a;
    public dsrf b = dsqz.b;
    public int c;
    public dhkd d;

    static {
        doow doowVar = new doow();
        e = doowVar;
        dsqw.cc(doow.class, doowVar);
    }

    private doow() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002င\u0000\u0003ဉ\u0001", new Object[]{"a", "b", doos.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new doow();
            }
            if (i2 == 4) {
                return new doov();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doow> dssrVar = f;
            if (dssrVar == null) {
                synchronized (doow.class) {
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
