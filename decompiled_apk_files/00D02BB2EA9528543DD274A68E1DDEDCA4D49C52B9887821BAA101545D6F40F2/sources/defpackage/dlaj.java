package defpackage;
/* compiled from: PG */
/* renamed from: dlaj  reason: default package */
/* loaded from: classes6.dex */
public final class dlaj extends dsqw<dlaj, dlai> implements dssk {
    public static final dlaj b;
    private static volatile dssr<dlaj> d;
    public String a = "";
    private int c;

    static {
        dlaj dlajVar = new dlaj();
        b = dlajVar;
        dsqw.cc(dlaj.class, dlajVar);
    }

    private dlaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dlaj();
            }
            if (i2 == 4) {
                return new dlai();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlaj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlaj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
