package defpackage;
/* compiled from: PG */
/* renamed from: dkdu  reason: default package */
/* loaded from: classes6.dex */
public final class dkdu extends dsqw<dkdu, dkdp> implements dssk {
    public static final dkdu d;
    private static volatile dssr<dkdu> f;
    public String a = "";
    public String b = "";
    public dsrj<dkdr> c = dssu.b;
    private int e;

    static {
        dkdu dkduVar = new dkdu();
        d = dkduVar;
        dsqw.cc(dkdu.class, dkduVar);
    }

    private dkdu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", dkdr.class});
            }
            if (i2 == 3) {
                return new dkdu();
            }
            if (i2 == 4) {
                return new dkdp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkdu.class) {
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
