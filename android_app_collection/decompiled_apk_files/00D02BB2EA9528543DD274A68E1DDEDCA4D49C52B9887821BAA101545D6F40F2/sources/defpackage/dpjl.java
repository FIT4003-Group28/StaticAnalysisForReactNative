package defpackage;
/* compiled from: PG */
/* renamed from: dpjl  reason: default package */
/* loaded from: classes6.dex */
public final class dpjl extends dsqw<dpjl, dpjg> implements dssk {
    public static final dpjl i;
    private static volatile dssr<dpjl> j;
    public int a;
    public int d;
    public boolean g;
    public dpji h;
    public String b = "";
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        dpjl dpjlVar = new dpjl();
        i = dpjlVar;
        dsqw.cc(dpjl.class, dpjlVar);
    }

    private dpjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0000\u0001ဌ\u0003\u0002ဈ\u0004\u0004ဇ\t\u0005ဉ\n\u0007ဈ\u0001\bဈ\u0002\tဈ\u0005", new Object[]{"a", "d", dpjj.a, "e", "g", "h", "b", "c", "f"});
            }
            if (i3 == 3) {
                return new dpjl();
            }
            if (i3 == 4) {
                return new dpjg();
            }
            if (i3 == 5) {
                return i;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dpjl> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dpjl.class) {
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
