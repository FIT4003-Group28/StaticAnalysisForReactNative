package defpackage;
/* compiled from: PG */
/* renamed from: chxh  reason: default package */
/* loaded from: classes4.dex */
public final class chxh extends dsqw<chxh, chww> implements dssk {
    public static final chxh b;
    private static volatile dssr<chxh> c;
    public dsrj<chxg> a = dssu.b;

    static {
        chxh chxhVar = new chxh();
        b = chxhVar;
        dsqw.cc(chxh.class, chxhVar);
    }

    private chxh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", chxg.class});
            }
            if (i2 == 3) {
                return new chxh();
            }
            if (i2 == 4) {
                return new chww();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<chxh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (chxh.class) {
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
