package defpackage;
/* compiled from: PG */
/* renamed from: dluf  reason: default package */
/* loaded from: classes6.dex */
public final class dluf extends dsqw<dluf, dlue> implements dssk {
    public static final dluf b;
    private static volatile dssr<dluf> d;
    public dspd a = dspd.b;
    private int c;

    static {
        dluf dlufVar = new dluf();
        b = dlufVar;
        dsqw.cc(dluf.class, dlufVar);
    }

    private dluf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dluf();
            }
            if (i2 == 4) {
                return new dlue();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dluf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dluf.class) {
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
