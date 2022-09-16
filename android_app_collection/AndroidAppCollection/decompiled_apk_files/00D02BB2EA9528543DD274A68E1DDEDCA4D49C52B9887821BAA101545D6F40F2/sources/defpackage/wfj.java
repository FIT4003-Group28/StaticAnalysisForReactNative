package defpackage;
/* compiled from: PG */
/* renamed from: wfj  reason: default package */
/* loaded from: classes7.dex */
public final class wfj extends dsqw<wfj, wfg> implements dssk {
    public static final wfj g;
    private static volatile dssr<wfj> h;
    public int a;
    public dsrj<wfi> b = dssu.b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    static {
        wfj wfjVar = new wfj();
        g = wfjVar;
        dsqw.cc(wfj.class, wfjVar);
    }

    private wfj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"a", "b", wfi.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new wfj();
            }
            if (i2 == 4) {
                return new wfg();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<wfj> dssrVar = h;
            if (dssrVar == null) {
                synchronized (wfj.class) {
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
        dsrj<wfi> dsrjVar = this.b;
        if (!dsrjVar.a()) {
            this.b = dsqw.cl(dsrjVar);
        }
    }
}
