package defpackage;
/* compiled from: PG */
/* renamed from: dvjl  reason: default package */
/* loaded from: classes6.dex */
public final class dvjl extends dsqw<dvjl, dvjk> implements dssk {
    public static final dvjl d;
    private static volatile dssr<dvjl> g;
    public int a;
    private dnqh e;
    private byte f = 2;
    public String b = "";
    public int c = 10;

    static {
        dvjl dvjlVar = new dvjl();
        d = dvjlVar;
        dsqw.cc(dvjl.class, dvjlVar);
    }

    private dvjl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "e"});
            }
            if (i2 == 3) {
                return new dvjl();
            }
            if (i2 == 4) {
                return new dvjk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dvjl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dvjl.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
