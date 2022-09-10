package defpackage;
/* compiled from: PG */
/* renamed from: dwqt  reason: default package */
/* loaded from: classes6.dex */
public final class dwqt extends dsqw<dwqt, dwqq> implements dssk {
    public static final dwqt d;
    private static volatile dssr<dwqt> f;
    public dwqs b;
    private int e;
    public dspd a = dspd.b;
    public String c = "";

    static {
        dwqt dwqtVar = new dwqt();
        d = dwqtVar;
        dsqw.cc(dwqt.class, dwqtVar);
    }

    private dwqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dwqt();
            }
            if (i2 == 4) {
                return new dwqq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwqt> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dwqt.class) {
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
