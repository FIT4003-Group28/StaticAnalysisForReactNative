package defpackage;
/* compiled from: PG */
/* renamed from: dxaa  reason: default package */
/* loaded from: classes6.dex */
public final class dxaa extends dsqw<dxaa, dwzx> implements dssk {
    public static final dxaa g;
    private static volatile dssr<dxaa> i;
    public int a;
    public int b;
    public dwzq d;
    public int e;
    public int f;
    private byte h = 2;
    public dsri c = dsrx.b;

    static {
        dxaa dxaaVar = new dxaa();
        g = dxaaVar;
        dsqw.cc(dxaa.class, dxaaVar);
    }

    private dxaa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ᔌ\u0000\u0002\u0014\u0003ᐉ\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"a", "b", dwzy.a, "c", "d", "e", "f"});
            }
            if (i3 == 3) {
                return new dxaa();
            }
            if (i3 == 4) {
                return new dwzx();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dxaa> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dxaa.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
