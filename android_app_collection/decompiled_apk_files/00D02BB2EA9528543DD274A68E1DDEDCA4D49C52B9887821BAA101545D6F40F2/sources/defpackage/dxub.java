package defpackage;
/* compiled from: PG */
/* renamed from: dxub  reason: default package */
/* loaded from: classes6.dex */
public final class dxub extends dsqw<dxub, dxua> implements dssk {
    public static final dxub c;
    private static volatile dssr<dxub> d;
    public dsrj<dxtx> a = dssu.b;
    public boolean b;

    static {
        dxub dxubVar = new dxub();
        c = dxubVar;
        dsqw.cc(dxub.class, dxubVar);
    }

    private dxub() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\u0007", new Object[]{"a", dxtx.class, "b"});
            }
            if (i2 == 3) {
                return new dxub();
            }
            if (i2 == 4) {
                return new dxua();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxub> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxub.class) {
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
