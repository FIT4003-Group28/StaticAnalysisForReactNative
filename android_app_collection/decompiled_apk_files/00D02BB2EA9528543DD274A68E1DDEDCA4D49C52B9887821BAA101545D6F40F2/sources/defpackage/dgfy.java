package defpackage;
/* compiled from: PG */
/* renamed from: dgfy  reason: default package */
/* loaded from: classes6.dex */
public final class dgfy extends dsqw<dgfy, dgfx> implements dssk {
    public static final dgfy f;
    private static volatile dssr<dgfy> g;
    public int a;
    public String b = "";
    public String c;
    public String d;
    public dgbo e;

    static {
        dgfy dgfyVar = new dgfy();
        f = dgfyVar;
        dsqw.cc(dgfy.class, dgfyVar);
    }

    private dgfy() {
        dssu<Object> dssuVar = dssu.b;
        this.c = "";
        this.d = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgfy();
            }
            if (i2 == 4) {
                return new dgfx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgfy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgfy.class) {
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
