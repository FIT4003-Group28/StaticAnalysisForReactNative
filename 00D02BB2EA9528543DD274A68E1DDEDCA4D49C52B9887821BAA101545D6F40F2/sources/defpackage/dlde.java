package defpackage;
/* compiled from: PG */
/* renamed from: dlde  reason: default package */
/* loaded from: classes6.dex */
public final class dlde extends dsqw<dlde, dldd> implements dssk {
    public static final dlde c;
    private static volatile dssr<dlde> f;
    public dkzz a;
    private int d;
    private byte e = 2;
    public dsrj<dldg> b = dssu.b;

    static {
        dlde dldeVar = new dlde();
        c = dldeVar;
        dsqw.cc(dlde.class, dldeVar);
    }

    private dlde() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"d", "a", "b", dldg.class});
            }
            if (i2 == 3) {
                return new dlde();
            }
            if (i2 == 4) {
                return new dldd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dlde> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlde.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
