package defpackage;
/* compiled from: PG */
/* renamed from: ddpg  reason: default package */
/* loaded from: classes.dex */
public final class ddpg extends dsqw<ddpg, ddpb> implements dssk {
    public static final ddpg j;
    private static volatile dssr<ddpg> k;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    public boolean i;

    static {
        ddpg ddpgVar = new ddpg();
        j = ddpgVar;
        dsqw.cc(ddpg.class, ddpgVar);
    }

    private ddpg() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0002!\b\u0000\u0000\u0000\u0002င\u0006\bဌ\u0013\tဌ\u0014\nင\u0002\fဇ\u0017\u001bင\u0001\u001fင\u0004!ဂ\t", new Object[]{"a", "e", "g", ddpe.a, "h", ddpc.a, "c", "i", "b", "d", "f"});
            }
            if (i2 == 3) {
                return new ddpg();
            }
            if (i2 == 4) {
                return new ddpb();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddpg> dssrVar = k;
            if (dssrVar == null) {
                synchronized (ddpg.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
