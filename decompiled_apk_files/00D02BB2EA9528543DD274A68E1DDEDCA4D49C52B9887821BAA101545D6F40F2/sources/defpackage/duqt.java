package defpackage;
/* compiled from: PG */
/* renamed from: duqt  reason: default package */
/* loaded from: classes6.dex */
public final class duqt extends dsqw<duqt, duqs> implements dssk {
    public static final duqt b;
    private static volatile dssr<duqt> d;
    public int a;
    private int c;

    static {
        duqt duqtVar = new duqt();
        b = duqtVar;
        dsqw.cc(duqt.class, duqtVar);
    }

    private duqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", drrb.c()});
            }
            if (i2 == 3) {
                return new duqt();
            }
            if (i2 == 4) {
                return new duqs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duqt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duqt.class) {
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
