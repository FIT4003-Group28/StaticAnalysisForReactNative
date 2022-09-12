package defpackage;
/* compiled from: PG */
/* renamed from: dxcg  reason: default package */
/* loaded from: classes6.dex */
public final class dxcg extends dsqw<dxcg, dxce> implements dssk {
    public static final dxcg a;
    private static volatile dssr<dxcg> f;
    private int b;
    private dwzh d;
    private byte e = 2;
    private int c = 1;

    static {
        dxcg dxcgVar = new dxcg();
        a = dxcgVar;
        dsqw.cc(dxcg.class, dxcgVar);
    }

    private dxcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᔌ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", dxcf.a, "d"});
            }
            if (i2 == 3) {
                return new dxcg();
            }
            if (i2 == 4) {
                return new dxce();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dxcg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dxcg.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
