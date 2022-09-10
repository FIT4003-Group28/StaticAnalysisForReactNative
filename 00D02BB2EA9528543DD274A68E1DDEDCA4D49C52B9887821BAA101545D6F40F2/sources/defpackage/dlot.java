package defpackage;
/* compiled from: PG */
/* renamed from: dlot  reason: default package */
/* loaded from: classes6.dex */
public final class dlot extends dsqw<dlot, dlos> implements dssk {
    public static final dlot e;
    private static volatile dssr<dlot> g;
    public int a;
    public Object c;
    public dltc d;
    public int b = 0;
    private byte f = 2;

    static {
        dlot dlotVar = new dlot();
        e = dlotVar;
        dsqw.cc(dlot.class, dlotVar);
    }

    private dlot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ြ\u0000", new Object[]{"c", "b", "a", dvfo.class, "d", dtyp.class});
            }
            if (i2 == 3) {
                return new dlot();
            }
            if (i2 == 4) {
                return new dlos();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlot> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlot.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
