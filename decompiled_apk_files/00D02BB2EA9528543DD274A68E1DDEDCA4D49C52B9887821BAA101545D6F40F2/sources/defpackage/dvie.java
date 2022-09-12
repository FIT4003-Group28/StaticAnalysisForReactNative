package defpackage;
/* compiled from: PG */
/* renamed from: dvie  reason: default package */
/* loaded from: classes.dex */
public final class dvie extends dsqw<dvie, dvid> implements dssk {
    public static final dvie d;
    private static volatile dssr<dvie> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        dvie dvieVar = new dvie();
        d = dvieVar;
        dsqw.cc(dvie.class, dvieVar);
    }

    private dvie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0002\u0002ဇ\u0003", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvie();
            }
            if (i2 == 4) {
                return new dvid();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvie> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvie.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
