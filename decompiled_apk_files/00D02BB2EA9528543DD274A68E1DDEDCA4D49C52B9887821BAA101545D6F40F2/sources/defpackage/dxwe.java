package defpackage;
/* compiled from: PG */
/* renamed from: dxwe  reason: default package */
/* loaded from: classes6.dex */
public final class dxwe extends dsqw<dxwe, dxwd> implements dssk {
    public static final dxwe c;
    private static volatile dssr<dxwe> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dxwe dxweVar = new dxwe();
        c = dxweVar;
        dsqw.cc(dxwe.class, dxweVar);
    }

    private dxwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxwe();
            }
            if (i2 == 4) {
                return new dxwd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxwe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxwe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
