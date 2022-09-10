package defpackage;
/* compiled from: PG */
/* renamed from: dscu  reason: default package */
/* loaded from: classes6.dex */
public final class dscu extends dsqw<dscu, dsct> implements dssk {
    public static final dscu c;
    private static volatile dssr<dscu> e;
    public dsbk a;
    public String b = "";
    private int d;

    static {
        dscu dscuVar = new dscu();
        c = dscuVar;
        dsqw.cc(dscu.class, dscuVar);
    }

    private dscu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dscu();
            }
            if (i2 == 4) {
                return new dsct();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dscu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dscu.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
