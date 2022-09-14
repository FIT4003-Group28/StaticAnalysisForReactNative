package defpackage;
/* compiled from: PG */
/* renamed from: doxr  reason: default package */
/* loaded from: classes6.dex */
public final class doxr extends dsqw<doxr, doxq> implements dssk {
    public static final doxr k;
    private static volatile dssr<doxr> l;
    public int a;
    public String b = "";
    public String c = "";
    public doun d;
    public dnpq e;
    public dgas f;
    public dgas g;
    public dgas h;
    public dquh i;
    public dnpq j;

    static {
        doxr doxrVar = new doxr();
        k = doxrVar;
        dsqw.cc(doxr.class, doxrVar);
    }

    private doxr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0007ဉ\u0005\tဉ\u0006\nဉ\u0007\u0010ဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new doxr();
            }
            if (i2 == 4) {
                return new doxq();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doxr> dssrVar = l;
            if (dssrVar == null) {
                synchronized (doxr.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
