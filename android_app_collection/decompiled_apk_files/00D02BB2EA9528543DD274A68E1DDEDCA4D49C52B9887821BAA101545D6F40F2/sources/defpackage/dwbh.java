package defpackage;
/* compiled from: PG */
/* renamed from: dwbh  reason: default package */
/* loaded from: classes6.dex */
public final class dwbh extends dsqw<dwbh, dwbe> implements dssk {
    public static final dwbh g;
    private static volatile dssr<dwbh> h;
    public int a;
    public dwbg b;
    public dwbg c;
    public dspd d = dspd.b;
    public dspd e = dspd.b;
    public boolean f;

    static {
        dwbh dwbhVar = new dwbh();
        g = dwbhVar;
        dsqw.cc(dwbh.class, dwbhVar);
    }

    private dwbh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ည\u0002\u0005ည\u0003\u0006ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dwbh();
            }
            if (i2 == 4) {
                return new dwbe();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwbh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dwbh.class) {
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
