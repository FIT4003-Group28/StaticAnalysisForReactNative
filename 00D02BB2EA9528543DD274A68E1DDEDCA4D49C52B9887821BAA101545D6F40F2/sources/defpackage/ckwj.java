package defpackage;
/* compiled from: PG */
/* renamed from: ckwj  reason: default package */
/* loaded from: classes5.dex */
public final class ckwj extends dsqw<ckwj, ckwi> implements dssk {
    public static final ckwj e;
    private static volatile dssr<ckwj> f;
    public int a;
    public long b;
    public String c = "";
    public int d;

    static {
        ckwj ckwjVar = new ckwj();
        e = ckwjVar;
        dsqw.cc(ckwj.class, ckwjVar);
    }

    private ckwj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", ckwc.a});
            }
            if (i2 == 3) {
                return new ckwj();
            }
            if (i2 == 4) {
                return new ckwi();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (ckwj.class) {
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
