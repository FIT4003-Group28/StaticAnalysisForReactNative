package defpackage;
/* compiled from: PG */
/* renamed from: dwwt  reason: default package */
/* loaded from: classes.dex */
public final class dwwt extends dsqw<dwwt, dwws> implements dssk {
    public static final dwwt d;
    private static volatile dssr<dwwt> f;
    public boolean a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        dwwt dwwtVar = new dwwt();
        d = dwwtVar;
        dsqw.cc(dwwt.class, dwwtVar);
    }

    private dwwt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwwt();
            }
            if (i2 == 4) {
                return new dwws();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwwt.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
