package defpackage;
/* compiled from: PG */
/* renamed from: doiy  reason: default package */
/* loaded from: classes6.dex */
public final class doiy extends dsqw<doiy, doit> implements dssk {
    public static final doiy b;
    private static volatile dssr<doiy> c;
    public dsrj<doix> a = dssu.b;

    static {
        doiy doiyVar = new doiy();
        b = doiyVar;
        dsqw.cc(doiy.class, doiyVar);
    }

    private doiy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", doix.class});
            }
            if (i2 == 3) {
                return new doiy();
            }
            if (i2 == 4) {
                return new doit();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doiy> dssrVar = c;
            if (dssrVar == null) {
                synchronized (doiy.class) {
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
