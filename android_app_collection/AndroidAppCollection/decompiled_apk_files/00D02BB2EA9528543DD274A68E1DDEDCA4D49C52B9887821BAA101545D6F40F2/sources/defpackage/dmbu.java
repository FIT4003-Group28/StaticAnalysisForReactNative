package defpackage;
/* compiled from: PG */
/* renamed from: dmbu  reason: default package */
/* loaded from: classes6.dex */
public final class dmbu extends dsqw<dmbu, dmbr> implements dssk {
    public static final dmbu i;
    private static volatile dssr<dmbu> j;
    public int a;
    public int d;
    public dmbe e;
    public long f;
    public long g;
    public String b = "";
    public String c = "";
    public String h = "";

    static {
        dmbu dmbuVar = new dmbu();
        i = dmbuVar;
        dsqw.cc(dmbu.class, dmbuVar);
    }

    private dmbu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0005\u0004ဂ\u0006\u0005ဉ\u0004\u0006ဌ\u0003\u0007ဈ\u0007\u000bဈ\u0002", new Object[]{"a", "b", "f", "g", "e", "d", dmbs.a, "h", "c"});
            }
            if (i3 == 3) {
                return new dmbu();
            }
            if (i3 == 4) {
                return new dmbr();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dmbu> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmbu.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(i);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
