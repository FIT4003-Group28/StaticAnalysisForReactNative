package defpackage;
/* compiled from: PG */
/* renamed from: dkqr  reason: default package */
/* loaded from: classes.dex */
public final class dkqr extends dsqw<dkqr, dkqo> implements dssk {
    public static final dkqr d;
    private static volatile dssr<dkqr> f;
    public dkhd a;
    public int b = 60;
    public dkqq c;
    private int e;

    static {
        dkqr dkqrVar = new dkqr();
        d = dkqrVar;
        dsqw.cc(dkqr.class, dkqrVar);
    }

    private dkqr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0005င\u0004\u0007ဉ\u0006", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dkqr();
            }
            if (i2 == 4) {
                return new dkqo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkqr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkqr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
