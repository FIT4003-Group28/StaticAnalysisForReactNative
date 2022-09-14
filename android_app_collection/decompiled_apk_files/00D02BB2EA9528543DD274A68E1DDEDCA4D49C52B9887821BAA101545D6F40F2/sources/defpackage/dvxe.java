package defpackage;
/* compiled from: PG */
/* renamed from: dvxe  reason: default package */
/* loaded from: classes6.dex */
public final class dvxe extends dsqw<dvxe, dvxd> implements dssk {
    public static final dvxe d;
    private static volatile dssr<dvxe> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        dvxe dvxeVar = new dvxe();
        d = dvxeVar;
        dsqw.cc(dvxe.class, dvxeVar);
    }

    private dvxe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvxe();
            }
            if (i2 == 4) {
                return new dvxd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxe> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvxe.class) {
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
