package defpackage;
/* compiled from: PG */
/* renamed from: dxjr  reason: default package */
/* loaded from: classes6.dex */
public final class dxjr extends dsqw<dxjr, dxjq> implements dssk {
    public static final dxjr a;
    private static volatile dssr<dxjr> b;

    static {
        dxjr dxjrVar = new dxjr();
        a = dxjrVar;
        dsqw.cc(dxjr.class, dxjrVar);
    }

    private dxjr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxjr();
            }
            if (i2 == 4) {
                return new dxjq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxjr.class) {
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
