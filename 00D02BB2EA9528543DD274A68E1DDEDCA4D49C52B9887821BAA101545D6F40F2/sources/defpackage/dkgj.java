package defpackage;
/* compiled from: PG */
/* renamed from: dkgj  reason: default package */
/* loaded from: classes6.dex */
public final class dkgj extends dsqw<dkgj, dkgi> implements dssk {
    public static final dkgj d;
    private static volatile dssr<dkgj> f;
    public dspd a = dspd.b;
    public long b;
    public float c;
    private int e;

    static {
        dkgj dkgjVar = new dkgj();
        d = dkgjVar;
        dsqw.cc(dkgj.class, dkgjVar);
    }

    private dkgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0004ခ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkgj();
            }
            if (i2 == 4) {
                return new dkgi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkgj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkgj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
