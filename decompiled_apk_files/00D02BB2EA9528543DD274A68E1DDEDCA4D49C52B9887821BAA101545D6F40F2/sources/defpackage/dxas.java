package defpackage;
/* compiled from: PG */
/* renamed from: dxas  reason: default package */
/* loaded from: classes6.dex */
public final class dxas extends dsqw<dxas, dxar> implements dssk {
    public static final dxas a;
    private static volatile dssr<dxas> e;
    private int b;
    private byte d = 2;
    private String c = "";

    static {
        dxas dxasVar = new dxas();
        a = dxasVar;
        dsqw.cc(dxas.class, dxasVar);
    }

    private dxas() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001GG\u0001\u0000\u0000\u0001Gᔈ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dxas();
            }
            if (i2 == 4) {
                return new dxar();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dxas> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dxas.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
