package defpackage;
/* compiled from: PG */
/* renamed from: dvvc  reason: default package */
/* loaded from: classes6.dex */
public final class dvvc extends dsqw<dvvc, dvvb> implements dssk {
    public static final dvvc d;
    private static volatile dssr<dvvc> e;
    public int a;
    public int b = -1;
    public long c;

    static {
        dvvc dvvcVar = new dvvc();
        d = dvvcVar;
        dsqw.cc(dvvc.class, dvvcVar);
    }

    private dvvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", dndr.c(), "c"});
            }
            if (i2 == 3) {
                return new dvvc();
            }
            if (i2 == 4) {
                return new dvvb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvvc> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvvc.class) {
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
