package defpackage;
/* compiled from: PG */
/* renamed from: drgj  reason: default package */
/* loaded from: classes6.dex */
public final class drgj extends dsqw<drgj, drgi> implements dssk {
    public static final drgj c;
    private static volatile dssr<drgj> d;
    public int a = 0;
    public Object b;

    static {
        drgj drgjVar = new drgj();
        c = drgjVar;
        dsqw.cc(drgj.class, drgjVar);
    }

    private drgj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dqdk.class});
            }
            if (i2 == 3) {
                return new drgj();
            }
            if (i2 == 4) {
                return new drgi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drgj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
