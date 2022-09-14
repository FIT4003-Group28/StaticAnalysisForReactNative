package defpackage;
/* compiled from: PG */
/* renamed from: ddln  reason: default package */
/* loaded from: classes5.dex */
public final class ddln extends dsqw<ddln, ddlm> implements dssk {
    public static final ddln a;
    private static volatile dssr<ddln> b;

    static {
        ddln ddlnVar = new ddln();
        a = ddlnVar;
        dsqw.cc(ddln.class, ddlnVar);
    }

    private ddln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddln();
            }
            if (i2 == 4) {
                return new ddlm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddln> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ddln.class) {
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
