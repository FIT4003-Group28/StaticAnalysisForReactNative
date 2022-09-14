package defpackage;
/* compiled from: PG */
/* renamed from: dkhd  reason: default package */
/* loaded from: classes.dex */
public final class dkhd extends dsqw<dkhd, dkhc> implements dssk {
    public static final dkhd h;
    private static volatile dssr<dkhd> i;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public dkpi e;
    public boolean f;
    public dkmm g;

    static {
        dkhd dkhdVar = new dkhd();
        h = dkhdVar;
        dsqw.cc(dkhd.class, dkhdVar);
    }

    private dkhd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0005င\u0004\u0006ဉ\u0005\u0007ဇ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dkhd();
            }
            if (i3 == 4) {
                return new dkhc();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkhd> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkhd.class) {
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
