package defpackage;
/* compiled from: PG */
/* renamed from: dlii  reason: default package */
/* loaded from: classes6.dex */
public final class dlii extends dsqw<dlii, dlih> implements dssk {
    public static final dlii c;
    private static volatile dssr<dlii> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dlii dliiVar = new dlii();
        c = dliiVar;
        dsqw.cc(dlii.class, dliiVar);
    }

    private dlii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlii();
            }
            if (i2 == 4) {
                return new dlih();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlii> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlii.class) {
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
