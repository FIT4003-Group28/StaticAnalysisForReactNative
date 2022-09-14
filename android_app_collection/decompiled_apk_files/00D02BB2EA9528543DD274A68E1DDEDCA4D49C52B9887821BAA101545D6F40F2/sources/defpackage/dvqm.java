package defpackage;
/* compiled from: PG */
/* renamed from: dvqm  reason: default package */
/* loaded from: classes6.dex */
public final class dvqm extends dsqw<dvqm, dvql> implements dssk {
    public static final dvqm c;
    private static volatile dssr<dvqm> d;
    public int a;
    public String b = "";

    static {
        dvqm dvqmVar = new dvqm();
        c = dvqmVar;
        dsqw.cc(dvqm.class, dvqmVar);
    }

    private dvqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvqm();
            }
            if (i2 == 4) {
                return new dvql();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvqm.class) {
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
