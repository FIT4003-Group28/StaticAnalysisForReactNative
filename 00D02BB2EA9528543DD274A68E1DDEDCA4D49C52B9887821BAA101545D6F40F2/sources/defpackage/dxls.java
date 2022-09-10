package defpackage;
/* compiled from: PG */
/* renamed from: dxls  reason: default package */
/* loaded from: classes6.dex */
public final class dxls extends dsqw<dxls, dxlr> implements dssk {
    public static final dxls b;
    private static volatile dssr<dxls> c;
    public long a;

    static {
        dxls dxlsVar = new dxls();
        b = dxlsVar;
        dsqw.cc(dxls.class, dxlsVar);
    }

    private dxls() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0002", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxls();
            }
            if (i2 == 4) {
                return new dxlr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxls> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxls.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
