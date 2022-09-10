package defpackage;
/* compiled from: PG */
/* renamed from: dqcd  reason: default package */
/* loaded from: classes6.dex */
public final class dqcd extends dsqw<dqcd, dqcc> implements dssk {
    public static final dqcd b;
    private static volatile dssr<dqcd> c;
    public dsrj<dpua> a = dssu.b;

    static {
        dqcd dqcdVar = new dqcd();
        b = dqcdVar;
        dsqw.cc(dqcd.class, dqcdVar);
    }

    private dqcd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpua.class});
            }
            if (i2 == 3) {
                return new dqcd();
            }
            if (i2 == 4) {
                return new dqcc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqcd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqcd.class) {
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
