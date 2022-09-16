package defpackage;
/* compiled from: PG */
/* renamed from: dwij  reason: default package */
/* loaded from: classes6.dex */
public final class dwij extends dsqw<dwij, dwig> implements dssk {
    public static final dwij c;
    private static volatile dssr<dwij> e;
    public String a = "";
    public int b;
    private int d;

    static {
        dwij dwijVar = new dwij();
        c = dwijVar;
        dsqw.cc(dwij.class, dwijVar);
    }

    private dwij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dwii.c()});
            }
            if (i2 == 3) {
                return new dwij();
            }
            if (i2 == 4) {
                return new dwig();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwij> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwij.class) {
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
