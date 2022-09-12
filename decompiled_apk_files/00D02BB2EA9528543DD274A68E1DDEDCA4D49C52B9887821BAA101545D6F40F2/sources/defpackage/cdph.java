package defpackage;
/* compiled from: PG */
/* renamed from: cdph  reason: default package */
/* loaded from: classes4.dex */
public final class cdph extends dsqw<cdph, cdpe> implements dssk {
    public static final cdph c;
    private static volatile dssr<cdph> d;
    public int a;
    public int b;

    static {
        cdph cdphVar = new cdph();
        c = cdphVar;
        dsqw.cc(cdph.class, cdphVar);
    }

    private cdph() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", cdpg.c()});
            }
            if (i2 == 3) {
                return new cdph();
            }
            if (i2 == 4) {
                return new cdpe();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cdph> dssrVar = d;
            if (dssrVar == null) {
                synchronized (cdph.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
