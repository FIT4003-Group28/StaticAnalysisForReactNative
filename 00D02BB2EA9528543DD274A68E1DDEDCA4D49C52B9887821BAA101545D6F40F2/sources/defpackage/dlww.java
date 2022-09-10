package defpackage;
/* compiled from: PG */
/* renamed from: dlww  reason: default package */
/* loaded from: classes.dex */
public final class dlww extends dsqw<dlww, dlwt> implements dssk {
    public static final dlww c;
    private static volatile dssr<dlww> e;
    public int a;
    public dlwv b;
    private int d;

    static {
        dlww dlwwVar = new dlww();
        c = dlwwVar;
        dsqw.cc(dlww.class, dlwwVar);
    }

    private dlww() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dlww();
            }
            if (i2 == 4) {
                return new dlwt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlww> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlww.class) {
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
