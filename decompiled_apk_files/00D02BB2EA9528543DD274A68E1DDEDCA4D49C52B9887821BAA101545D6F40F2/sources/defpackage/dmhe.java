package defpackage;
/* compiled from: PG */
/* renamed from: dmhe  reason: default package */
/* loaded from: classes6.dex */
public final class dmhe extends dsqw<dmhe, dmhb> implements dssk {
    public static final dmhe b;
    public static final dsqv<dmfs, dmhe> c;
    private static volatile dssr<dmhe> e;
    public int a;
    private int d;

    static {
        dmhe dmheVar = new dmhe();
        b = dmheVar;
        dsqw.cc(dmhe.class, dmheVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmheVar, dmheVar, null, 1036, dsur.MESSAGE, dmhe.class);
    }

    private dmhe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", dmhc.a});
            }
            if (i2 == 3) {
                return new dmhe();
            }
            if (i2 == 4) {
                return new dmhb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmhe.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
