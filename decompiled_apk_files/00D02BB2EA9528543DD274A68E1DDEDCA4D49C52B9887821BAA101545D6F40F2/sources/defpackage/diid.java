package defpackage;
/* compiled from: PG */
/* renamed from: diid  reason: default package */
/* loaded from: classes6.dex */
public final class diid extends dsqw<diid, diic> implements dssk {
    public static final diid e;
    private static volatile dssr<diid> g;
    public String a = "";
    public String b = "";
    public String c = "";
    public dihv d;
    private int f;

    static {
        diid diidVar = new diid();
        e = diidVar;
        dsqw.cc(diid.class, diidVar);
    }

    private diid() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0004\u0005ဈ\u0003", new Object[]{"f", "a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new diid();
            }
            if (i2 == 4) {
                return new diic();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diid> dssrVar = g;
            if (dssrVar == null) {
                synchronized (diid.class) {
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
