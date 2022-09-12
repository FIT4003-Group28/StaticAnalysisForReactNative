package defpackage;
/* compiled from: PG */
/* renamed from: dufr  reason: default package */
/* loaded from: classes6.dex */
public final class dufr extends dsqw<dufr, dufo> implements dssk {
    public static final dufr d;
    private static volatile dssr<dufr> f;
    public int a = 0;
    public Object b;
    public int c;
    private int e;

    static {
        dufr dufrVar = new dufr();
        d = dufrVar;
        dsqw.cc(dufr.class, dufrVar);
    }

    private dufr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002့\u0000", new Object[]{"b", "a", "e", "c", dufp.a});
            }
            if (i2 == 3) {
                return new dufr();
            }
            if (i2 == 4) {
                return new dufo();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dufr.class) {
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
