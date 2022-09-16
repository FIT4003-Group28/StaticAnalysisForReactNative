package defpackage;
/* compiled from: PG */
/* renamed from: dvpl  reason: default package */
/* loaded from: classes6.dex */
public final class dvpl extends dsqw<dvpl, dvpk> implements dssk {
    public static final dvpl a;
    private static volatile dssr<dvpl> b;

    static {
        dvpl dvplVar = new dvpl();
        a = dvplVar;
        dsqw.cc(dvpl.class, dvplVar);
    }

    private dvpl() {
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
                return new dvpl();
            }
            if (i2 == 4) {
                return new dvpk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvpl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvpl.class) {
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
