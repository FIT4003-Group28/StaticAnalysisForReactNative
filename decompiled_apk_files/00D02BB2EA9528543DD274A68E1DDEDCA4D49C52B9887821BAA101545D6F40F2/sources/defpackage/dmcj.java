package defpackage;
/* compiled from: PG */
/* renamed from: dmcj  reason: default package */
/* loaded from: classes6.dex */
public final class dmcj extends dsqs<dmcj, dmci> implements dsqt {
    public static final dmcj d;
    private static volatile dssr<dmcj> g;
    public int b;
    public dqjt c;
    private int e;
    private byte f = 2;
    public String a = "";

    static {
        dmcj dmcjVar = new dmcj();
        d = dmcjVar;
        dsqw.cc(dmcj.class, dmcjVar);
    }

    private dmcj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmcj();
            }
            if (i2 == 4) {
                return new dmci();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dmcj> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmcj.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
