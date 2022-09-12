package defpackage;
/* compiled from: PG */
/* renamed from: bpua  reason: default package */
/* loaded from: classes4.dex */
public final class bpua extends dsqw<bpua, bptx> implements dssk {
    public static final bpua g;
    private static volatile dssr<bpua> h;
    public int a;
    public bokm b;
    public bokm c;
    public dsrj<dpsn> d = dssu.b;
    public dpsn e;
    public int f;

    static {
        bpua bpuaVar = new bpua();
        g = bpuaVar;
        dsqw.cc(bpua.class, bpuaVar);
    }

    private bpua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", "c", "d", dpsn.class, "e", "f", bptz.c()});
            }
            if (i2 == 3) {
                return new bpua();
            }
            if (i2 == 4) {
                return new bptx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bpua> dssrVar = h;
            if (dssrVar == null) {
                synchronized (bpua.class) {
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
