package defpackage;
/* compiled from: PG */
/* renamed from: dkgn  reason: default package */
/* loaded from: classes6.dex */
public final class dkgn extends dsqw<dkgn, dkgm> implements dssk {
    public static final dkgn h;
    private static volatile dssr<dkgn> i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;

    static {
        dkgn dkgnVar = new dkgn();
        h = dkgnVar;
        dsqw.cc(dkgn.class, dkgnVar);
    }

    private dkgn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004\u0005ဈ\u0003\u0006ဆ\u0005", new Object[]{"a", "b", "c", "d", "f", "e", "g"});
            }
            if (i3 == 3) {
                return new dkgn();
            }
            if (i3 == 4) {
                return new dkgm();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkgn> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkgn.class) {
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
