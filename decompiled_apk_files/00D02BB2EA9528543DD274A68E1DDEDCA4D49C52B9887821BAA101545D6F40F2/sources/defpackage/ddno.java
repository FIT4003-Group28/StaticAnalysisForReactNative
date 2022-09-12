package defpackage;
/* compiled from: PG */
/* renamed from: ddno  reason: default package */
/* loaded from: classes.dex */
public final class ddno extends dsqw<ddno, ddnn> implements dssk {
    public static final ddno a;
    private static volatile dssr<ddno> b;

    static {
        ddno ddnoVar = new ddno();
        a = ddnoVar;
        dsqw.cc(ddno.class, ddnoVar);
    }

    private ddno() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddno();
            }
            if (i2 == 4) {
                return new ddnn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddno> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddno.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
