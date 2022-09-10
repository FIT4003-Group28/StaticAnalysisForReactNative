package defpackage;
/* compiled from: PG */
/* renamed from: dufg  reason: default package */
/* loaded from: classes6.dex */
public final class dufg extends dsqw<dufg, duez> implements dssk {
    public static final dsrg<Integer, duey> c = new duew();
    public static final dufg g;
    private static volatile dssr<dufg> i;
    public dufm a;
    public int d;
    private int h;
    public dsrf b = dsqz.b;
    public String e = "";
    public dsrj<dufd> f = dssu.b;

    static {
        dufg dufgVar = new dufg();
        g = dufgVar;
        dsqw.cc(dufg.class, dufgVar);
    }

    private dufg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001e\u0003ဌ\u0001\u0004ဈ\u0002\u0005\u001b", new Object[]{"h", "a", "b", duey.c(), "d", dufe.a, "e", "f", dufd.class});
            }
            if (i3 == 3) {
                return new dufg();
            }
            if (i3 == 4) {
                return new duez();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dufg> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dufg.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
