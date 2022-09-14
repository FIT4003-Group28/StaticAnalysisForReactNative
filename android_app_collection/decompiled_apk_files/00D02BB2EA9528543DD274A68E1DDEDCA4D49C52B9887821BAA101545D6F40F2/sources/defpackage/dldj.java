package defpackage;
/* compiled from: PG */
/* renamed from: dldj  reason: default package */
/* loaded from: classes6.dex */
public final class dldj extends dsqw<dldj, dldi> implements dssk {
    public static final dldj d;
    private static volatile dssr<dldj> g;
    public dvyw a;
    public dldl b;
    private int e;
    private byte f = 2;
    public dsrj<dlay> c = dssu.b;

    static {
        dldj dldjVar = new dldj();
        d = dldjVar;
        dsqw.cc(dldj.class, dldjVar);
    }

    private dldj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0005ဉ\u0001\u0006\u001b", new Object[]{"e", "a", "b", "c", dlay.class});
            }
            if (i2 == 3) {
                return new dldj();
            }
            if (i2 == 4) {
                return new dldi();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dldj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dldj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
