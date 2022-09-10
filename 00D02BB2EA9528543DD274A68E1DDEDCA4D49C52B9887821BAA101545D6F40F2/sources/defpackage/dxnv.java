package defpackage;
/* compiled from: PG */
/* renamed from: dxnv  reason: default package */
/* loaded from: classes6.dex */
public final class dxnv extends dsqw<dxnv, dxnu> implements dssk {
    public static final dxnv c;
    private static volatile dssr<dxnv> d;
    public dxnx a;
    public dxmg b;

    static {
        dxnv dxnvVar = new dxnv();
        c = dxnvVar;
        dsqw.cc(dxnv.class, dxnvVar);
    }

    private dxnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxnv();
            }
            if (i2 == 4) {
                return new dxnu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxnv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxnv.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
