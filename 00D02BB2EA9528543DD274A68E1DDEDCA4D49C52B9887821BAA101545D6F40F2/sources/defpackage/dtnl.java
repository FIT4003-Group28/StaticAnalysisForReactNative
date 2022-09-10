package defpackage;
/* compiled from: PG */
/* renamed from: dtnl  reason: default package */
/* loaded from: classes6.dex */
public final class dtnl extends dsqw<dtnl, dtnk> implements dssk {
    public static final dtnl a;
    private static volatile dssr<dtnl> b;

    static {
        dtnl dtnlVar = new dtnl();
        a = dtnlVar;
        dsqw.cc(dtnl.class, dtnlVar);
    }

    private dtnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtnl();
            }
            if (i2 == 4) {
                return new dtnk();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtnl> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtnl.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
