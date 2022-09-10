package defpackage;
/* compiled from: PG */
/* renamed from: dmbc  reason: default package */
/* loaded from: classes6.dex */
public final class dmbc extends dsqw<dmbc, dmbb> implements dssk {
    public static final dmbc h;
    private static volatile dssr<dmbc> i;
    public int a;
    public dmbu c;
    public dmbg d;
    public dmaw e;
    public dmby f;
    public String b = "";
    public String g = "";

    static {
        dmbc dmbcVar = new dmbc();
        h = dmbcVar;
        dsqw.cc(dmbc.class, dmbcVar);
    }

    private dmbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dmbc();
            }
            if (i3 == 4) {
                return new dmbb();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmbc> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dmbc.class) {
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
