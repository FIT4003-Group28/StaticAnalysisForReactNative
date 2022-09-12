package defpackage;
/* compiled from: PG */
/* renamed from: drlj  reason: default package */
/* loaded from: classes6.dex */
public final class drlj extends dsqw<drlj, drli> implements dssk {
    public static final drlj b;
    private static volatile dssr<drlj> c;
    public dsrj<drlh> a = dssu.b;

    static {
        drlj drljVar = new drlj();
        b = drljVar;
        dsqw.cc(drlj.class, drljVar);
    }

    private drlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drlh.class});
            }
            if (i2 == 3) {
                return new drlj();
            }
            if (i2 == 4) {
                return new drli();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drlj> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drlj.class) {
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
