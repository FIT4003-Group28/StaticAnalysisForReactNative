package defpackage;
/* compiled from: PG */
/* renamed from: dwet  reason: default package */
/* loaded from: classes6.dex */
public final class dwet extends dsqw<dwet, dwes> implements dssk {
    public static final dwet e;
    private static volatile dssr<dwet> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    private int f;

    static {
        dwet dwetVar = new dwet();
        e = dwetVar;
        dsqw.cc(dwet.class, dwetVar);
    }

    private dwet() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003", new Object[]{"f", "a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dwet();
            }
            if (i2 == 4) {
                return new dwes();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwet> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwet.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
