package defpackage;
/* compiled from: PG */
/* renamed from: dmob  reason: default package */
/* loaded from: classes6.dex */
public final class dmob extends dsqw<dmob, dmoa> implements dssk {
    public static final dmob g;
    private static volatile dssr<dmob> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        dmob dmobVar = new dmob();
        g = dmobVar;
        dsqw.cc(dmob.class, dmobVar);
    }

    private dmob() {
    }

    public static dmoa b() {
        return g.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dmob();
            }
            if (i2 == 4) {
                return new dmoa();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmob> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmob.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
