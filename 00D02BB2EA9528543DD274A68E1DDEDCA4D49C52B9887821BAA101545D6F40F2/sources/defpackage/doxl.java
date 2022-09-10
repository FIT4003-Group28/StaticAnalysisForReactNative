package defpackage;
/* compiled from: PG */
/* renamed from: doxl  reason: default package */
/* loaded from: classes6.dex */
public final class doxl extends dsqw<doxl, doxg> implements dssk {
    public static final doxl b;
    private static volatile dssr<doxl> c;
    public dsrj<doxk> a = dssu.b;

    static {
        doxl doxlVar = new doxl();
        b = doxlVar;
        dsqw.cc(doxl.class, doxlVar);
    }

    private doxl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doxk.class});
            }
            if (i2 == 3) {
                return new doxl();
            }
            if (i2 == 4) {
                return new doxg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxl> dssrVar = c;
            if (dssrVar == null) {
                synchronized (doxl.class) {
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
