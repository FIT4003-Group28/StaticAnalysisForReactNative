package defpackage;
/* compiled from: PG */
/* renamed from: dlix  reason: default package */
/* loaded from: classes6.dex */
public final class dlix extends dsqw<dlix, dliw> implements dssk {
    public static final dlix f;
    private static volatile dssr<dlix> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dlix dlixVar = new dlix();
        f = dlixVar;
        dsqw.cc(dlix.class, dlixVar);
    }

    private dlix() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dlix();
            }
            if (i2 == 4) {
                return new dliw();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlix> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlix.class) {
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
