package defpackage;
/* compiled from: PG */
/* renamed from: dmfy  reason: default package */
/* loaded from: classes6.dex */
public final class dmfy extends dsqw<dmfy, dmfx> implements dssk {
    public static final dmfy e;
    public static final dsqv<dmfs, dmfy> f;
    private static volatile dssr<dmfy> g;
    public int a;
    public dpoj b;
    public dpoj c;
    public dpoj d;

    static {
        dmfy dmfyVar = new dmfy();
        e = dmfyVar;
        dsqw.cc(dmfy.class, dmfyVar);
        f = dsqw.newSingularGeneratedExtension(dmfs.c, dmfyVar, dmfyVar, null, 1029, dsur.MESSAGE, dmfy.class);
    }

    private dmfy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmfy();
            }
            if (i2 == 4) {
                return new dmfx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmfy.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
