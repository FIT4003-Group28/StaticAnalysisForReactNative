package defpackage;
/* compiled from: PG */
/* renamed from: dlke  reason: default package */
/* loaded from: classes6.dex */
public final class dlke extends dsqw<dlke, dlkd> implements dssk {
    public static final dlke c;
    private static volatile dssr<dlke> d;
    public int a;
    public String b = "";

    static {
        dlke dlkeVar = new dlke();
        c = dlkeVar;
        dsqw.cc(dlke.class, dlkeVar);
    }

    private dlke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlke();
            }
            if (i2 == 4) {
                return new dlkd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlke> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlke.class) {
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
