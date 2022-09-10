package defpackage;
/* compiled from: PG */
/* renamed from: dxwo  reason: default package */
/* loaded from: classes6.dex */
public final class dxwo extends dsqw<dxwo, dxwn> implements dssk {
    public static final dxwo c;
    private static volatile dssr<dxwo> d;
    public dxww a;
    public dsrj<dxvs> b = dssu.b;

    static {
        dxwo dxwoVar = new dxwo();
        c = dxwoVar;
        dsqw.cc(dxwo.class, dxwoVar);
    }

    private dxwo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0001\u0000\u0003\t\u0004\u001b", new Object[]{"a", "b", dxvs.class});
            }
            if (i2 == 3) {
                return new dxwo();
            }
            if (i2 == 4) {
                return new dxwn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxwo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
