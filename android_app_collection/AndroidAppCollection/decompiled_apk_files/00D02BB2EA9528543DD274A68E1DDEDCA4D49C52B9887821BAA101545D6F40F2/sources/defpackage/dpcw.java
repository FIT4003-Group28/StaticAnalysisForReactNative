package defpackage;
/* compiled from: PG */
/* renamed from: dpcw  reason: default package */
/* loaded from: classes6.dex */
public final class dpcw extends dsqw<dpcw, dpcv> implements dssk {
    public static final dpcw c;
    private static volatile dssr<dpcw> e;
    public int a;
    public int b;
    private int d;

    static {
        dpcw dpcwVar = new dpcw();
        c = dpcwVar;
        dsqw.cc(dpcw.class, dpcwVar);
    }

    private dpcw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dpcw();
            }
            if (i2 == 4) {
                return new dpcv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpcw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpcw.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
