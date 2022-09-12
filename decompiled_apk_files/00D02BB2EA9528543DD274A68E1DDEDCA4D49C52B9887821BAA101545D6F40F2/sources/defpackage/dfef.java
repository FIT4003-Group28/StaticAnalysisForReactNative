package defpackage;
/* compiled from: PG */
/* renamed from: dfef  reason: default package */
/* loaded from: classes6.dex */
public final class dfef extends dsqw<dfef, dfdy> implements dssk {
    public static final dfef e;
    private static volatile dssr<dfef> f;
    public int a;
    public long b;
    public dsri c;
    public dsrj<dfee> d;

    static {
        dfef dfefVar = new dfef();
        e = dfefVar;
        dsqw.cc(dfef.class, dfefVar);
    }

    private dfef() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dsrx.b;
        this.d = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005စ\u0001\u0006\u0017", new Object[]{"a", "d", dfee.class, "b", "c"});
            }
            if (i2 == 3) {
                return new dfef();
            }
            if (i2 == 4) {
                return new dfdy();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfef> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfef.class) {
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
