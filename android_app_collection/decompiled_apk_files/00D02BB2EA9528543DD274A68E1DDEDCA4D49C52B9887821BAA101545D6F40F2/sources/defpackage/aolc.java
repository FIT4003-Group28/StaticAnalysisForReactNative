package defpackage;
/* compiled from: PG */
/* renamed from: aolc  reason: default package */
/* loaded from: classes2.dex */
public final class aolc extends dsqw<aolc, aolb> implements dssk {
    public static final aolc b;
    private static volatile dssr<aolc> c;
    public dsrj<aola> a = dssu.b;

    static {
        aolc aolcVar = new aolc();
        b = aolcVar;
        dsqw.cc(aolc.class, aolcVar);
    }

    private aolc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aola.class});
            }
            if (i2 == 3) {
                return new aolc();
            }
            if (i2 == 4) {
                return new aolb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aolc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aolc.class) {
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
