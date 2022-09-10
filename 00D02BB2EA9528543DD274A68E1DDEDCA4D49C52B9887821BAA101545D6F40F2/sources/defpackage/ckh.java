package defpackage;
/* compiled from: PG */
/* renamed from: ckh  reason: default package */
/* loaded from: classes4.dex */
public final class ckh extends dsqw<ckh, ckg> implements dssk {
    public static final ckh g;
    private static volatile dssr<ckh> h;
    public int a;
    public boolean c;
    public String b = "";
    public String d = "";
    public String e = "";
    public dsrj<ckq> f = dssu.b;

    static {
        ckh ckhVar = new ckh();
        g = ckhVar;
        dsqw.cc(ckh.class, ckhVar);
    }

    private ckh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0007\u001b", new Object[]{"a", "b", "c", "d", "e", "f", ckq.class});
            }
            if (i2 == 3) {
                return new ckh();
            }
            if (i2 == 4) {
                return new ckg();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckh> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ckh.class) {
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
