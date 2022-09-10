package defpackage;
/* compiled from: PG */
/* renamed from: dsew  reason: default package */
/* loaded from: classes6.dex */
public final class dsew extends dsqw<dsew, dsev> implements dssk {
    public static final dsew d;
    private static volatile dssr<dsew> e;
    public int a;
    public int b;
    public dseu c;

    static {
        dsew dsewVar = new dsew();
        d = dsewVar;
        dsqw.cc(dsew.class, dsewVar);
    }

    private dsew() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", duhc.c(), "c"});
            }
            if (i2 == 3) {
                return new dsew();
            }
            if (i2 == 4) {
                return new dsev();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsew> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dsew.class) {
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
