package defpackage;
/* compiled from: PG */
/* renamed from: dlnu  reason: default package */
/* loaded from: classes6.dex */
public final class dlnu extends dsqw<dlnu, dlnt> implements dssk {
    public static final dlnu c;
    private static volatile dssr<dlnu> d;
    public int a;
    public String b = "";

    static {
        dlnu dlnuVar = new dlnu();
        c = dlnuVar;
        dsqw.cc(dlnu.class, dlnuVar);
    }

    private dlnu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlnu();
            }
            if (i2 == 4) {
                return new dlnt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlnu.class) {
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
