package defpackage;
/* compiled from: PG */
/* renamed from: duau  reason: default package */
/* loaded from: classes6.dex */
public final class duau extends dsqw<duau, duat> implements dssk {
    public static final duau a;
    private static volatile dssr<duau> b;

    static {
        duau duauVar = new duau();
        a = duauVar;
        dsqw.cc(duau.class, duauVar);
    }

    private duau() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0000", null);
            }
            if (i2 == 3) {
                return new duau();
            }
            if (i2 == 4) {
                return new duat();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duau> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duau.class) {
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
