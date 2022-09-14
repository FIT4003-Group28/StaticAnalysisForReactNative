package defpackage;
/* compiled from: PG */
/* renamed from: dxtf  reason: default package */
/* loaded from: classes6.dex */
public final class dxtf extends dsqw<dxtf, dxte> implements dssk {
    public static final dxtf b;
    private static volatile dssr<dxtf> c;
    public dxsy a;

    static {
        dxtf dxtfVar = new dxtf();
        b = dxtfVar;
        dsqw.cc(dxtf.class, dxtfVar);
    }

    private dxtf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dxtf();
            }
            if (i2 == 4) {
                return new dxte();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxtf> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxtf.class) {
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
