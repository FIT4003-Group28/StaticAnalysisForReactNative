package defpackage;
/* compiled from: PG */
/* renamed from: dlsp  reason: default package */
/* loaded from: classes6.dex */
public final class dlsp extends dsqw<dlsp, dlso> implements dssk {
    public static final dlsp b;
    private static volatile dssr<dlsp> d;
    public int a;
    private int c;

    static {
        dlsp dlspVar = new dlsp();
        b = dlspVar;
        dsqw.cc(dlsp.class, dlspVar);
    }

    private dlsp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dvfm.a});
            }
            if (i2 == 3) {
                return new dlsp();
            }
            if (i2 == 4) {
                return new dlso();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsp.class) {
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
