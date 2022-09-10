package defpackage;
/* compiled from: PG */
/* renamed from: duof  reason: default package */
/* loaded from: classes.dex */
public final class duof extends dsqw<duof, duoe> implements dssk {
    public static final duof a;
    private static volatile dssr<duof> b;

    static {
        duof duofVar = new duof();
        a = duofVar;
        dsqw.cc(duof.class, duofVar);
    }

    private duof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new duof();
            }
            if (i2 == 4) {
                return new duoe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duof> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duof.class) {
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
