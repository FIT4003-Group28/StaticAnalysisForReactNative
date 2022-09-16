package defpackage;
/* compiled from: PG */
/* renamed from: dktp  reason: default package */
/* loaded from: classes.dex */
public final class dktp extends dsqw<dktp, dktm> implements dssk {
    public static final dktp e;
    private static volatile dssr<dktp> f;
    public int a;
    public int b;
    public boolean c = true;
    public boolean d;

    static {
        dktp dktpVar = new dktp();
        e = dktpVar;
        dsqw.cc(dktp.class, dktpVar);
    }

    private dktp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဌ\u0000\u0003ဇ\u0002", new Object[]{"a", "c", "b", dktn.a, "d"});
            }
            if (i2 == 3) {
                return new dktp();
            }
            if (i2 == 4) {
                return new dktm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dktp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dktp.class) {
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
