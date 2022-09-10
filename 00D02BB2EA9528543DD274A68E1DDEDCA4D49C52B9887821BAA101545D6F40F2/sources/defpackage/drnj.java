package defpackage;
/* compiled from: PG */
/* renamed from: drnj  reason: default package */
/* loaded from: classes6.dex */
public final class drnj extends dsqw<drnj, drnf> implements dssk {
    public static final drnj b;
    private static volatile dssr<drnj> c;
    public dsrj<drni> a = dssu.b;

    static {
        drnj drnjVar = new drnj();
        b = drnjVar;
        dsqw.cc(drnj.class, drnjVar);
    }

    private drnj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drni.class});
            }
            if (i2 == 3) {
                return new drnj();
            }
            if (i2 == 4) {
                return new drnf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drnj.class) {
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
