package defpackage;
/* compiled from: PG */
/* renamed from: dtpj  reason: default package */
/* loaded from: classes6.dex */
public final class dtpj extends dsqw<dtpj, dtpi> implements dssk {
    public static final dtpj d;
    private static volatile dssr<dtpj> e;
    public int a;
    public dhjx b;
    public String c = "";

    static {
        dtpj dtpjVar = new dtpj();
        d = dtpjVar;
        dsqw.cc(dtpj.class, dtpjVar);
    }

    private dtpj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtpj();
            }
            if (i2 == 4) {
                return new dtpi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtpj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtpj.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
