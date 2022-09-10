package defpackage;
/* compiled from: PG */
/* renamed from: dvkf  reason: default package */
/* loaded from: classes6.dex */
public final class dvkf extends dsqw<dvkf, dvke> implements dssk {
    public static final dvkf a;
    private static volatile dssr<dvkf> b;

    static {
        dvkf dvkfVar = new dvkf();
        a = dvkfVar;
        dsqw.cc(dvkf.class, dvkfVar);
    }

    private dvkf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvkf();
            }
            if (i2 == 4) {
                return new dvke();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvkf.class) {
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
