package defpackage;
/* compiled from: PG */
/* renamed from: dlsa  reason: default package */
/* loaded from: classes6.dex */
public final class dlsa extends dsqw<dlsa, dlrz> implements dssk {
    public static final dlsa b;
    private static volatile dssr<dlsa> d;
    public int a;
    private int c;

    static {
        dlsa dlsaVar = new dlsa();
        b = dlsaVar;
        dsqw.cc(dlsa.class, dlsaVar);
    }

    private dlsa() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"c", "a", dluv.a});
            }
            if (i2 == 3) {
                return new dlsa();
            }
            if (i2 == 4) {
                return new dlrz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsa> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsa.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
