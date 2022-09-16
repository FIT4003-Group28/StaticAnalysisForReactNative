package defpackage;
/* compiled from: PG */
/* renamed from: dvjn  reason: default package */
/* loaded from: classes6.dex */
public final class dvjn extends dsqw<dvjn, dvjm> implements dssk {
    public static final dvjn b;
    private static volatile dssr<dvjn> c;
    public dsrj<dnvu> a = dssu.b;

    static {
        dvjn dvjnVar = new dvjn();
        b = dvjnVar;
        dsqw.cc(dvjn.class, dvjnVar);
    }

    private dvjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", dnvu.class});
            }
            if (i2 == 3) {
                return new dvjn();
            }
            if (i2 == 4) {
                return new dvjm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvjn> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dvjn.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
