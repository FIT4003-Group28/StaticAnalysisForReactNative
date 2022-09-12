package defpackage;
/* compiled from: PG */
/* renamed from: dmc  reason: default package */
/* loaded from: classes6.dex */
public final class dmc extends dsqw<dmc, dmb> implements dssk {
    public static final dmc e;
    private static volatile dssr<dmc> h;
    public dgrh a;
    public dgrn b;
    public boolean d;
    private int f;
    private byte g = 2;
    public String c = "";

    static {
        dmc dmcVar = new dmc();
        e = dmcVar;
        dsqw.cc(dmc.class, dmcVar);
    }

    private dmc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmc();
            }
            if (i2 == 4) {
                return new dmb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dmc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
