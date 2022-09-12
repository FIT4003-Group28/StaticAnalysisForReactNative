package defpackage;
/* compiled from: PG */
/* renamed from: dxsy  reason: default package */
/* loaded from: classes6.dex */
public final class dxsy extends dsqw<dxsy, dxsx> implements dssk {
    public static final dxsy b;
    private static volatile dssr<dxsy> c;
    public boolean a;

    static {
        dxsy dxsyVar = new dxsy();
        b = dxsyVar;
        dsqw.cc(dxsy.class, dxsyVar);
    }

    private dxsy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxsy();
            }
            if (i2 == 4) {
                return new dxsx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxsy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxsy.class) {
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
