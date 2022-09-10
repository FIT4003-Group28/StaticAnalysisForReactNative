package defpackage;
/* compiled from: PG */
/* renamed from: vvo  reason: default package */
/* loaded from: classes7.dex */
public final class vvo extends dsqw<vvo, vvm> implements dssk {
    public static final vvo b;
    private static volatile dssr<vvo> c;
    public dssd<String, Long> a = dssd.b;

    static {
        vvo vvoVar = new vvo();
        b = vvoVar;
        dsqw.cc(vvo.class, vvoVar);
    }

    private vvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", vvn.a});
            }
            if (i2 == 3) {
                return new vvo();
            }
            if (i2 == 4) {
                return new vvm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<vvo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (vvo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
