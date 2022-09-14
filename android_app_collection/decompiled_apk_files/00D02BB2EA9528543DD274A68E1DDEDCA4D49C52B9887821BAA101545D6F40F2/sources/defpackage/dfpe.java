package defpackage;
/* compiled from: PG */
/* renamed from: dfpe  reason: default package */
/* loaded from: classes6.dex */
public final class dfpe extends dsqw<dfpe, dfox> implements dssk {
    public static final dfpe c;
    private static volatile dssr<dfpe> d;
    public int a = 0;
    public Object b;

    static {
        dfpe dfpeVar = new dfpe();
        c = dfpeVar;
        dsqw.cc(dfpe.class, dfpeVar);
    }

    private dfpe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dfpd.c(), dfpb.class});
            }
            if (i2 == 3) {
                return new dfpe();
            }
            if (i2 == 4) {
                return new dfox();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfpe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfpe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
