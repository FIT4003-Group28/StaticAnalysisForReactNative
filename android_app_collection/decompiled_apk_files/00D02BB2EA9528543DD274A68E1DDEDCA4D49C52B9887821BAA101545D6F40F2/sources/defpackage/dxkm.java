package defpackage;
/* compiled from: PG */
/* renamed from: dxkm  reason: default package */
/* loaded from: classes6.dex */
public final class dxkm extends dsqw<dxkm, dxkl> implements dssk {
    public static final dxkm a;
    private static volatile dssr<dxkm> b;

    static {
        dxkm dxkmVar = new dxkm();
        a = dxkmVar;
        dsqw.cc(dxkm.class, dxkmVar);
    }

    private dxkm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxkm();
            }
            if (i2 == 4) {
                return new dxkl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxkm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxkm.class) {
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
