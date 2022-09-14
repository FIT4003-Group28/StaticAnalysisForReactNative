package defpackage;
/* compiled from: PG */
/* renamed from: dxtd  reason: default package */
/* loaded from: classes6.dex */
public final class dxtd extends dsqw<dxtd, dxtc> implements dssk {
    public static final dxtd e;
    private static volatile dssr<dxtd> f;
    public dxwi a;
    public dxnc b;
    public dxsy c;
    public dsrf d = dsqz.b;

    static {
        dxtd dxtdVar = new dxtd();
        e = dxtdVar;
        dsqw.cc(dxtd.class, dxtdVar);
    }

    private dxtd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0004\t\u0005,", new Object[]{"a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dxtd();
            }
            if (i2 == 4) {
                return new dxtc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxtd.class) {
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
