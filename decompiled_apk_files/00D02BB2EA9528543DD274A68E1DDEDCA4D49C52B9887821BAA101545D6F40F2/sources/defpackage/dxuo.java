package defpackage;
/* compiled from: PG */
/* renamed from: dxuo  reason: default package */
/* loaded from: classes6.dex */
public final class dxuo extends dsqw<dxuo, dxun> implements dssk {
    public static final dxuo a;
    private static volatile dssr<dxuo> b;

    static {
        dxuo dxuoVar = new dxuo();
        a = dxuoVar;
        dsqw.cc(dxuo.class, dxuoVar);
    }

    private dxuo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxuo();
            }
            if (i2 == 4) {
                return new dxun();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxuo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxuo.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
