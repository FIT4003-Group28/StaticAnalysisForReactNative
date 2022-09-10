package defpackage;
/* compiled from: PG */
/* renamed from: dmdj  reason: default package */
/* loaded from: classes6.dex */
public final class dmdj extends dsqw<dmdj, dmdi> implements dssk {
    public static final dmdj c;
    public static final dsqv<dmch, dmdj> d;
    private static volatile dssr<dmdj> f;
    public int a;
    public dvyw b;
    private byte e = 2;

    static {
        dmdj dmdjVar = new dmdj();
        c = dmdjVar;
        dsqw.cc(dmdj.class, dmdjVar);
        d = dsqw.newSingularGeneratedExtension(dmch.d, dmdjVar, dmdjVar, null, 1008, dsur.MESSAGE, dmdj.class);
    }

    private dmdj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmdj();
            }
            if (i2 == 4) {
                return new dmdi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmdj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmdj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
