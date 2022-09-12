package defpackage;
/* compiled from: PG */
/* renamed from: dvkd  reason: default package */
/* loaded from: classes6.dex */
public final class dvkd extends dsqw<dvkd, dvkc> implements dssk {
    public static final dvkd a;
    private static volatile dssr<dvkd> b;

    static {
        dvkd dvkdVar = new dvkd();
        a = dvkdVar;
        dsqw.cc(dvkd.class, dvkdVar);
    }

    private dvkd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvkd();
            }
            if (i2 == 4) {
                return new dvkc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvkd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvkd.class) {
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
