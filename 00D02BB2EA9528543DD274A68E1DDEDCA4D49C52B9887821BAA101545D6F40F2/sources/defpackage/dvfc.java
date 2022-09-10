package defpackage;
/* compiled from: PG */
/* renamed from: dvfc  reason: default package */
/* loaded from: classes6.dex */
public final class dvfc extends dsqw<dvfc, dvfb> implements dssk {
    public static final dvfc e;
    private static volatile dssr<dvfc> g;
    public int a;
    public dvfq b;
    public dvfs c;
    public dvfu d;
    private byte f = 2;

    static {
        dvfc dvfcVar = new dvfc();
        e = dvfcVar;
        dsqw.cc(dvfc.class, dvfcVar);
    }

    private dvfc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvfc();
            }
            if (i2 == 4) {
                return new dvfb();
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
            dssr<dvfc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvfc.class) {
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
