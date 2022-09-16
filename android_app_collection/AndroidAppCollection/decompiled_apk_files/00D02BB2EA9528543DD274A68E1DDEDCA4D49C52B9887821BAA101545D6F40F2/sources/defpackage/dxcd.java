package defpackage;
/* compiled from: PG */
/* renamed from: dxcd  reason: default package */
/* loaded from: classes6.dex */
public final class dxcd extends dsqw<dxcd, dxca> implements dssk {
    public static final dxcd g;
    private static volatile dssr<dxcd> j;
    public int a;
    public long c;
    public boolean e;
    public boolean f;
    private dxcg h;
    private byte i = 2;
    public int b = 1;
    public dsrj<dxcm> d = dssu.b;

    static {
        dxcd dxcdVar = new dxcd();
        g = dxcdVar;
        dsqw.cc(dxcd.class, dxcdVar);
    }

    private dxcd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ᔌ\u0000\u0002ဃ\u0001\u0004Л\u0005ᐉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", dxcb.a, "c", "d", dxcm.class, "h", "e", "f"});
            }
            if (i2 == 3) {
                return new dxcd();
            }
            if (i2 == 4) {
                return new dxca();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dxcd> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dxcd.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
