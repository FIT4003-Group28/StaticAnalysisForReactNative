package defpackage;
/* compiled from: PG */
/* renamed from: dmzv  reason: default package */
/* loaded from: classes6.dex */
public final class dmzv extends dsqw<dmzv, dmzu> implements dssk {
    public static final dmzv c;
    private static volatile dssr<dmzv> e;
    public int a;
    public int b;
    private int d;

    static {
        dmzv dmzvVar = new dmzv();
        c = dmzvVar;
        dsqw.cc(dmzv.class, dmzvVar);
    }

    private dmzv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmzv();
            }
            if (i2 == 4) {
                return new dmzu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmzv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
