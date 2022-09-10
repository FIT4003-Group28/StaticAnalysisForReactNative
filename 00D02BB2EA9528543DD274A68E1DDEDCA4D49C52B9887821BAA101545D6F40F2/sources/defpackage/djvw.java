package defpackage;
/* compiled from: PG */
/* renamed from: djvw  reason: default package */
/* loaded from: classes6.dex */
public final class djvw extends dsqw<djvw, djvu> implements dssk {
    public static final djvw h;
    private static volatile dssr<djvw> i;
    public int a;
    public dutq b;
    public int d;
    public boolean g;
    public String c = "";
    public String e = "";
    public dspd f = dspd.b;

    static {
        djvw djvwVar = new djvw();
        h = djvwVar;
        dsqw.cc(djvw.class, djvwVar);
    }

    private djvw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဇ\u0007\u0005ည\u0005\u0006ဌ\u0002\u0007ဈ\u0003", new Object[]{"a", "b", "c", "g", "f", "d", djvv.a, "e"});
            }
            if (i3 == 3) {
                return new djvw();
            }
            if (i3 == 4) {
                return new djvu();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<djvw> dssrVar = i;
            if (dssrVar == null) {
                synchronized (djvw.class) {
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
