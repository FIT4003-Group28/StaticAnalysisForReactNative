package defpackage;
/* compiled from: PG */
/* renamed from: dsdw  reason: default package */
/* loaded from: classes6.dex */
public final class dsdw extends dsqw<dsdw, dsdt> implements dssk {
    public static final dsdw b;
    private static volatile dssr<dsdw> c;
    public dsrj<dsdv> a = dssu.b;

    static {
        dsdw dsdwVar = new dsdw();
        b = dsdwVar;
        dsqw.cc(dsdw.class, dsdwVar);
    }

    private dsdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dsdv.class});
            }
            if (i2 == 3) {
                return new dsdw();
            }
            if (i2 == 4) {
                return new dsdt();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsdw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dsdw.class) {
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
