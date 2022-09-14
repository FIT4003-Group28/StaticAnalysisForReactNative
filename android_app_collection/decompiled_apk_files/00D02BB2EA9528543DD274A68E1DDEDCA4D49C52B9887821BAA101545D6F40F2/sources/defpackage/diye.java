package defpackage;
/* compiled from: PG */
/* renamed from: diye  reason: default package */
/* loaded from: classes6.dex */
public final class diye extends dsqw<diye, diyb> implements dssk {
    public static final diye b;
    private static volatile dssr<diye> d;
    public int a;
    private int c;

    static {
        diye diyeVar = new diye();
        b = diyeVar;
        dsqw.cc(diye.class, diyeVar);
    }

    private diye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", diyc.a});
            }
            if (i2 == 3) {
                return new diye();
            }
            if (i2 == 4) {
                return new diyb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diye> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diye.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
