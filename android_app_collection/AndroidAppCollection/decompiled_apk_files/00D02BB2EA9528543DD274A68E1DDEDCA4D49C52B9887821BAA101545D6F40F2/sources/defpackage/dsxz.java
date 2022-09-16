package defpackage;
/* compiled from: PG */
/* renamed from: dsxz  reason: default package */
/* loaded from: classes6.dex */
public final class dsxz extends dsqw<dsxz, dsxy> implements dssk {
    public static final dsxz a;
    private static volatile dssr<dsxz> k;
    private int b;
    private dsyb c;
    private dsxl d;
    private dsxx e;
    private dsxp f;
    private dsxr g;
    private dsxt h;
    private dsxv i;
    private byte j = 2;

    static {
        dsxz dsxzVar = new dsxz();
        a = dsxzVar;
        dsqw.cc(dsxz.class, dsxzVar);
    }

    private dsxz() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0007\u0000\u0001\u000f\u0015\u0007\u0000\u0000\u0007\u000fᐉ\r\u0010ᐉ\u000e\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dsxz();
            }
            if (i2 == 4) {
                return new dsxy();
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
            dssr<dsxz> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dsxz.class) {
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
