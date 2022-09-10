package defpackage;
/* compiled from: PG */
/* renamed from: xcm  reason: default package */
/* loaded from: classes7.dex */
public final class xcm extends dsqw<xcm, xcl> implements dssk {
    public static final xcm a;
    private static volatile dssr<xcm> c;
    private byte b = 2;

    static {
        xcm xcmVar = new xcm();
        a = xcmVar;
        dsqw.cc(xcm.class, xcmVar);
    }

    private xcm() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new xcm();
            }
            if (i2 == 4) {
                return new xcl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<xcm> dssrVar = c;
            if (dssrVar == null) {
                synchronized (xcm.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.b);
    }
}
