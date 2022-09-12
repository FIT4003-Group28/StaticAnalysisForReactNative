package defpackage;
/* compiled from: PG */
/* renamed from: dxuk  reason: default package */
/* loaded from: classes6.dex */
public final class dxuk extends dsqw<dxuk, dxuj> implements dssk {
    public static final dxuk a;
    private static volatile dssr<dxuk> b;

    static {
        dxuk dxukVar = new dxuk();
        a = dxukVar;
        dsqw.cc(dxuk.class, dxukVar);
    }

    private dxuk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxuk();
            }
            if (i2 == 4) {
                return new dxuj();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxuk> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxuk.class) {
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
