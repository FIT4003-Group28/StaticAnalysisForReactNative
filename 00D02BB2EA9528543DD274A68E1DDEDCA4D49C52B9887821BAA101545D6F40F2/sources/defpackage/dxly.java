package defpackage;
/* compiled from: PG */
/* renamed from: dxly  reason: default package */
/* loaded from: classes6.dex */
public final class dxly extends dsqw<dxly, dxlx> implements dssk {
    public static final dxly g;
    private static volatile dssr<dxly> h;
    public dxwi a;
    public long c;
    public long d;
    public int e;
    public dsrj<dxmq> b = dssu.b;
    public String f = "";

    static {
        dxly dxlyVar = new dxly();
        g = dxlyVar;
        dsqw.cc(dxly.class, dxlyVar);
    }

    private dxly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\u001b\u0003\u0002\u0004\u0002\u0005\u0004\u0006Ȉ", new Object[]{"a", "b", dxmq.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dxly();
            }
            if (i2 == 4) {
                return new dxlx();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dxly> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dxly.class) {
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
