package defpackage;
/* compiled from: PG */
/* renamed from: dvqe  reason: default package */
/* loaded from: classes6.dex */
public final class dvqe extends dsqw<dvqe, dvqb> implements dssk {
    public static final dvqe b;
    private static volatile dssr<dvqe> d;
    public int a;
    private int c;

    static {
        dvqe dvqeVar = new dvqe();
        b = dvqeVar;
        dsqw.cc(dvqe.class, dvqeVar);
    }

    private dvqe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dvqc.a});
            }
            if (i2 == 3) {
                return new dvqe();
            }
            if (i2 == 4) {
                return new dvqb();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvqe.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
