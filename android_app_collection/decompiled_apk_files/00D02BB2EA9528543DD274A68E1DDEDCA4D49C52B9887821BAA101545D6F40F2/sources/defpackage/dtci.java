package defpackage;
/* compiled from: PG */
/* renamed from: dtci  reason: default package */
/* loaded from: classes6.dex */
public final class dtci extends dsqw<dtci, dtch> implements dssk {
    public static final dtci b;
    private static volatile dssr<dtci> c;
    public dsri a = dsrx.b;

    static {
        dtci dtciVar = new dtci();
        b = dtciVar;
        dsqw.cc(dtci.class, dtciVar);
    }

    private dtci() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002%", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dtci();
            }
            if (i2 == 4) {
                return new dtch();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtci> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dtci.class) {
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
