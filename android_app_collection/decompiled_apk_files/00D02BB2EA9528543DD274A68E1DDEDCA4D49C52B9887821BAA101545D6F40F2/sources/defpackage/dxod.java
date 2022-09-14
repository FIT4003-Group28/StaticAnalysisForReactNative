package defpackage;
/* compiled from: PG */
/* renamed from: dxod  reason: default package */
/* loaded from: classes6.dex */
public final class dxod extends dsqw<dxod, dxoc> implements dssk {
    public static final dxod b;
    private static volatile dssr<dxod> c;
    public String a = "";

    static {
        dxod dxodVar = new dxod();
        b = dxodVar;
        dsqw.cc(dxod.class, dxodVar);
    }

    private dxod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxod();
            }
            if (i2 == 4) {
                return new dxoc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxod> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxod.class) {
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
