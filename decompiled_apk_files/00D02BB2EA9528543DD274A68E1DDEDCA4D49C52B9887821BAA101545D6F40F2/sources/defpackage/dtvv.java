package defpackage;
/* compiled from: PG */
/* renamed from: dtvv  reason: default package */
/* loaded from: classes6.dex */
public final class dtvv extends dsqw<dtvv, dtvm> implements dssk {
    public static final dtvv b;
    private static volatile dssr<dtvv> c;
    public dtvu a;

    static {
        dtvv dtvvVar = new dtvv();
        b = dtvvVar;
        dsqw.cc(dtvv.class, dtvvVar);
    }

    private dtvv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtvv();
            }
            if (i2 == 4) {
                return new dtvm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtvv> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtvv.class) {
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
