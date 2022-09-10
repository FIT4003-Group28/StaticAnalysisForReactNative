package defpackage;
/* compiled from: PG */
/* renamed from: dlgi  reason: default package */
/* loaded from: classes6.dex */
public final class dlgi extends dsqw<dlgi, dlgh> implements dssk {
    public static final dlgi c;
    private static volatile dssr<dlgi> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dlgi dlgiVar = new dlgi();
        c = dlgiVar;
        dsqw.cc(dlgi.class, dlgiVar);
    }

    private dlgi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dlgj.a});
            }
            if (i2 == 3) {
                return new dlgi();
            }
            if (i2 == 4) {
                return new dlgh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgi> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlgi.class) {
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
