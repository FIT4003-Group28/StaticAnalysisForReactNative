package defpackage;
/* compiled from: PG */
/* renamed from: ddix  reason: default package */
/* loaded from: classes.dex */
public final class ddix extends dsqw<ddix, ddiw> implements dssk {
    public static final ddix d;
    private static volatile dssr<ddix> e;
    public int a;
    public dsrj<ddin> b = dssu.b;
    public ddiv c;

    static {
        ddix ddixVar = new ddix();
        d = ddixVar;
        dsqw.cc(ddix.class, ddixVar);
    }

    private ddix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", ddin.class, "c"});
            }
            if (i2 == 3) {
                return new ddix();
            }
            if (i2 == 4) {
                return new ddiw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddix> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddix.class) {
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
