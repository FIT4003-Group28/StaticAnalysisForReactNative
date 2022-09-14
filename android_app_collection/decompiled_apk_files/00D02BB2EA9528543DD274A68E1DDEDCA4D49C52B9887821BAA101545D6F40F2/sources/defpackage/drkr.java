package defpackage;
/* compiled from: PG */
/* renamed from: drkr  reason: default package */
/* loaded from: classes6.dex */
public final class drkr extends dsqw<drkr, drkq> implements dssk {
    public static final drkr d;
    private static volatile dssr<drkr> f;
    public drdg a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        drkr drkrVar = new drkr();
        d = drkrVar;
        dsqw.cc(drkr.class, drkrVar);
    }

    private drkr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new drkr();
            }
            if (i2 == 4) {
                return new drkq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drkr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drkr.class) {
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
