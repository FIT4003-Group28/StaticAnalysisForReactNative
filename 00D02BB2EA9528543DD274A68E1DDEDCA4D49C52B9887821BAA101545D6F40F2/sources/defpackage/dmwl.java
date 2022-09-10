package defpackage;
/* compiled from: PG */
/* renamed from: dmwl  reason: default package */
/* loaded from: classes.dex */
public final class dmwl extends dsqw<dmwl, dmwk> implements dssk {
    public static final dmwl c;
    private static volatile dssr<dmwl> d;
    public dsrf a = dsqz.b;
    public dsrj<dmwj> b = dssu.b;

    static {
        dmwl dmwlVar = new dmwl();
        c = dmwlVar;
        dsqw.cc(dmwl.class, dmwlVar);
    }

    private dmwl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001+\u0002\u001b", new Object[]{"a", "b", dmwj.class});
            }
            if (i2 == 3) {
                return new dmwl();
            }
            if (i2 == 4) {
                return new dmwk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dmwl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
