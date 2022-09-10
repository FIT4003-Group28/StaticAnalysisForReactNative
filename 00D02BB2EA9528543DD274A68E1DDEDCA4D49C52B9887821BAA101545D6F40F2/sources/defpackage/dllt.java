package defpackage;
/* compiled from: PG */
/* renamed from: dllt  reason: default package */
/* loaded from: classes6.dex */
public final class dllt extends dsqw<dllt, dlls> implements dssk {
    public static final dllt d;
    private static volatile dssr<dllt> e;
    public int a;
    public dllj b;
    public dllh c;

    static {
        dllt dlltVar = new dllt();
        d = dlltVar;
        dsqw.cc(dllt.class, dlltVar);
    }

    private dllt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dllt();
            }
            if (i2 == 4) {
                return new dlls();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dllt.class) {
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
