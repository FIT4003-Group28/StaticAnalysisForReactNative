package defpackage;
/* compiled from: PG */
/* renamed from: dxws  reason: default package */
/* loaded from: classes6.dex */
public final class dxws extends dsqw<dxws, dxwr> implements dssk {
    public static final dxws c;
    private static volatile dssr<dxws> d;
    public dxww a;
    public dxwa b;

    static {
        dxws dxwsVar = new dxws();
        c = dxwsVar;
        dsqw.cc(dxws.class, dxwsVar);
    }

    private dxws() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\t\u0004\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxws();
            }
            if (i2 == 4) {
                return new dxwr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxws> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxws.class) {
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
