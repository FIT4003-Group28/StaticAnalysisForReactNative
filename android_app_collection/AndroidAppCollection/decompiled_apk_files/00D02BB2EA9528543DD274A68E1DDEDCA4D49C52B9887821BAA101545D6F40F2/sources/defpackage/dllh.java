package defpackage;
/* compiled from: PG */
/* renamed from: dllh  reason: default package */
/* loaded from: classes6.dex */
public final class dllh extends dsqw<dllh, dllg> implements dssk {
    public static final dllh g;
    private static volatile dssr<dllh> h;
    public int a;
    public dvzn c;
    public String b = "";
    public int d = -1;
    public int e = 1212696648;
    public int f = -12040120;

    static {
        dllh dllhVar = new dllh();
        g = dllhVar;
        dsqw.cc(dllh.class, dllhVar);
    }

    private dllh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dllh();
            }
            if (i2 == 4) {
                return new dllg();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dllh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dllh.class) {
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
