package defpackage;
/* compiled from: PG */
/* renamed from: dxpz  reason: default package */
/* loaded from: classes6.dex */
public final class dxpz extends dsqw<dxpz, dxpy> implements dssk {
    public static final dxpz a;
    private static volatile dssr<dxpz> b;

    static {
        dxpz dxpzVar = new dxpz();
        a = dxpzVar;
        dsqw.cc(dxpz.class, dxpzVar);
    }

    private dxpz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dxpz();
            }
            if (i2 == 4) {
                return new dxpy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxpz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dxpz.class) {
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
