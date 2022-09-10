package defpackage;
/* compiled from: PG */
/* renamed from: dkqf  reason: default package */
/* loaded from: classes.dex */
public final class dkqf extends dsqw<dkqf, dkqe> implements dssk {
    public static final dkqf b;
    private static volatile dssr<dkqf> d;
    public boolean a;
    private int c;

    static {
        dkqf dkqfVar = new dkqf();
        b = dkqfVar;
        dsqw.cc(dkqf.class, dkqfVar);
    }

    private dkqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0002", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkqf();
            }
            if (i2 == 4) {
                return new dkqe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkqf.class) {
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
