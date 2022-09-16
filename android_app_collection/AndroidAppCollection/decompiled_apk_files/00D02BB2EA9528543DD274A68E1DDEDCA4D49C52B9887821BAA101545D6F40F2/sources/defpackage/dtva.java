package defpackage;
/* compiled from: PG */
/* renamed from: dtva  reason: default package */
/* loaded from: classes6.dex */
public final class dtva extends dsqw<dtva, dtuz> implements dssk {
    public static final dtva g;
    private static volatile dssr<dtva> h;
    public dtud a;
    public dtsz b;
    public dttd c;
    public dtvc d;
    public dsrj<dtvi> e = dssu.b;
    public dsrf f = dsqz.b;

    static {
        dtva dtvaVar = new dtva();
        g = dtvaVar;
        dsqw.cc(dtva.class, dtvaVar);
    }

    private dtva() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\u001b\u0007,", new Object[]{"a", "b", "c", "d", "e", dtvi.class, "f"});
            }
            if (i2 == 3) {
                return new dtva();
            }
            if (i2 == 4) {
                return new dtuz();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtva> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtva.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
