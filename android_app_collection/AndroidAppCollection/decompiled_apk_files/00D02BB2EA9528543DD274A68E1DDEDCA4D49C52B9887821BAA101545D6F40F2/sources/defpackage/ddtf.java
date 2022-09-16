package defpackage;
/* compiled from: PG */
/* renamed from: ddtf  reason: default package */
/* loaded from: classes6.dex */
public final class ddtf extends dsqw<ddtf, ddte> implements dssk {
    public static final ddtf d;
    private static volatile dssr<ddtf> e;
    public int a;
    public int b;
    public ddtj c;

    static {
        ddtf ddtfVar = new ddtf();
        d = ddtfVar;
        dsqw.cc(ddtf.class, ddtfVar);
    }

    private ddtf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddtf();
            }
            if (i2 == 4) {
                return new ddte();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddtf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddtf.class) {
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
