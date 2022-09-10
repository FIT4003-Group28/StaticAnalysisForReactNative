package defpackage;
/* compiled from: PG */
/* renamed from: dxkg  reason: default package */
/* loaded from: classes6.dex */
public final class dxkg extends dsqw<dxkg, dxkf> implements dssk {
    public static final dxkg b;
    private static volatile dssr<dxkg> c;
    public dxki a;

    static {
        dxkg dxkgVar = new dxkg();
        b = dxkgVar;
        dsqw.cc(dxkg.class, dxkgVar);
    }

    private dxkg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxkg();
            }
            if (i2 == 4) {
                return new dxkf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxkg> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxkg.class) {
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
