package defpackage;
/* compiled from: PG */
/* renamed from: dxqr  reason: default package */
/* loaded from: classes6.dex */
public final class dxqr extends dsqw<dxqr, dxqq> implements dssk {
    public static final dxqr b;
    private static volatile dssr<dxqr> c;
    public String a = "";

    static {
        dxqr dxqrVar = new dxqr();
        b = dxqrVar;
        dsqw.cc(dxqr.class, dxqrVar);
    }

    private dxqr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxqr();
            }
            if (i2 == 4) {
                return new dxqq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxqr> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxqr.class) {
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
