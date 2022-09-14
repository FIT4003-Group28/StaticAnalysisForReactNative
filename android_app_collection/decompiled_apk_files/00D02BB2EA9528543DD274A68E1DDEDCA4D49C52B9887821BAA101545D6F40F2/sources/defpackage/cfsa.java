package defpackage;
/* compiled from: PG */
/* renamed from: cfsa  reason: default package */
/* loaded from: classes4.dex */
public final class cfsa extends dsqw<cfsa, cfrz> implements dssk {
    public static final cfsa f;
    private static volatile dssr<cfsa> g;
    public int a;
    public String b = "";
    public dsrj<dwue> c = dssu.b;
    public dqam d;
    public long e;

    static {
        cfsa cfsaVar = new cfsa();
        f = cfsaVar;
        dsqw.cc(cfsa.class, cfsaVar);
    }

    private cfsa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", "c", dwue.class, "d", "e"});
            }
            if (i2 == 3) {
                return new cfsa();
            }
            if (i2 == 4) {
                return new cfrz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cfsa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cfsa.class) {
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
