package defpackage;
/* compiled from: PG */
/* renamed from: dlxo  reason: default package */
/* loaded from: classes.dex */
public final class dlxo extends dsqw<dlxo, dlxl> implements dssk {
    public static final dlxo c;
    private static volatile dssr<dlxo> d;
    public int a;
    public int b;

    static {
        dlxo dlxoVar = new dlxo();
        c = dlxoVar;
        dsqw.cc(dlxo.class, dlxoVar);
    }

    private dlxo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dlxm.a});
            }
            if (i2 == 3) {
                return new dlxo();
            }
            if (i2 == 4) {
                return new dlxl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlxo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlxo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
