package defpackage;
/* compiled from: PG */
/* renamed from: dwef  reason: default package */
/* loaded from: classes.dex */
public final class dwef extends dsqw<dwef, dwee> implements dssk {
    public static final dwef c;
    private static volatile dssr<dwef> d;
    public int a;
    public int b;

    static {
        dwef dwefVar = new dwef();
        c = dwefVar;
        dsqw.cc(dwef.class, dwefVar);
    }

    private dwef() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dweb.c()});
            }
            if (i2 == 3) {
                return new dwef();
            }
            if (i2 == 4) {
                return new dwee();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwef> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwef.class) {
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
