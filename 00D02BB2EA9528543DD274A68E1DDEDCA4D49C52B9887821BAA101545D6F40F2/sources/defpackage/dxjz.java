package defpackage;
/* compiled from: PG */
/* renamed from: dxjz  reason: default package */
/* loaded from: classes6.dex */
public final class dxjz extends dsqw<dxjz, dxjy> implements dssk {
    public static final dxjz a;
    private static volatile dssr<dxjz> b;

    static {
        dxjz dxjzVar = new dxjz();
        a = dxjzVar;
        dsqw.cc(dxjz.class, dxjzVar);
    }

    private dxjz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxjz();
            }
            if (i2 == 4) {
                return new dxjy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxjz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxjz.class) {
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
