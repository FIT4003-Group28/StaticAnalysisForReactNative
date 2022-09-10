package defpackage;
/* compiled from: PG */
/* renamed from: dkzf  reason: default package */
/* loaded from: classes6.dex */
public final class dkzf extends dsqw<dkzf, dkze> implements dssk {
    public static final dkzf e;
    private static volatile dssr<dkzf> f;
    public int a;
    public dspd b = dspd.b;
    public dsrj<dkzj> c = dssu.b;
    public dhjx d;

    static {
        dkzf dkzfVar = new dkzf();
        e = dkzfVar;
        dsqw.cc(dkzf.class, dkzfVar);
    }

    private dkzf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0004\u0007\u0003\u0000\u0001\u0000\u0004ဉ\u0002\u0006ည\u0000\u0007\u001b", new Object[]{"a", "d", "b", "c", dkzj.class});
            }
            if (i2 == 3) {
                return new dkzf();
            }
            if (i2 == 4) {
                return new dkze();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkzf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkzf.class) {
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
