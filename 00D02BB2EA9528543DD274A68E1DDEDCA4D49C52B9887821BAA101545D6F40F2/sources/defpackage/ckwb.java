package defpackage;
/* compiled from: PG */
/* renamed from: ckwb  reason: default package */
/* loaded from: classes5.dex */
public final class ckwb extends dsqw<ckwb, ckwa> implements dssk {
    public static final ckwb f;
    private static volatile dssr<ckwb> g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public ckvz e;

    static {
        ckwb ckwbVar = new ckwb();
        f = ckwbVar;
        dsqw.cc(ckwb.class, ckwbVar);
    }

    private ckwb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ckwb();
            }
            if (i2 == 4) {
                return new ckwa();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ckwb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
