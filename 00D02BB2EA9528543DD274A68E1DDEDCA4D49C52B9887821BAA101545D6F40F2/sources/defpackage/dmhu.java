package defpackage;
/* compiled from: PG */
/* renamed from: dmhu  reason: default package */
/* loaded from: classes6.dex */
public final class dmhu extends dsqw<dmhu, dmhs> implements dssk {
    public static final dmhu c;
    public static final dsqv<dmfs, dmhu> d;
    private static volatile dssr<dmhu> f;
    public int a;
    public dssd<String, String> b = dssd.b;
    private int e;

    static {
        dmhu dmhuVar = new dmhu();
        c = dmhuVar;
        dsqw.cc(dmhu.class, dmhuVar);
        d = dsqw.newSingularGeneratedExtension(dmfs.c, dmhuVar, dmhuVar, null, 1039, dsur.MESSAGE, dmhu.class);
    }

    private dmhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဌ\u0000\u00022", new Object[]{"e", "a", dmgt.a, "b", dmht.a});
            }
            if (i2 == 3) {
                return new dmhu();
            }
            if (i2 == 4) {
                return new dmhs();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmhu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmhu.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
