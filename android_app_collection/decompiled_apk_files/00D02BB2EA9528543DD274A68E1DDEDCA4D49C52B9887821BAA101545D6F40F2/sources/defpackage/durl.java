package defpackage;
/* compiled from: PG */
/* renamed from: durl  reason: default package */
/* loaded from: classes6.dex */
public final class durl extends dsqw<durl, duri> implements dssk {
    public static final durl b;
    private static volatile dssr<durl> d;
    public int a;
    private int c;

    static {
        durl durlVar = new durl();
        b = durlVar;
        dsqw.cc(durl.class, durlVar);
    }

    private durl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", durj.a});
            }
            if (i2 == 3) {
                return new durl();
            }
            if (i2 == 4) {
                return new duri();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (durl.class) {
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
