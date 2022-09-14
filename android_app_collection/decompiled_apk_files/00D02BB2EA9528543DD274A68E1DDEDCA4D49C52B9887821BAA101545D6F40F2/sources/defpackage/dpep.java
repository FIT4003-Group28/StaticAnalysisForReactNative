package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: dpep  reason: default package */
/* loaded from: classes6.dex */
public final class dpep extends dsqw<dpep, dpek> implements dssk {
    public static final dpep b;
    private static volatile dssr<dpep> c;
    public dsrj<dpeo> a = dssu.b;

    static {
        dpep dpepVar = new dpep();
        b = dpepVar;
        dsqw.cc(dpep.class, dpepVar);
    }

    private dpep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dpeo.class});
            }
            if (i2 == 3) {
                return new dpep();
            }
            if (i2 == 4) {
                return new dpek();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpep> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dpep.class) {
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
