package defpackage;
/* compiled from: PG */
/* renamed from: dtzc  reason: default package */
/* loaded from: classes.dex */
public final class dtzc extends dsqw<dtzc, dtzb> implements dssk {
    public static final dtzc b;
    private static volatile dssr<dtzc> c;
    public dsrj<dtza> a = dssu.b;

    static {
        dtzc dtzcVar = new dtzc();
        b = dtzcVar;
        dsqw.cc(dtzc.class, dtzcVar);
    }

    private dtzc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dtza.class});
            }
            if (i2 == 3) {
                return new dtzc();
            }
            if (i2 == 4) {
                return new dtzb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtzc.class) {
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
