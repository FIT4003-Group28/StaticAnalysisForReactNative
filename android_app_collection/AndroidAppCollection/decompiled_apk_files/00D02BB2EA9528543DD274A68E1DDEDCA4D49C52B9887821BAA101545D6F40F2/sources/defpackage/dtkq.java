package defpackage;
/* compiled from: PG */
/* renamed from: dtkq  reason: default package */
/* loaded from: classes6.dex */
public final class dtkq extends dsqw<dtkq, dtkm> implements dssk {
    public static final dtkq f;
    private static volatile dssr<dtkq> g;
    public int a;
    public int b;
    public String c = "";
    public int d = 1;
    public String e = "";

    static {
        dtkq dtkqVar = new dtkq();
        f = dtkqVar;
        dsqw.cc(dtkq.class, dtkqVar);
    }

    private dtkq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\bဌ\u0002\nဈ\b", new Object[]{"a", "b", "c", "d", dtko.a, "e"});
            }
            if (i2 == 3) {
                return new dtkq();
            }
            if (i2 == 4) {
                return new dtkm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtkq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dtkq.class) {
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
