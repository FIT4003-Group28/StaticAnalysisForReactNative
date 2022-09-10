package defpackage;
/* compiled from: PG */
/* renamed from: dkuh  reason: default package */
/* loaded from: classes6.dex */
public final class dkuh extends dsqw<dkuh, dkug> implements dssk {
    public static final dkuh b;
    private static volatile dssr<dkuh> d;
    public int a;
    private int c;

    static {
        dkuh dkuhVar = new dkuh();
        b = dkuhVar;
        dsqw.cc(dkuh.class, dkuhVar);
    }

    private dkuh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dktk.c()});
            }
            if (i2 == 3) {
                return new dkuh();
            }
            if (i2 == 4) {
                return new dkug();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkuh> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkuh.class) {
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
