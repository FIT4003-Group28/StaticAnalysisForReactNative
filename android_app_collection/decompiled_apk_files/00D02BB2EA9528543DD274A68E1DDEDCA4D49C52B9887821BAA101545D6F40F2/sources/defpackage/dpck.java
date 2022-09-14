package defpackage;
/* compiled from: PG */
/* renamed from: dpck  reason: default package */
/* loaded from: classes6.dex */
public final class dpck extends dsqw<dpck, dpcj> implements dssk {
    public static final dpck g;
    private static volatile dssr<dpck> i;
    public int a;
    public dgas b;
    public douj d;
    public int e;
    public int f;
    private byte h = 2;
    public String c = "";

    static {
        dpck dpckVar = new dpck();
        g = dpckVar;
        dsqw.cc(dpck.class, dpckVar);
    }

    private dpck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", dqvj.d(), "f", dpej.c()});
            }
            if (i3 == 3) {
                return new dpck();
            }
            if (i3 == 4) {
                return new dpcj();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dpck> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dpck.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
