package defpackage;
/* compiled from: PG */
/* renamed from: dobq  reason: default package */
/* loaded from: classes6.dex */
public final class dobq extends dsqw<dobq, dobn> implements dssk {
    public static final dobq g;
    private static volatile dssr<dobq> i;
    public Object b;
    public int f;
    private int h;
    public int a = 0;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dobq dobqVar = new dobq();
        g = dobqVar;
        dsqw.cc(dobq.class, dobqVar);
    }

    private dobq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ြ\u0000\u0007ဌ\u0006", new Object[]{"b", "a", "h", dobo.a, "c", "d", "e", dczv.class, "f", dobl.a});
            }
            if (i3 == 3) {
                return new dobq();
            }
            if (i3 == 4) {
                return new dobn();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dobq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dobq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
