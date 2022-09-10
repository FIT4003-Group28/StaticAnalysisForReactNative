package defpackage;
/* compiled from: PG */
/* renamed from: dvxz  reason: default package */
/* loaded from: classes.dex */
public final class dvxz extends dsqw<dvxz, dvxy> implements dssk {
    public static final dvxz h;
    private static volatile dssr<dvxz> i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        dvxz dvxzVar = new dvxz();
        h = dvxzVar;
        dsqw.cc(dvxz.class, dvxzVar);
    }

    private dvxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dvxz();
            }
            if (i3 == 4) {
                return new dvxy();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dvxz> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvxz.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
