package defpackage;
/* compiled from: PG */
/* renamed from: diut  reason: default package */
/* loaded from: classes6.dex */
public final class diut extends dsqw<diut, dius> implements dssk {
    public static final diut f;
    private static volatile dssr<diut> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;

    static {
        diut diutVar = new diut();
        f = diutVar;
        dsqw.cc(diut.class, diutVar);
    }

    private diut() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", dpob.a});
            }
            if (i2 == 3) {
                return new diut();
            }
            if (i2 == 4) {
                return new dius();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diut> dssrVar = g;
            if (dssrVar == null) {
                synchronized (diut.class) {
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
