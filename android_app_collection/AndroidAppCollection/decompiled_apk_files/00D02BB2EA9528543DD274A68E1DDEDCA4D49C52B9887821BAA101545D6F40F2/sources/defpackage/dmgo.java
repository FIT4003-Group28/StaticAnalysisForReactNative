package defpackage;
/* compiled from: PG */
/* renamed from: dmgo  reason: default package */
/* loaded from: classes6.dex */
public final class dmgo extends dsqw<dmgo, dmgn> implements dssk {
    public static final dmgo c;
    private static volatile dssr<dmgo> e;
    public int a;
    public int b;
    private int d;

    static {
        dmgo dmgoVar = new dmgo();
        c = dmgoVar;
        dsqw.cc(dmgo.class, dmgoVar);
    }

    private dmgo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmgo();
            }
            if (i2 == 4) {
                return new dmgn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgo> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmgo.class) {
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
