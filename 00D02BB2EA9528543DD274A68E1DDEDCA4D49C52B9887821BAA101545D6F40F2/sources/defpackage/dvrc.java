package defpackage;
/* compiled from: PG */
/* renamed from: dvrc  reason: default package */
/* loaded from: classes6.dex */
public final class dvrc extends dsqw<dvrc, dvrb> implements dssk {
    public static final dvrc d;
    private static volatile dssr<dvrc> e;
    public int a;
    public String b = "";
    public dvrs c;

    static {
        dvrc dvrcVar = new dvrc();
        d = dvrcVar;
        dsqw.cc(dvrc.class, dvrcVar);
    }

    private dvrc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dvrc();
            }
            if (i2 == 4) {
                return new dvrb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvrc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvrc.class) {
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
