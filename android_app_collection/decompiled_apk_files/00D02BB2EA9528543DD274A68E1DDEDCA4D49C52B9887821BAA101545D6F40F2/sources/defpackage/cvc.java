package defpackage;
/* compiled from: PG */
/* renamed from: cvc  reason: default package */
/* loaded from: classes5.dex */
public final class cvc extends dsqw<cvc, cvb> implements dssk {
    public static final cvc e;
    private static volatile dssr<cvc> f;
    public int a;
    public boolean b;
    public String c = "";
    public boolean d;

    static {
        cvc cvcVar = new cvc();
        e = cvcVar;
        dsqw.cc(cvc.class, cvcVar);
    }

    private cvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cvc();
            }
            if (i2 == 4) {
                return new cvb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cvc.class) {
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
