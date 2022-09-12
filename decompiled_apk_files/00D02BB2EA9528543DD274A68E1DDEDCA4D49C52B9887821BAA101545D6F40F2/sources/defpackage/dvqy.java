package defpackage;
/* compiled from: PG */
/* renamed from: dvqy  reason: default package */
/* loaded from: classes6.dex */
public final class dvqy extends dsqw<dvqy, dvqx> implements dssk {
    public static final dvqy e;
    private static volatile dssr<dvqy> f;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<dvqw> d = dssu.b;

    static {
        dvqy dvqyVar = new dvqy();
        e = dvqyVar;
        dsqw.cc(dvqy.class, dvqyVar);
    }

    private dvqy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", dvqw.class});
            }
            if (i2 == 3) {
                return new dvqy();
            }
            if (i2 == 4) {
                return new dvqx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvqy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
