package defpackage;
/* compiled from: PG */
/* renamed from: dtis  reason: default package */
/* loaded from: classes6.dex */
public final class dtis extends dsqw<dtis, dtir> implements dssk {
    public static final dtis d;
    private static volatile dssr<dtis> e;
    public int a;
    public String b = "";
    public dtkh c;

    static {
        dtis dtisVar = new dtis();
        d = dtisVar;
        dsqw.cc(dtis.class, dtisVar);
    }

    private dtis() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dtis();
            }
            if (i2 == 4) {
                return new dtir();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtis> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtis.class) {
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
