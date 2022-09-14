package defpackage;
/* compiled from: PG */
/* renamed from: dipe  reason: default package */
/* loaded from: classes6.dex */
public final class dipe extends dsqw<dipe, dipb> implements dssk {
    public static final dipe f;
    private static volatile dssr<dipe> g;
    public int a;
    public int c;
    public String b = "";
    public String d = "";
    public String e = "";

    static {
        dipe dipeVar = new dipe();
        f = dipeVar;
        dsqw.cc(dipe.class, dipeVar);
    }

    private dipe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", dipc.a, "d", "e"});
            }
            if (i2 == 3) {
                return new dipe();
            }
            if (i2 == 4) {
                return new dipb();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dipe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dipe.class) {
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
