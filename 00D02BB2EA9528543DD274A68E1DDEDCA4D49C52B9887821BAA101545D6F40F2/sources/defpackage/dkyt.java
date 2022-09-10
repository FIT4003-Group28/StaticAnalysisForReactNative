package defpackage;
/* compiled from: PG */
/* renamed from: dkyt  reason: default package */
/* loaded from: classes6.dex */
public final class dkyt extends dsqw<dkyt, dkys> implements dssk {
    public static final dkyt a;
    private static volatile dssr<dkyt> b;

    static {
        dkyt dkytVar = new dkyt();
        a = dkytVar;
        dsqw.cc(dkyt.class, dkytVar);
    }

    private dkyt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dkyt();
            }
            if (i2 == 4) {
                return new dkys();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkyt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkyt.class) {
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
