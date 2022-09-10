package defpackage;
/* compiled from: PG */
/* renamed from: dxro  reason: default package */
/* loaded from: classes6.dex */
public final class dxro extends dsqw<dxro, dxrn> implements dssk {
    public static final dxro b;
    private static volatile dssr<dxro> c;
    public dsrj<dxrw> a = dssu.b;

    static {
        dxro dxroVar = new dxro();
        b = dxroVar;
        dsqw.cc(dxro.class, dxroVar);
    }

    private dxro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dxrw.class});
            }
            if (i2 == 3) {
                return new dxro();
            }
            if (i2 == 4) {
                return new dxrn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxro> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dxro.class) {
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
