package defpackage;
/* compiled from: PG */
/* renamed from: phz  reason: default package */
/* loaded from: classes7.dex */
public final class phz extends dsqw<phz, phw> implements dssk {
    public static final phz e;
    private static volatile dssr<phz> g;
    public int a;
    public dfoc b;
    private byte f = 2;
    public String c = "";
    public dsrj<phy> d = dssu.b;

    static {
        phz phzVar = new phz();
        e = phzVar;
        dsqw.cc(phz.class, phzVar);
    }

    private phz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003Л", new Object[]{"a", "b", "c", "d", phy.class});
            }
            if (i2 == 3) {
                return new phz();
            }
            if (i2 == 4) {
                return new phw();
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
            dssr<phz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (phz.class) {
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
