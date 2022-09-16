package defpackage;
/* compiled from: PG */
/* renamed from: dxay  reason: default package */
/* loaded from: classes6.dex */
public final class dxay extends dsqw<dxay, dxat> implements dssk {
    public static final dxay a;
    private static volatile dssr<dxay> k;
    private int b;
    private int c;
    private int d;
    private dwzm e;
    private dxaw f;
    private dxas g;
    private dxao h;
    private dxaq i;
    private byte j = 2;

    static {
        dxay dxayVar = new dxay();
        a = dxayVar;
        dsqw.cc(dxay.class, dxayVar);
    }

    private dxay() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0006\u0000\u0002\u0001²\u0006\u0000\u0000\u0006\u0001ᔌ\u0000\u0003ᐉ\u0002Fᐑ\u000bnᐑ\n\u0097ᐉ\u001b²ᐉ!", new Object[]{"b", "c", "d", dxax.a, "e", "g", "f", "h", "i"});
            }
            if (i2 == 3) {
                return new dxay();
            }
            if (i2 == 4) {
                return new dxat();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.j = b;
                return null;
            }
            dssr<dxay> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dxay.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.j);
    }
}
