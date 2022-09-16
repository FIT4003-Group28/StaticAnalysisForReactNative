package defpackage;
/* compiled from: PG */
/* renamed from: disj  reason: default package */
/* loaded from: classes6.dex */
public final class disj extends dsqw<disj, disg> implements dssk {
    public static final disj b;
    private static volatile dssr<disj> c;
    public dsrj<disi> a = dssu.b;

    static {
        disj disjVar = new disj();
        b = disjVar;
        dsqw.cc(disj.class, disjVar);
    }

    private disj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", disi.class});
            }
            if (i2 == 3) {
                return new disj();
            }
            if (i2 == 4) {
                return new disg();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (disj.class) {
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
