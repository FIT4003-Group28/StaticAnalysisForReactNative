package defpackage;
/* compiled from: PG */
/* renamed from: dwpt  reason: default package */
/* loaded from: classes6.dex */
public final class dwpt extends dsqw<dwpt, dwps> implements dssk {
    public static final dwpt c;
    private static volatile dssr<dwpt> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        dwpt dwptVar = new dwpt();
        c = dwptVar;
        dsqw.cc(dwpt.class, dwptVar);
    }

    private dwpt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dwpt();
            }
            if (i2 == 4) {
                return new dwps();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwpt.class) {
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
