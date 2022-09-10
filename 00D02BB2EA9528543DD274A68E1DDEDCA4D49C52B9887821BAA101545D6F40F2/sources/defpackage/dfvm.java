package defpackage;
/* compiled from: PG */
/* renamed from: dfvm  reason: default package */
/* loaded from: classes6.dex */
public final class dfvm extends dsqw<dfvm, dfvl> implements dssk {
    public static final dfvm a;
    private static volatile dssr<dfvm> b;

    static {
        dfvm dfvmVar = new dfvm();
        a = dfvmVar;
        dsqw.cc(dfvm.class, dfvmVar);
    }

    private dfvm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfvm();
            }
            if (i2 == 4) {
                return new dfvl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfvm.class) {
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
