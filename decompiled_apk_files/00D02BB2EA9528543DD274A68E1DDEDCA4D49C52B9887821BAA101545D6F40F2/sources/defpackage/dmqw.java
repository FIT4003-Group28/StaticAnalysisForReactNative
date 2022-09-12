package defpackage;
/* compiled from: PG */
/* renamed from: dmqw  reason: default package */
/* loaded from: classes.dex */
public final class dmqw extends dsqw<dmqw, dmqv> implements dssk {
    public static final dsrg<Integer, dmyo> b = new dmqu();
    public static final dmqw d;
    private static volatile dssr<dmqw> f;
    private byte e = 2;
    public dsrf a = dsqz.b;
    public dsrj<dmop> c = dssu.b;

    static {
        dmqw dmqwVar = new dmqw();
        d = dmqwVar;
        dsqw.cc(dmqw.class, dmqwVar);
    }

    private dmqw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001e\u0002Л", new Object[]{"a", dmyo.c(), "c", dmop.class});
            }
            if (i2 == 3) {
                return new dmqw();
            }
            if (i2 == 4) {
                return new dmqv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<dmqw> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmqw.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
