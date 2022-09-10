package defpackage;
/* compiled from: PG */
/* renamed from: diyr  reason: default package */
/* loaded from: classes6.dex */
public final class diyr extends dsqw<diyr, diym> implements dssk {
    public static final diyr d;
    private static volatile dssr<diyr> f;
    public int a;
    private byte e = 2;
    public dsrj<diyq> b = dssu.b;
    public dspd c = dspd.b;

    static {
        diyr diyrVar = new diyr();
        d = diyrVar;
        dsqw.cc(diyr.class, diyrVar);
    }

    private diyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ည\u0000", new Object[]{"a", "b", diyq.class, "c"});
            }
            if (i2 == 3) {
                return new diyr();
            }
            if (i2 == 4) {
                return new diym();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<diyr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (diyr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
