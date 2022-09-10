package defpackage;
/* compiled from: PG */
/* renamed from: dxvi  reason: default package */
/* loaded from: classes6.dex */
public final class dxvi extends dsqw<dxvi, dxvh> implements dssk {
    public static final dxvi a;
    private static volatile dssr<dxvi> b;

    static {
        dxvi dxviVar = new dxvi();
        a = dxviVar;
        dsqw.cc(dxvi.class, dxviVar);
    }

    private dxvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxvi();
            }
            if (i2 == 4) {
                return new dxvh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxvi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxvi.class) {
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
