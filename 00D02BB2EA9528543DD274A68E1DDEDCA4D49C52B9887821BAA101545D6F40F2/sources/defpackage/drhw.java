package defpackage;
/* compiled from: PG */
/* renamed from: drhw  reason: default package */
/* loaded from: classes6.dex */
public final class drhw extends dsqw<drhw, drhv> implements dssk {
    public static final drhw b;
    private static volatile dssr<drhw> c;
    public dsrj<drhu> a = dssu.b;

    static {
        drhw drhwVar = new drhw();
        b = drhwVar;
        dsqw.cc(drhw.class, drhwVar);
    }

    private drhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drhu.class});
            }
            if (i2 == 3) {
                return new drhw();
            }
            if (i2 == 4) {
                return new drhv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drhw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drhw.class) {
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
