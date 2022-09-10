package defpackage;
/* compiled from: PG */
/* renamed from: diwl  reason: default package */
/* loaded from: classes6.dex */
public final class diwl extends dsqw<diwl, diwe> implements dssk {
    public static final diwl f;
    private static volatile dssr<diwl> g;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<diwg> d = dssu.b;
    public dgfs e;

    static {
        diwl diwlVar = new diwl();
        f = diwlVar;
        dsqw.cc(diwl.class, diwlVar);
    }

    private diwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004\u001b\u0006ဉ\u0003", new Object[]{"a", "b", "c", "d", diwg.class, "e"});
            }
            if (i2 == 3) {
                return new diwl();
            }
            if (i2 == 4) {
                return new diwe();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diwl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (diwl.class) {
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
