package defpackage;
/* compiled from: PG */
/* renamed from: dumo  reason: default package */
/* loaded from: classes6.dex */
public final class dumo extends dsqw<dumo, dumn> implements dssk {
    public static final dumo a;
    private static volatile dssr<dumo> b;

    static {
        dumo dumoVar = new dumo();
        a = dumoVar;
        dsqw.cc(dumo.class, dumoVar);
    }

    private dumo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dumo();
            }
            if (i2 == 4) {
                return new dumn();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dumo> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dumo.class) {
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
