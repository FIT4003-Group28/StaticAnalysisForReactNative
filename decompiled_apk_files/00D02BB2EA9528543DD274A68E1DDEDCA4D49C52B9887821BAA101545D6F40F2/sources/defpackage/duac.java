package defpackage;
/* compiled from: PG */
/* renamed from: duac  reason: default package */
/* loaded from: classes6.dex */
public final class duac extends dsqw<duac, duab> implements dssk {
    public static final duac b;
    private static volatile dssr<duac> c;
    public boolean a;

    static {
        duac duacVar = new duac();
        b = duacVar;
        dsqw.cc(duac.class, duacVar);
    }

    private duac() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new duac();
            }
            if (i2 == 4) {
                return new duab();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duac> dssrVar = c;
            if (dssrVar == null) {
                synchronized (duac.class) {
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
