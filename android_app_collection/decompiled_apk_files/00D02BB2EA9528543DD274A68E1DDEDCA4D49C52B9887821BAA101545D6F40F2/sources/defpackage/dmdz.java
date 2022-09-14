package defpackage;
/* compiled from: PG */
/* renamed from: dmdz  reason: default package */
/* loaded from: classes6.dex */
public final class dmdz extends dsqw<dmdz, dmdy> implements dssk {
    public static final dmdz b;
    public static final dsqv<dmfs, dmdz> c;
    private static volatile dssr<dmdz> e;
    public dspd a = dspd.b;
    private int d;

    static {
        dmdz dmdzVar = new dmdz();
        b = dmdzVar;
        dsqw.cc(dmdz.class, dmdzVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmdzVar, dmdzVar, null, 1002, dsur.MESSAGE, dmdz.class);
    }

    private dmdz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmdz();
            }
            if (i2 == 4) {
                return new dmdy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmdz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmdz.class) {
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
