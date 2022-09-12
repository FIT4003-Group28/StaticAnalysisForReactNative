package defpackage;
/* compiled from: PG */
/* renamed from: dtjb  reason: default package */
/* loaded from: classes6.dex */
public final class dtjb extends dsqw<dtjb, dtiu> implements dssk {
    public static final dsrg<Integer, dtja> c = new dtit();
    public static final dtjb h;
    private static volatile dssr<dtjb> i;
    public int a;
    public int d;
    public boolean f;
    public dtiw g;
    public dsrf b = dsqz.b;
    public String e = "";

    static {
        dtjb dtjbVar = new dtjb();
        h = dtjbVar;
        dsqw.cc(dtjb.class, dtjbVar);
    }

    private dtjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0005\u0000\u0001\u0002Ϫ\u0005\u0000\u0001\u0000\u0002ဌ\u0000\u0003\u001e\u0005ဈ\u0002\tဇ\u0005Ϫဉ\u0007", new Object[]{"a", "d", dtiy.c(), "b", dtja.c(), "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dtjb();
            }
            if (i3 == 4) {
                return new dtiu();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dtjb> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dtjb.class) {
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
