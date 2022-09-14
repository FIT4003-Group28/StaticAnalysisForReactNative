package defpackage;
/* compiled from: PG */
/* renamed from: dxwq  reason: default package */
/* loaded from: classes6.dex */
public final class dxwq extends dsqw<dxwq, dxwp> implements dssk {
    public static final dxwq a;
    private static volatile dssr<dxwq> b;

    static {
        dxwq dxwqVar = new dxwq();
        a = dxwqVar;
        dsqw.cc(dxwq.class, dxwqVar);
    }

    private dxwq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxwq();
            }
            if (i2 == 4) {
                return new dxwp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxwq.class) {
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
