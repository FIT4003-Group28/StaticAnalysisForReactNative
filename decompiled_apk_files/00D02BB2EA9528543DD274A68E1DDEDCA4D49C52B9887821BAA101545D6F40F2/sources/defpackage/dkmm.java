package defpackage;
/* compiled from: PG */
/* renamed from: dkmm  reason: default package */
/* loaded from: classes.dex */
public final class dkmm extends dsqw<dkmm, dkml> implements dssk {
    public static final dkmm h;
    private static volatile dssr<dkmm> i;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        dkmm dkmmVar = new dkmm();
        h = dkmmVar;
        dsqw.cc(dkmm.class, dkmmVar);
    }

    private dkmm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0007ဇ\u0005\tင\u0001", new Object[]{"a", "b", dpyv.c(), "d", "e", "f", "g", "c"});
            }
            if (i3 == 3) {
                return new dkmm();
            }
            if (i3 == 4) {
                return new dkml();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dkmm> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkmm.class) {
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
