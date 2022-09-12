package defpackage;
/* compiled from: PG */
/* renamed from: dmfi  reason: default package */
/* loaded from: classes6.dex */
public final class dmfi extends dsqw<dmfi, dmfh> implements dssk {
    public static final dmfi c;
    public static final dsqv<dmfu, dmfi> d;
    private static volatile dssr<dmfi> e;
    public int a;
    public dnwb b;

    static {
        dmfi dmfiVar = new dmfi();
        c = dmfiVar;
        dsqw.cc(dmfi.class, dmfiVar);
        d = dsqw.newSingularGeneratedExtension(dmfu.e, dmfiVar, dmfiVar, null, 1000, dsur.MESSAGE, dmfi.class);
    }

    private dmfi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dmfi();
            }
            if (i2 == 4) {
                return new dmfh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmfi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmfi.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
