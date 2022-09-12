package defpackage;
/* compiled from: PG */
/* renamed from: dvxb  reason: default package */
/* loaded from: classes.dex */
public final class dvxb extends dsqw<dvxb, dvxa> implements dssk {
    public static final dvxb d;
    private static volatile dssr<dvxb> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dvxb dvxbVar = new dvxb();
        d = dvxbVar;
        dsqw.cc(dvxb.class, dvxbVar);
    }

    private dvxb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvxb();
            }
            if (i2 == 4) {
                return new dvxa();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvxb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
