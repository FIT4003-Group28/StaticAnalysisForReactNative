package defpackage;
/* compiled from: PG */
/* renamed from: dvzf  reason: default package */
/* loaded from: classes.dex */
public final class dvzf extends dsqw<dvzf, dvze> implements dssk {
    public static final dvzf e;
    private static volatile dssr<dvzf> f;
    public int a;
    public String b = "";
    public String c = "";
    public dgly d;

    static {
        dvzf dvzfVar = new dvzf();
        e = dvzfVar;
        dsqw.cc(dvzf.class, dvzfVar);
    }

    private dvzf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvzf();
            }
            if (i2 == 4) {
                return new dvze();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvzf> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvzf.class) {
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
