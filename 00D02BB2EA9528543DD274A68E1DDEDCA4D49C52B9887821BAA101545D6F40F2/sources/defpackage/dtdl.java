package defpackage;
/* compiled from: PG */
/* renamed from: dtdl  reason: default package */
/* loaded from: classes6.dex */
public final class dtdl extends dsqw<dtdl, dtdk> implements dssk {
    public static final dtdl a;
    private static volatile dssr<dtdl> b;

    static {
        dtdl dtdlVar = new dtdl();
        a = dtdlVar;
        dsqw.cc(dtdl.class, dtdlVar);
    }

    private dtdl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtdl();
            }
            if (i2 == 4) {
                return new dtdk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtdl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtdl.class) {
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
