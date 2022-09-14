package defpackage;
/* compiled from: PG */
/* renamed from: ddtd  reason: default package */
/* loaded from: classes6.dex */
public final class ddtd extends dsqw<ddtd, ddtc> implements dssk {
    public static final ddtd d;
    private static volatile dssr<ddtd> e;
    public int a;
    public int b;
    public ddtj c;

    static {
        ddtd ddtdVar = new ddtd();
        d = ddtdVar;
        dsqw.cc(ddtd.class, ddtdVar);
    }

    private ddtd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddtd();
            }
            if (i2 == 4) {
                return new ddtc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddtd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
