package defpackage;
/* compiled from: PG */
/* renamed from: dszm  reason: default package */
/* loaded from: classes6.dex */
public final class dszm extends dsqw<dszm, dszl> implements dssk {
    public static final dszm e;
    private static volatile dssr<dszm> f;
    public dxwi a;
    public dxnc b;
    public dxqi c;
    public dxob d;

    static {
        dszm dszmVar = new dszm();
        e = dszmVar;
        dsqw.cc(dszm.class, dszmVar);
    }

    private dszm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dszm();
            }
            if (i2 == 4) {
                return new dszl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dszm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dszm.class) {
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
