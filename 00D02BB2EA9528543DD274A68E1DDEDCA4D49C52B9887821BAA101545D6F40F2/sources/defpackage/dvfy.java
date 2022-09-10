package defpackage;
/* compiled from: PG */
/* renamed from: dvfy  reason: default package */
/* loaded from: classes6.dex */
public final class dvfy extends dsqw<dvfy, dvfx> implements dssk {
    public static final dvfy f;
    private static volatile dssr<dvfy> h;
    public int a;
    public Object c;
    public int d;
    public int b = 0;
    private byte g = 2;
    public dsrj<dtaq> e = dssu.b;

    static {
        dvfy dvfyVar = new dvfy();
        f = dvfyVar;
        dsqw.cc(dvfy.class, dvfyVar);
    }

    private dvfy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001င\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005\u001b", new Object[]{"c", "b", "a", "d", dvgk.class, dvfw.class, dvga.class, "e", dtaq.class});
            }
            if (i2 == 3) {
                return new dvfy();
            }
            if (i2 == 4) {
                return new dvfx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dvfy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dvfy.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
