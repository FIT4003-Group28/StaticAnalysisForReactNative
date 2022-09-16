package defpackage;
/* compiled from: PG */
/* renamed from: dhvm  reason: default package */
/* loaded from: classes6.dex */
public final class dhvm extends dsqw<dhvm, dhvl> implements dssk {
    public static final dhvm c;
    private static volatile dssr<dhvm> d;
    public int a;
    public dwpe b;

    static {
        dhvm dhvmVar = new dhvm();
        c = dhvmVar;
        dsqw.cc(dhvm.class, dhvmVar);
    }

    private dhvm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhvm();
            }
            if (i2 == 4) {
                return new dhvl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhvm.class) {
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
