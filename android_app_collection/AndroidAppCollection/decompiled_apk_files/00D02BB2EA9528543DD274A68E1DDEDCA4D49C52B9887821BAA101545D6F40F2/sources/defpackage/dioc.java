package defpackage;
/* compiled from: PG */
/* renamed from: dioc  reason: default package */
/* loaded from: classes6.dex */
public final class dioc extends dsqw<dioc, dinx> implements dssk {
    public static final dioc f;
    private static volatile dssr<dioc> g;
    public int a;
    public int b;
    public String c = "";
    public dsrj<diob> d = dssu.b;
    public int e;

    static {
        dioc diocVar = new dioc();
        f = diocVar;
        dsqw.cc(dioc.class, diocVar);
    }

    private dioc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004င\u0002", new Object[]{"a", "b", diny.a, "c", "d", diob.class, "e"});
            }
            if (i2 == 3) {
                return new dioc();
            }
            if (i2 == 4) {
                return new dinx();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dioc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dioc.class) {
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
