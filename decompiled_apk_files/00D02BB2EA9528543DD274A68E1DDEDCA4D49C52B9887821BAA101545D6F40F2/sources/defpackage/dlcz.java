package defpackage;
/* compiled from: PG */
/* renamed from: dlcz  reason: default package */
/* loaded from: classes6.dex */
public final class dlcz extends dsqw<dlcz, dlcy> implements dssk {
    public static final dlcz d;
    private static volatile dssr<dlcz> f;
    public String a = "";
    public boolean b;
    public drei c;
    private int e;

    static {
        dlcz dlczVar = new dlcz();
        d = dlczVar;
        dsqw.cc(dlcz.class, dlczVar);
    }

    private dlcz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlcz();
            }
            if (i2 == 4) {
                return new dlcy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlcz> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlcz.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
