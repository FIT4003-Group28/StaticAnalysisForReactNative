package defpackage;
/* compiled from: PG */
/* renamed from: dinh  reason: default package */
/* loaded from: classes6.dex */
public final class dinh extends dsqw<dinh, ding> implements dssk {
    public static final dinh e;
    private static volatile dssr<dinh> f;
    public int a;
    public dsrj<droa> b = dssu.b;
    public dsrj<dinf> c = dssu.b;
    public int d = 1;

    static {
        dinh dinhVar = new dinh();
        e = dinhVar;
        dsqw.cc(dinh.class, dinhVar);
    }

    private dinh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\u001b\u0003ဌ\u0000\u0004\u001b", new Object[]{"a", "c", dinf.class, "d", dini.a, "b", droa.class});
            }
            if (i2 == 3) {
                return new dinh();
            }
            if (i2 == 4) {
                return new ding();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dinh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
