package defpackage;
/* compiled from: PG */
/* renamed from: dops  reason: default package */
/* loaded from: classes.dex */
public final class dops extends dsqw<dops, dopp> implements dssk {
    public static final dops g;
    private static volatile dssr<dops> h;
    public int a;
    public int b;
    public int c;
    public int d;
    public dsrf e = dsqz.b;
    public boolean f;

    static {
        dops dopsVar = new dops();
        g = dopsVar;
        dsqw.cc(dops.class, dopsVar);
    }

    private dops() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004ဌ\u0002\u0005\u001e\u0006ဇ\u0003", new Object[]{"a", "b", "c", "d", dopq.a, "e", dooj.c(), "f"});
            }
            if (i2 == 3) {
                return new dops();
            }
            if (i2 == 4) {
                return new dopp();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dops> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dops.class) {
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

    public final void b() {
        dsrf dsrfVar = this.e;
        if (!dsrfVar.a()) {
            this.e = dsqw.cg(dsrfVar);
        }
    }
}
