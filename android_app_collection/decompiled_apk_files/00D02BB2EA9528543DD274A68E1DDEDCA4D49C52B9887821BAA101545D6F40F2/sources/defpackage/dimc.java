package defpackage;
/* compiled from: PG */
/* renamed from: dimc  reason: default package */
/* loaded from: classes6.dex */
public final class dimc extends dsqw<dimc, dilz> implements dssk {
    public static final dimc e;
    private static volatile dssr<dimc> g;
    public int a;
    public dnqh b;
    private byte f = 2;
    public String c = "";
    public dsrj<dimb> d = dssu.b;

    static {
        dimc dimcVar = new dimc();
        e = dimcVar;
        dsqw.cc(dimc.class, dimcVar);
    }

    private dimc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", dimb.class});
            }
            if (i2 == 3) {
                return new dimc();
            }
            if (i2 == 4) {
                return new dilz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dimc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dimc.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
