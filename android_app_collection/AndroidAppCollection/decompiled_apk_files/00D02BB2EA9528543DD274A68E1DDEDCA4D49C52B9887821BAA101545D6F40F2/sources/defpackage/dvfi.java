package defpackage;
/* compiled from: PG */
/* renamed from: dvfi  reason: default package */
/* loaded from: classes6.dex */
public final class dvfi extends dsqw<dvfi, dvfh> implements dssk {
    public static final dvfi a;
    private static volatile dssr<dvfi> b;

    static {
        dvfi dvfiVar = new dvfi();
        a = dvfiVar;
        dsqw.cc(dvfi.class, dvfiVar);
    }

    private dvfi() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvfi();
            }
            if (i2 == 4) {
                return new dvfh();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvfi> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvfi.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
