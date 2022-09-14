package defpackage;
/* compiled from: PG */
/* renamed from: dmzl  reason: default package */
/* loaded from: classes6.dex */
public final class dmzl extends dsqw<dmzl, dmzk> implements dssk {
    public static final dmzl f;
    private static volatile dssr<dmzl> h;
    public dmzt a;
    public dsrj<dmzz> b;
    public dsrj<dnab> c;
    public dsrj<dmzp> d;
    public dsrj<dmzx> e;
    private int g;

    static {
        dmzl dmzlVar = new dmzl();
        f = dmzlVar;
        dsqw.cc(dmzl.class, dmzlVar);
    }

    private dmzl() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dssu.b;
        this.c = dssu.b;
        this.d = dssu.b;
        this.e = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0002\u0011\u0005\u0000\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u001b\t\u001b\u0011ဉ\u0000", new Object[]{"g", "b", dmzz.class, "c", dnab.class, "d", dmzp.class, "e", dmzx.class, "a"});
            }
            if (i2 == 3) {
                return new dmzl();
            }
            if (i2 == 4) {
                return new dmzk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmzl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
