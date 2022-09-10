package defpackage;
/* compiled from: PG */
/* renamed from: dmyu  reason: default package */
/* loaded from: classes.dex */
public final class dmyu extends dsqs<dmyu, dmyq> implements dsqt {
    public static final dmyu d;
    private static volatile dssr<dmyu> f;
    public int a;
    private byte e = 2;
    public int b = 37;
    public dsrj<dmys> c = dssu.b;

    static {
        dmyu dmyuVar = new dmyu();
        d = dmyuVar;
        dsqw.cc(dmyu.class, dmyuVar);
    }

    private dmyu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᔌ\u0000\u0002Л", new Object[]{"a", "b", dmyt.a, "c", dmys.class});
            }
            if (i2 == 3) {
                return new dmyu();
            }
            if (i2 == 4) {
                return new dmyq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dmyu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmyu.class) {
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
