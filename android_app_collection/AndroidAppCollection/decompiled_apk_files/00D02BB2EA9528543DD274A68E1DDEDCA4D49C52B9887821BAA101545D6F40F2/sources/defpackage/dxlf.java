package defpackage;
/* compiled from: PG */
/* renamed from: dxlf  reason: default package */
/* loaded from: classes6.dex */
public final class dxlf extends dsqw<dxlf, dxle> implements dssk {
    public static final dxlf c;
    private static volatile dssr<dxlf> d;
    public int a;
    public dsok b;

    static {
        dxlf dxlfVar = new dxlf();
        c = dxlfVar;
        dsqw.cc(dxlf.class, dxlfVar);
    }

    private dxlf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dxlf();
            }
            if (i2 == 4) {
                return new dxle();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxlf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dxlf.class) {
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
