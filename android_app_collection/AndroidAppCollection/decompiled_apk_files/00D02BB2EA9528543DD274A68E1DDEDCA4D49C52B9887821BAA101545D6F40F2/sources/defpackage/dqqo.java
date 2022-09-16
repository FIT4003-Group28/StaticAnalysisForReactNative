package defpackage;
/* compiled from: PG */
/* renamed from: dqqo  reason: default package */
/* loaded from: classes6.dex */
public final class dqqo extends dsqw<dqqo, dqql> implements dssk {
    public static final dqqo b;
    private static volatile dssr<dqqo> d;
    public int a;
    private int c;

    static {
        dqqo dqqoVar = new dqqo();
        b = dqqoVar;
        dsqw.cc(dqqo.class, dqqoVar);
    }

    private dqqo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dqqm.a});
            }
            if (i2 == 3) {
                return new dqqo();
            }
            if (i2 == 4) {
                return new dqql();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqqo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqqo.class) {
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
