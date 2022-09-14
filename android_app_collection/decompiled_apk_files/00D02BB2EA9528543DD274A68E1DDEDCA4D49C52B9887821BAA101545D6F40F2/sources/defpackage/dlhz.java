package defpackage;
/* compiled from: PG */
/* renamed from: dlhz  reason: default package */
/* loaded from: classes6.dex */
public final class dlhz extends dsqw<dlhz, dlhq> implements dssk {
    public static final dlhz d;
    private static volatile dssr<dlhz> e;
    public int a;
    public dlhu b;
    public dlhy c;

    static {
        dlhz dlhzVar = new dlhz();
        d = dlhzVar;
        dsqw.cc(dlhz.class, dlhzVar);
    }

    private dlhz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlhz();
            }
            if (i2 == 4) {
                return new dlhq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlhz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlhz.class) {
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
