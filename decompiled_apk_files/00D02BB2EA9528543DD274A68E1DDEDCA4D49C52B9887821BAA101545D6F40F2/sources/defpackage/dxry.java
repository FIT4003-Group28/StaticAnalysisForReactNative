package defpackage;
/* compiled from: PG */
/* renamed from: dxry  reason: default package */
/* loaded from: classes6.dex */
public final class dxry extends dsqw<dxry, dxrx> implements dssk {
    public static final dxry h;
    private static volatile dssr<dxry> i;
    public int a = 0;
    public Object b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        dxry dxryVar = new dxry();
        h = dxryVar;
        dsqw.cc(dxry.class, dxryVar);
    }

    private dxry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0000\f\u0001\u0000\u0001k\f\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004e<\u0000f<\u0000g<\u0000h<\u0000i<\u0000j<\u0000k<\u0000", new Object[]{"b", "a", "c", "d", "e", "f", "g", dxsm.class, dxrg.class, dxru.class, dxre.class, dxrm.class, dxrc.class, dxra.class});
            }
            if (i3 == 3) {
                return new dxry();
            }
            if (i3 == 4) {
                return new dxrx();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dxry> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxry.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
