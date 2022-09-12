package defpackage;
/* compiled from: PG */
/* renamed from: dsw  reason: default package */
/* loaded from: classes6.dex */
public final class dsw extends dsqw<dsw, dsv> implements dssk {
    public static final dsw d;
    private static volatile dssr<dsw> e;
    public int a;
    public boolean b;
    public dstv c;

    static {
        dsw dswVar = new dsw();
        d = dswVar;
        dsqw.cc(dsw.class, dswVar);
    }

    private dsw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dsw();
            }
            if (i2 == 4) {
                return new dsv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsw.class) {
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
