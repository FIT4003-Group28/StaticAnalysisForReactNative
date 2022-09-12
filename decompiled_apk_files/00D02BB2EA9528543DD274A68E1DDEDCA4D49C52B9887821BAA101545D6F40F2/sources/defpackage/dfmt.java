package defpackage;
/* compiled from: PG */
/* renamed from: dfmt  reason: default package */
/* loaded from: classes6.dex */
public final class dfmt extends dsqw<dfmt, dfms> implements dssk {
    public static final dfmt a;
    private static volatile dssr<dfmt> b;

    static {
        dfmt dfmtVar = new dfmt();
        a = dfmtVar;
        dsqw.cc(dfmt.class, dfmtVar);
    }

    private dfmt() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new dfmt();
            }
            if (i2 == 4) {
                return new dfms();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfmt.class) {
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
