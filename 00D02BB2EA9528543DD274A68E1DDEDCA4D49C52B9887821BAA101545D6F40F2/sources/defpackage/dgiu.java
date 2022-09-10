package defpackage;
/* compiled from: PG */
/* renamed from: dgiu  reason: default package */
/* loaded from: classes6.dex */
public final class dgiu extends dsqw<dgiu, dgit> implements dssk {
    public static final dgiu b;
    private static volatile dssr<dgiu> d;
    public String a = "";
    private int c;

    static {
        dgiu dgiuVar = new dgiu();
        b = dgiuVar;
        dsqw.cc(dgiu.class, dgiuVar);
    }

    private dgiu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgiu();
            }
            if (i2 == 4) {
                return new dgit();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgiu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgiu.class) {
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
