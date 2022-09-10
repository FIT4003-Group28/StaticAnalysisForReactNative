package defpackage;
/* compiled from: PG */
/* renamed from: dvct  reason: default package */
/* loaded from: classes6.dex */
public final class dvct extends dsqw<dvct, dvcs> implements dssk {
    public static final dvct f;
    private static volatile dssr<dvct> i;
    public int a;
    public dfqs b;
    public dvcp c;
    public dhjx d;
    private dnqh g;
    private byte h = 2;
    public boolean e = true;

    static {
        dvct dvctVar = new dvct();
        f = dvctVar;
        dsqw.cc(dvct.class, dvctVar);
    }

    private dvct() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ᐉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g"});
            }
            if (i3 == 3) {
                return new dvct();
            }
            if (i3 == 4) {
                return new dvcs();
            }
            if (i3 == 5) {
                return f;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dvct> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dvct.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
