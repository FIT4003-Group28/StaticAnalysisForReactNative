package defpackage;
/* compiled from: PG */
/* renamed from: dxup  reason: default package */
/* loaded from: classes6.dex */
public final class dxup extends dsqw<dxup, dxue> implements dssk {
    public static final dxup c;
    private static volatile dssr<dxup> d;
    public int a = 0;
    public Object b;

    static {
        dxup dxupVar = new dxup();
        c = dxupVar;
        dsqw.cc(dxup.class, dxupVar);
    }

    private dxup() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", dxtx.class, dxuk.class, dxuo.class, dxug.class, dxum.class, dxui.class});
            }
            if (i2 == 3) {
                return new dxup();
            }
            if (i2 == 4) {
                return new dxue();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxup> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxup.class) {
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
