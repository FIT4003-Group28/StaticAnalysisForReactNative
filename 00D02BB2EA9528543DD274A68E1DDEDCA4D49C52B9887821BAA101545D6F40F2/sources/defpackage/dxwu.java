package defpackage;
/* compiled from: PG */
/* renamed from: dxwu  reason: default package */
/* loaded from: classes6.dex */
public final class dxwu extends dsqw<dxwu, dxwt> implements dssk {
    public static final dxwu b;
    private static volatile dssr<dxwu> c;
    public dxww a;

    static {
        dxwu dxwuVar = new dxwu();
        b = dxwuVar;
        dsqw.cc(dxwu.class, dxwuVar);
    }

    private dxwu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxwu();
            }
            if (i2 == 4) {
                return new dxwt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwu> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxwu.class) {
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
