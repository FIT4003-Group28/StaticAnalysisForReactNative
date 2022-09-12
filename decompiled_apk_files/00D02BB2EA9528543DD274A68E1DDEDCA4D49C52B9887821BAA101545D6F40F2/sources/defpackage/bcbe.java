package defpackage;
/* compiled from: PG */
/* renamed from: bcbe  reason: default package */
/* loaded from: classes3.dex */
public final class bcbe extends dsqw<bcbe, bcbd> implements dssk {
    public static final bcbe f;
    private static volatile dssr<bcbe> g;
    public int a;
    public boolean c;
    public dwfl d;
    public String b = "";
    public String e = "";

    static {
        bcbe bcbeVar = new bcbe();
        f = bcbeVar;
        dsqw.cc(bcbe.class, bcbeVar);
    }

    private bcbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new bcbe();
            }
            if (i2 == 4) {
                return new bcbd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bcbe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bcbe.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
