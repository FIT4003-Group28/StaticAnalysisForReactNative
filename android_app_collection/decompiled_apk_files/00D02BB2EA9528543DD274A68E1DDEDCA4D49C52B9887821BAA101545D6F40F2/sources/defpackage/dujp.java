package defpackage;
/* compiled from: PG */
/* renamed from: dujp  reason: default package */
/* loaded from: classes6.dex */
public final class dujp extends dsqw<dujp, dujo> implements dssk {
    public static final dujp e;
    private static volatile dssr<dujp> f;
    public int a;
    public long b;
    public dsrj<dujn> c = dssu.b;
    public dspd d = dspd.b;

    static {
        dujp dujpVar = new dujp();
        e = dujpVar;
        dsqw.cc(dujp.class, dujpVar);
    }

    private dujp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"a", "b", "c", dujn.class, "d"});
            }
            if (i2 == 3) {
                return new dujp();
            }
            if (i2 == 4) {
                return new dujo();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dujp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dujp.class) {
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
